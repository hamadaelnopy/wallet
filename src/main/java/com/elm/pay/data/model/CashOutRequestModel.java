/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.pay.data.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hyousef
 */
@Entity
@Table(name = "TBLRequestCashOut")
@XmlRootElement
public class CashOutRequestModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RequestCashOutID")
    private UUID cashOutRequestModelID;
    @Basic(optional = false)
    @Column(name = "RequestCashOutRequestID")
    private UUID requestCashOutRequestID;
    @Column(name = "RequestCashOutDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestCashOutDate;
    @Basic(optional = false)
    @Column(name = "RequestCashOutRequestToken")
    private String requestCashOutRequestToken;
    @Basic(optional = false)
    @Column(name = "RequestCashOutWalletReference")
    private UUID requestCashOutWalletReference;
    @Basic(optional = false)
    @Column(name = "RequestCashOutTransactionReference")
    private String requestCashOutTransactionReference;
    @Basic(optional = false)
    @Column(name = "RequestCashOutRecieverBankCode")
    private String requestCashOutRecieverBankCode;
    @Basic(optional = false)
    @Column(name = "RequestCashOutUserUniqueID")
    private String requestCashOutUserUniqueID;
    @Column(name = "RequestCashOutCurrency")
    private String requestCashOutCurrency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "RequestCashOutAmount")
    private BigDecimal requestCashOutAmount;
    @Basic(optional = false)
    @Column(name = "RequestCashOutRecieverAccountNumber")
    private String requestCashOutRecieverAccountNumber;
    @Basic(optional = false)
    @Column(name = "RequestCashOutRecieverName")
    private String requestCashOutRecieverName;
    @Column(name = "RequestCashOutRecieverNote")
    private String requestCashOutRecieverNote;
    @Column(name = "RequestCashOutRequestFilePath")
    private String requestCashOutRequestFilePath;
    @Column(name = "RequestCashOutResponseFilePath")
    private String requestCashOutResponseFilePath;
    @Column(name = "RequestCashOutResonseResultCode")
    private Integer requestCashOutResonseResultCode;
    @Column(name = "RequestCashOutResponseResultMessage")
    private String requestCashOutResponseResultMessage;

    public CashOutRequestModel() {
    }

    public CashOutRequestModel(UUID cashOutRequestModelID) {
        this.cashOutRequestModelID = cashOutRequestModelID;
    }

    public CashOutRequestModel(UUID requestCashOutID, UUID requestCashOutRequestID, String requestCashOutRequestToken, UUID requestCashOutWalletReference, String requestCashOutTransactionReference, String requestCashOutRecieverBankCode, String requestCashOutUserUniqueID, BigDecimal requestCashOutAmount, String requestCashOutRecieverAccountNumber, String requestCashOutRecieverName) {
        this.cashOutRequestModelID = requestCashOutID;
        this.requestCashOutRequestID = requestCashOutRequestID;
        this.requestCashOutRequestToken = requestCashOutRequestToken;
        this.requestCashOutWalletReference = requestCashOutWalletReference;
        this.requestCashOutTransactionReference = requestCashOutTransactionReference;
        this.requestCashOutRecieverBankCode = requestCashOutRecieverBankCode;
        this.requestCashOutUserUniqueID = requestCashOutUserUniqueID;
        this.requestCashOutAmount = requestCashOutAmount;
        this.requestCashOutRecieverAccountNumber = requestCashOutRecieverAccountNumber;
        this.requestCashOutRecieverName = requestCashOutRecieverName;
    }

    public UUID getRequestCashOutRequestID() {
        return requestCashOutRequestID;
    }

    public void setRequestCashOutRequestID(UUID requestCashOutRequestID) {
        this.requestCashOutRequestID = requestCashOutRequestID;
    }

    public Date getRequestCashOutDate() {
        return requestCashOutDate;
    }

    public void setRequestCashOutDate(Date requestCashOutDate) {
        this.requestCashOutDate = requestCashOutDate;
    }

    public String getRequestCashOutRequestToken() {
        return requestCashOutRequestToken;
    }

    public void setRequestCashOutRequestToken(String requestCashOutRequestToken) {
        this.requestCashOutRequestToken = requestCashOutRequestToken;
    }

    public String getRequestCashOutTransactionReference() {
        return requestCashOutTransactionReference;
    }

    public void setRequestCashOutTransactionReference(String requestCashOutTransactionReference) {
        this.requestCashOutTransactionReference = requestCashOutTransactionReference;
    }

    public String getRequestCashOutRecieverBankCode() {
        return requestCashOutRecieverBankCode;
    }

    public void setRequestCashOutRecieverBankCode(String requestCashOutRecieverBankCode) {
        this.requestCashOutRecieverBankCode = requestCashOutRecieverBankCode;
    }

    public String getRequestCashOutUserUniqueID() {
        return requestCashOutUserUniqueID;
    }

    public void setRequestCashOutUserUniqueID(String requestCashOutUserUniqueID) {
        this.requestCashOutUserUniqueID = requestCashOutUserUniqueID;
    }

    public String getRequestCashOutCurrency() {
        return requestCashOutCurrency;
    }

    public void setRequestCashOutCurrency(String requestCashOutCurrency) {
        this.requestCashOutCurrency = requestCashOutCurrency;
    }

    public BigDecimal getRequestCashOutAmount() {
        return requestCashOutAmount;
    }

    public void setRequestCashOutAmount(BigDecimal requestCashOutAmount) {
        this.requestCashOutAmount = requestCashOutAmount;
    }

    public String getRequestCashOutRecieverAccountNumber() {
        return requestCashOutRecieverAccountNumber;
    }

    public void setRequestCashOutRecieverAccountNumber(String requestCashOutRecieverAccountNumber) {
        this.requestCashOutRecieverAccountNumber = requestCashOutRecieverAccountNumber;
    }

    public String getRequestCashOutRecieverName() {
        return requestCashOutRecieverName;
    }

    public void setRequestCashOutRecieverName(String requestCashOutRecieverName) {
        this.requestCashOutRecieverName = requestCashOutRecieverName;
    }

    public String getRequestCashOutRecieverNote() {
        return requestCashOutRecieverNote;
    }

    public void setRequestCashOutRecieverNote(String requestCashOutRecieverNote) {
        this.requestCashOutRecieverNote = requestCashOutRecieverNote;
    }

    public String getRequestCashOutRequestFilePath() {
        return requestCashOutRequestFilePath;
    }

    public void setRequestCashOutRequestFilePath(String requestCashOutRequestFilePath) {
        this.requestCashOutRequestFilePath = requestCashOutRequestFilePath;
    }

    public String getRequestCashOutResponseFilePath() {
        return requestCashOutResponseFilePath;
    }

    public void setRequestCashOutResponseFilePath(String requestCashOutResponseFilePath) {
        this.requestCashOutResponseFilePath = requestCashOutResponseFilePath;
    }

    public Integer getRequestCashOutResonseResultCode() {
        return requestCashOutResonseResultCode;
    }

    public void setRequestCashOutResonseResultCode(Integer requestCashOutResonseResultCode) {
        this.requestCashOutResonseResultCode = requestCashOutResonseResultCode;
    }

    public String getRequestCashOutResponseResultMessage() {
        return requestCashOutResponseResultMessage;
    }

    public void setRequestCashOutResponseResultMessage(String requestCashOutResponseResultMessage) {
        this.requestCashOutResponseResultMessage = requestCashOutResponseResultMessage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cashOutRequestModelID != null ? cashOutRequestModelID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CashOutRequestModel)) {
            return false;
        }
        CashOutRequestModel other = (CashOutRequestModel) object;
        if ((this.cashOutRequestModelID == null && other.cashOutRequestModelID != null) || (this.cashOutRequestModelID != null && !this.cashOutRequestModelID.equals(other.cashOutRequestModelID))) {
            return false;
        }
        return true;
    }

   

    public UUID getCashOutRequestModelID() {
        return cashOutRequestModelID;
    }

    public void setCashOutRequestModelID(UUID requestCashOutID) {
        this.cashOutRequestModelID = requestCashOutID;
    }

    public UUID getRequestCashOutWalletReference() {
        return requestCashOutWalletReference;
    }

    public void setRequestCashOutWalletReference(UUID requestCashOutWalletReference) {
        this.requestCashOutWalletReference = requestCashOutWalletReference;
    }

    @Override
    public String toString() {
        return "RequestCashOut{" + "requestCashOutID=" + cashOutRequestModelID + ", requestCashOutRequestID=" + requestCashOutRequestID + ", requestCashOutDate=" + requestCashOutDate + ", requestCashOutRequestToken=" + requestCashOutRequestToken + ", requestCashOutWalletReference=" + requestCashOutWalletReference + ", requestCashOutTransactionReference=" + requestCashOutTransactionReference + ", requestCashOutRecieverBankCode=" + requestCashOutRecieverBankCode + ", requestCashOutUserUniqueID=" + requestCashOutUserUniqueID + ", requestCashOutCurrency=" + requestCashOutCurrency + ", requestCashOutAmount=" + requestCashOutAmount + ", requestCashOutRecieverAccountNumber=" + requestCashOutRecieverAccountNumber + ", requestCashOutRecieverName=" + requestCashOutRecieverName + ", requestCashOutRecieverNote=" + requestCashOutRecieverNote + ", requestCashOutRequestFilePath=" + requestCashOutRequestFilePath + ", requestCashOutResponseFilePath=" + requestCashOutResponseFilePath + ", requestCashOutResonseResultCode=" + requestCashOutResonseResultCode + ", requestCashOutResponseResultMessage=" + requestCashOutResponseResultMessage + '}';
    }
    
}
