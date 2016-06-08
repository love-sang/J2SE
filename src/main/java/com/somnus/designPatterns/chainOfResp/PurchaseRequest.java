package com.somnus.designPatterns.chainOfResp;
/**
 * 
 *@Project:J2SE
 *@class:PurchaseRequest
 *@descript:
 *@date:2016年6月8日 下午4:43:34
 *@author San
 *@version:V1.0
 */
// 采购单：请求类
class PurchaseRequest {
    /*采购金额*/
    private double amount;
    /*采购单编号*/
    private int number;
    /*采购目的*/
    private String purpose; 

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return this.purpose;
    }
}
