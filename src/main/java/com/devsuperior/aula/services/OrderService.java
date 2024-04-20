package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Double total(Order order){
        return order.getBasic() * ( 1-order.getDiscount()/100);
    }
}
