package com.PowerPay360.PowerPay.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Bill_details")
public class BillDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String serviceRequestNo;

    @Column
    private String billNo;

    @Column
    private LocalDate billCreationDate;

    @Column
    private LocalDate billDueDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceRequestNo() {
        return serviceRequestNo;
    }

    public void setServiceRequestNo(String serviceRequestNo) {
        this.serviceRequestNo = serviceRequestNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public LocalDate getBillCreationDate() {
        return billCreationDate;
    }

    public void setBillCreationDate(LocalDate billCreationDate) {
        this.billCreationDate = billCreationDate;
    }

    public LocalDate getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(LocalDate billDueDate) {
        this.billDueDate = billDueDate;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public double getBillAmountAfterDueDate() {
        return billAmountAfterDueDate;
    }

    public void setBillAmountAfterDueDate(double billAmountAfterDueDate) {
        this.billAmountAfterDueDate = billAmountAfterDueDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getBillPayment() {
        return billPayment;
    }

    public void setBillPayment(String billPayment) {
        this.billPayment = billPayment;
    }

    public String getPaymentDone() {
        return paymentDone;
    }

    public void setPaymentDone(String paymentDone) {
        this.paymentDone = paymentDone;
    }

    @Column
    private double billAmount;

    @Column
    private double billAmountAfterDueDate;

    @Column
    private LocalDate paymentDate;

    @Column
    private String billPayment;

    @Override
    public String toString() {
        return "Bill_details{" +
                "id=" + id +
                ", serviceRequestNo='" + serviceRequestNo + '\'' +
                ", billNo='" + billNo + '\'' +
                ", billCreationDate=" + billCreationDate +
                ", billDueDate=" + billDueDate +
                ", billAmount=" + billAmount +
                ", billAmountAfterDueDate=" + billAmountAfterDueDate +
                ", paymentDate=" + paymentDate +
                ", billPayment='" + billPayment + '\'' +
                ", paymentDone='" + paymentDone + '\'' +
                '}';
    }

    @Column
    private String paymentDone;
}
