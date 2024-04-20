package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        double frete = 0.0;

        if (order.getBasic() < 100.0) {
            frete = 20.0;
        } else if (order.getBasic() < 200.0) {
            frete = 12.0;
        }

        return frete;
    }
}
