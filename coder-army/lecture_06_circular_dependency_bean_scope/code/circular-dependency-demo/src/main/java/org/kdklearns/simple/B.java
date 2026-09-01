package org.kdklearns.simple;

public class B {
    private A a;

    public B() {
        System.out.println("B's constructor called");
        this.a = new A();
    }
}
