package com.PowerPay360.PowerPay.Entity;

public class GenerateBillRequest {

    private String serviceRequestNo;
    private int totalUnit;
    private String billDate;

    public String getServiceRequestNo() {
        return serviceRequestNo;
    }

    public void setServiceRequestNo(String serviceRequestNo) {
        this.serviceRequestNo = serviceRequestNo;
    }

    public int getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(int totalUnit) {
        this.totalUnit = totalUnit;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }


}
