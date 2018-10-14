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
public class Header {
    private String requestId;
    private String token;
    private Date requestDate;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "Header{" + "requestId=" + requestId + ", token=" + token + ", requestDate=" + requestDate + '}';
    }
}
