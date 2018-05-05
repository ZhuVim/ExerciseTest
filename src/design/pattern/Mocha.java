/*
 * Project: ProgramExercise
 * 
 * File Created at 2018年5月4日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package design.pattern;

/**
 * @Type Mocha.java
 * @Desc 
 * @author zhuwuming
 * @date 2018年5月4日 下午5:09:43
 * @version 
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        // TODO Auto-generated constructor stub
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return .20 + beverage.cost();
    }

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.err.println(beverage.getDescription() + " $" + beverage.cost() + "\n");

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年5月4日 zhuwuming creat
 */
