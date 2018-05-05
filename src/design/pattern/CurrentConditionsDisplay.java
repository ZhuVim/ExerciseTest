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

import java.util.Observable;
import java.util.Observer;

/**
 * @Type CurrentConditionsDisplay.java
 * @Desc 
 * @author zhuwuming
 * @date 2018年5月4日 上午11:13:31
 * @version 
 */
public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    Observable observable;

    public CurrentConditionsDisplay(Observable o) {
        observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = ((WeatherData) weatherData).getTemperature();
            this.humidity = ((WeatherData) weatherData).getHumidity();
            this.pressure = ((WeatherData) weatherData).getPressure();
            display();
        }

    }

    private void display() {
        System.out.println("temperature" + temperature + "\n" + "humidity" + humidity + "\n"
                + "pressure" + pressure + "\n");
    }

    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        CurrentConditionsDisplay observer = new CurrentConditionsDisplay(observable);
        observable.addObserver(observer);
        observable.setMesurement(22222, 333333, 444444);
        observable.notifyObservers();
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
