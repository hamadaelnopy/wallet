/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.pay.rest.request.cashOut;

import java.util.Date;


/**
 *
 * @author hyousef
 */

public class Request {
    private String wallaetReffrence;
    private String transactionReffrence;
    private String reciverBanlCode;
    private String currencyCode;
    private Float amount;
    private String reciverAccoubntNumber;
    private String reciverName;
    private Long wallaetUserId;
    private Date transactionDate;
    private String note;
    

    public String getWallaetReffrence() {
        return wallaetReffrence;
    }

    public void setWallaetReffrence(String wallaetReffrence) {
        this.wallaetReffrence = wallaetReffrence;
    }

    public String getTransactionReffrence() {
        return transactionReffrence;
    }

    public void setTransactionReffrence(String transactionReffrence) {
        this.transactionReffrence = transactionReffrence;
    }

    public String getReciverBanlCode() {
        return reciverBanlCode;
    }

    public void setReciverBanlCode(String reciverBanlCode) {
        this.reciverBanlCode = reciverBanlCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getReciverAccoubntNumber() {
        return reciverAccoubntNumber;
    }

    public void setReciverAccoubntNumber(String reciverAccoubntNumber) {
        this.reciverAccoubntNumber = reciverAccoubntNumber;
    }

    public String getReciverName() {
        return reciverName;
    }

    public void setReciverName(String reciverName) {
        this.reciverName = reciverName;
    }

    public Long getWallaetUserId() {
        return wallaetUserId;
    }

    public void setWallaetUserId(Long wallaetUserId) {
        this.wallaetUserId = wallaetUserId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Request{" + "wallaetReffrence=" + wallaetReffrence + ", transactionReffrence=" + transactionReffrence + ", reciverBanlCode=" + reciverBanlCode + ", currencyCode=" + currencyCode + ", amount=" + amount + ", reciverAccoubntNumber=" + reciverAccoubntNumber + ", reciverName=" + reciverName + ", wallaetUserId=" + wallaetUserId + ", transactionDate=" + transactionDate + ", note=" + note + '}';
    }
    
}
