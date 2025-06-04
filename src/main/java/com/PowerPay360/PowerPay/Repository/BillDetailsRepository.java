package com.PowerPay360.PowerPay.Repository;

import com.PowerPay360.PowerPay.Entity.BillDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillDetailsRepository extends JpaRepository<BillDetails, Long> {
    List<BillDetails> findByServiceRequestNoAndPaymentDone(String serviceRequestNo, String paymentDone);

}
