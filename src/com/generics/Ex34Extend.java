package com.generics;

import java.util.Date;

public class Ex34Extend extends Ex34SelfReturn<Ex34Extend> {

    @Override
    Ex34Extend get(Ex34Extend kind) {
        if (kind == null) {
            return this;
        }
        return kind;
    }

    public static void main(String[] args) {
        Ex34Extend ex34Extend = new Ex34Extend();
        System.out.println(ex34Extend == ex34Extend.test());
        Date da = new Date();
        System.out.println(da.getYear());
    }

}
