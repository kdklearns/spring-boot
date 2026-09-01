package org.kdklearns.simple;

public class A {
    private B b;

    public A() {
        System.out.println("A's constructor called");
        this.b = new B();
    }
}
