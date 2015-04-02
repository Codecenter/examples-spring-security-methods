/*
 * $Id$
 * Copyright (c) Codecenter Oy. All rights reserved.
 *
 * This software is the proprietary information of Codecenter Oy.
 * Use is subject to license terms.
 */
package fi.codecenter.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderProcessingController {
    @Autowired
    private OrderProcessingService orderProcessingService;

    @RequestMapping("/")
    public String home() {
        return "/index";
    }

    @RequestMapping("/create")
    public String createOrder() {
        Order order = new Order();
        orderProcessingService.createOrder(order);
        return "success";
    }

    @RequestMapping("/updateStatus")
    public String updateOrderStatus() {
        orderProcessingService.updateOrderStatus(123, OrderStatus.IN_PROGRESS);
        return "success";
    }
}
