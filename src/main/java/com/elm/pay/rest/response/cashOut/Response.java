/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.pay.rest.response.cashOut;

/**
 *
 * @author hyousef
 */
public class Response {
  
    private int responseCode;
    private String responseMessage;
    private Long walletRefrence;
    private Long transactionRefrence;
    private Long walletUserId;
    
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Long getWalletRefrence() {
        return walletRefrence;
    }

    public void setWalletRefrence(Long walletRefrence) {
        this.walletRefrence = walletRefrence;
    }

    public Long getTransactionRefrence() {
        return transactionRefrence;
    }

    public void setTransactionRefrence(Long transactionRefrence) {
        this.transactionRefrence = transactionRefrence;
    }

    public Long getWalletUserId() {
        return walletUserId;
    }

    public void setWalletUserId(Long walletUserId) {
        this.walletUserId = walletUserId;
    }

    
}
