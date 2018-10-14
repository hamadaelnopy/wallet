/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.pay.rest.response.cashOut;

import java.util.Date;

/**
 *
 * @author hyousef
 */
public class Header {

    private String responseId;
    private String relatedRequestId;
    private Date responseDate;

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getRelatedRequestId() {
        return relatedRequestId;
    }

    public void setRelatedRequestId(String relatedRequestId) {
        this.relatedRequestId = relatedRequestId;
    }

  

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    @Override
    public String toString() {
        return "Header{" + "responseId=" + responseId + ", relatedRequestId=" + relatedRequestId + ", responseDate=" + responseDate + '}';
    }

}
