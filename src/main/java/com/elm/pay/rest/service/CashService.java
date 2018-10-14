/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.pay.rest.service;

import com.elm.pay.CashOutJMSSender;
import com.elm.pay.data.model.CashOutRequestModel;
import com.elm.pay.data.repository.CashOutRequestRepository;
import com.elm.pay.rest.request.cashOut.CashOutRequest;
import com.elm.pay.rest.response.cashOut.Header;
import com.elm.pay.rest.response.cashOut.CashOutResponse;
import com.elm.pay.rest.response.cashOut.Response;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hyousef
 */
@RestController
@RequestMapping("/services/cash")
public class CashService {

    @Autowired
    private CashOutJMSSender cashOutJMSSender;

    @Autowired
    private CashOutRequestRepository cashOutRequestRepository;
    
    @PostMapping(value = "/cashOut", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public CashOutResponse cashOut(@RequestBody CashOutRequest cashOutRequest) {
        cashOutJMSSender.sendTOQueue(cashOutRequest);
    
        CashOutRequestModel cashOutRequestModel = new CashOutRequestModel();
        cashOutRequestModel.setRequestCashOutAmount(BigDecimal.valueOf(cashOutRequest.getRequest().getAmount()));
        
        cashOutRequestModel.setRequestCashOutCurrency(cashOutRequest.getRequest().getCurrencyCode());
        cashOutRequestModel.setRequestCashOutDate(new Date());
        cashOutRequestModel.setRequestCashOutRecieverAccountNumber(cashOutRequest.getRequest().getReciverAccoubntNumber());
        cashOutRequestModel.setRequestCashOutRecieverBankCode(cashOutRequest.getRequest().getReciverBanlCode());
        cashOutRequestModel.setRequestCashOutRecieverName(cashOutRequest.getRequest().getReciverName());
        cashOutRequestModel.setRequestCashOutRecieverNote(cashOutRequest.getRequest().getNote());
        cashOutRequestModel.setRequestCashOutRequestID(UUID.fromString(cashOutRequest.getHeader().getRequestId()));
        cashOutRequestModel.setRequestCashOutRequestToken(cashOutRequest.getHeader().getToken());
        cashOutRequestModel.setRequestCashOutUserUniqueID(cashOutRequest.getHeader().getRequestId());
        cashOutRequestModel.setRequestCashOutWalletReference(UUID.fromString(cashOutRequest.getRequest().getWallaetReffrence()));
        cashOutRequestModel.setRequestCashOutTransactionReference(cashOutRequest.getRequest().getTransactionReffrence());
        cashOutRequestRepository.save(cashOutRequestModel);
        CashOutResponse cashOutResponse = new CashOutResponse();
        Header header = new Header();
        header.setResponseId("1111");
        header.setResponseDate(new Date());
        cashOutResponse.setHeader(header);
        Response response = new Response();
        response.setResponseCode(1);
        response.setResponseMessage("Succsess");
        cashOutResponse.setResponse(response);
        return cashOutResponse;
        
        
    }
}
