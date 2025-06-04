package com.PowerPay360.PowerPay.Controller;


import com.PowerPay360.PowerPay.Entity.BillDetails;
import com.PowerPay360.PowerPay.Entity.GenerateBillRequest;
import com.PowerPay360.PowerPay.Services.BillDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bill")
public class BillDetailsController {

    private final BillDetailsService billDetailsService;

    @Autowired
    public BillDetailsController(BillDetailsService billDetailsService) {
        this.billDetailsService = billDetailsService;
    }

    @GetMapping("/details")
    public ResponseEntity<List<BillDetails>> getBillDetails(
            @RequestParam("serviceRequestNo") String serviceRequestNo) {
        List<BillDetails> billDetails = billDetailsService.getBillDetails(serviceRequestNo);
        return ResponseEntity.ok(billDetails);
    }
    @GetMapping(path = "/")
    public String greet(){
        return "hello world";
    }

    @PutMapping("/payment")
    public ResponseEntity<String> doPayment(
            @RequestParam("id") Long id,
            @RequestParam("amount") String amount) {
        String result = billDetailsService.doPayment(id, amount);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateBill(@RequestBody GenerateBillRequest request) {
        String result = billDetailsService.generateBill(request);
        return ResponseEntity.ok(result);
    }
}
