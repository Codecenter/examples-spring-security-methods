/*
 * $Id$
 * Copyright (c) Codecenter Oy. All rights reserved.
 *
 * This software is the proprietary information of Codecenter Oy.
 * Use is subject to license terms.
 */
package fi.codecenter.courses;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.prepost.PreAuthorize;

public interface OrderProcessingService {
    @PreAuthorize("isAuthenticated()")
    void createOrder(Order order);

    @RolesAllowed("ROLE_MANAGER")
    void updateOrderStatus(int id, OrderStatus newStatus);
}
