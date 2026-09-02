package org.kdklearns;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CartService /*implements InitializingBean, DisposableBean*/ {

    private final HashMap<Integer, String> map;

    public CartService() {
        System.out.println("CartService constructor called");
        map = new HashMap<>();
    }

    @PostConstruct
    public void initializeBean() {
        System.out.println("Inside @PostConstruct method");
        map.put(1, "Jitu");
        map.put(2, "Neetu");
    }


//    public void preUse() {
//        System.out.println("Inside preUse method");
//        map.put(1, "Jitu");
//        map.put(2, "Neetu");
//    }

    public void addToCart() {
        System.out.println("Products added to cart");
    }

    public String getValue(int key) {
        return map.getOrDefault(key, "default");
    }

//    @Override
//    public void destroy() {
//        map.clear();
//        System.out.println("Disposable Bean destroy method called");
//    }

    public void preDestroy() {
        map.clear();
        System.out.println("App config destroy method called");
    }

    @PreDestroy
    public void destroy() {
        map.clear();
        System.out.println("@PreDestroy method called");
    }
}
