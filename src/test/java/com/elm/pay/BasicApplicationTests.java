package com.elm.pay;

import com.elm.pay.rest.request.cashOut.Header;
import com.elm.pay.rest.request.cashOut.CashOutRequest;
import com.elm.pay.rest.request.cashOut.Request;
import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {

    @Autowired
    private CashOutJMSSender cashOutJMSSender;

    @Test
    public void tesTsend() throws Exception {
        
        Header header = new Header();
        header.setRequestId("12234");
        header.setRequestDate(new Date());
        Request request = new Request();
        request.setWallaetReffrence("wallet-cocowawa");
        CashOutRequest cashOutRequest = new CashOutRequest();
        cashOutRequest.setHeader(header);
        cashOutRequest.setRequest(request);
        cashOutJMSSender.sendTOQueue(cashOutRequest);
    }

}
