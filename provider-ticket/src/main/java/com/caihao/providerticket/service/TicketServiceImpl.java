package com.caihao.providerticket.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author CaiHao
 * @create 2019-09-08 18:34:03
 */
@Service//将服务发布出去
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《西游记》";
    }
}
