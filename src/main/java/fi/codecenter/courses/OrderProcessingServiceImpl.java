/*
 * $Id$
 * Copyright (c) Codecenter Oy. All rights reserved.
 *
 * This software is the proprietary information of Codecenter Oy.
 * Use is subject to license terms.
 */
package fi.codecenter.courses;

public class OrderProcessingServiceImpl implements OrderProcessingService {
    @Override
    public void createOrder(Order order) {
        System.out.println("createOrder: order=" + order);
    }

    @Override
    public void updateOrderStatus(int id, OrderStatus newStatus) {
        System.out.println("updateOrderStatus: id=" + id + " newStatus="
                + newStatus);
    }
}
