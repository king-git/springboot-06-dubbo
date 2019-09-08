package com.caihao.consumeruser.service;

import com.caihao.providerticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author CaiHao
 * @create 2019-09-08 18:38:37
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;
    
    public void hello(){
        String ticket = ticketService.getTicket();
        System.err.println("ticket======"+ticket);
    }
    

}
