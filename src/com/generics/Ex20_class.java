package com.generics;

public class Ex20_class implements Ex20_interface {
    @Override
    public void f() {
        // TODO Auto-generated method stub
        System.out.println("f()调用了");
    }

    @Override
    public void x() {
        // TODO Auto-generated method stub
        System.out.println("x()调用了");
    }

    public void y() {
    }

    public <T extends Ex20_interface> void m(T t) {
        t.f();
        t.x();
    }

    public static void main(String[] args) {
        Ex20_class ex20_class = new Ex20_class();
        ex20_class.m(ex20_class);
    }
}
