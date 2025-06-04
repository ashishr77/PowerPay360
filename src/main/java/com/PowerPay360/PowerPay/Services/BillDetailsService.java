package com.PowerPay360.PowerPay.Services;

import com.PowerPay360.PowerPay.Entity.BillDetails;
import com.PowerPay360.PowerPay.Entity.GenerateBillRequest;
import com.PowerPay360.PowerPay.Repository.BillDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BillDetailsService {

    @Autowired
    private BillDetailsRepository billDetailsRepository;

    public BillDetailsService(BillDetailsRepository billDetailsRepositoy) {
        this.billDetailsRepository = billDetailsRepository;
    }
    public List<BillDetails> getBillDetails(String serviceRequestNo) {
        return billDetailsRepository.findByServiceRequestNoAndPaymentDone(serviceRequestNo, "No");
    }

    public String doPayment(Long id, String amount) {
        BillDetails billDetails = billDetailsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bill Details does not exist."));

        billDetails.setBillPayment(amount);
        billDetails.setPaymentDate(LocalDate.now());
        billDetails.setPaymentDone("Yes");

        billDetailsRepository.save(billDetails);

        return "Bill payment is done successfully";
    }

    public String generateBill(GenerateBillRequest request) {
        int totalUnit = request.getTotalUnit();
        double totalBill = 0;

        if (totalUnit < 100) {
            totalBill = totalUnit * 7;
        } else if (totalUnit >= 100 && totalUnit < 500) {
            totalBill = totalUnit * 9;
        } else if (totalUnit >= 500) {
            totalBill = totalUnit * 12;
        }

        Random random = new Random();
        double perMonthBill = totalBill / 3;
        LocalDate billDueDate = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        List<BillDetails> billDetails = new ArrayList<>();

            BillDetails billDetail = new BillDetails();
            billDetail.setBillAmount(perMonthBill);
            billDetail.setBillAmountAfterDueDate(perMonthBill + 10);
            billDetail.setBillCreationDate(LocalDate.now());
            billDetail.setBillDueDate(billDueDate);
            billDetail.setBillNo("B_" + random.nextInt());
            billDetail.setServiceRequestNo(request.getServiceRequestNo());
            billDetail.setPaymentDone("No");

            billDueDate = billDueDate.plusMonths(1);

            billDetails.add(billDetail);

        billDetailsRepository.saveAll(billDetails);

        return "Bill generation is done successfully";
    }
}
