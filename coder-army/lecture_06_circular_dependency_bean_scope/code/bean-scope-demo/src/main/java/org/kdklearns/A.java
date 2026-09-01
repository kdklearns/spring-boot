package org.kdklearns;

import org.springframework.stereotype.Component;

@Component
public class A {

    private final OrderService order;

    public A(OrderService order) {
        this.order = order;
    }
}
