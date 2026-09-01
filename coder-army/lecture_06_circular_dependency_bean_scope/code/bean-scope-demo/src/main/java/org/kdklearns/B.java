package org.kdklearns;

import org.springframework.stereotype.Component;

@Component
public class B {

    private final OrderService order;

    public B(OrderService order) {
        this.order = order;
    }
}
