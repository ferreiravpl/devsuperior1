package com.javaspringprofessional.desafio1.services;

import com.javaspringprofessional.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        Double discountValue = order.getBasic() * order.getDiscount() / 100.00;
        return order.getBasic() - discountValue + shippingService.shipment(order);
    }
}
