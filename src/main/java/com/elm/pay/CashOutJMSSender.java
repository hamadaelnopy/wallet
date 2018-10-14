/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elm.pay;

import com.elm.pay.rest.request.cashOut.CashOutRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author hyousef
 */
@Component
public class CashOutJMSSender {

    @Autowired
    JmsTemplate jmsTemplate;
    
    @Value("${cash-out-queue}")
    private String cashOutQueue;

    public void sendTOQueue(CashOutRequest cashOutMessage) {
        jmsTemplate.convertAndSend(cashOutQueue,cashOutMessage);
    }
}
