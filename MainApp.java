package com.weather.app;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Temperature: ");
            int temp = sc.nextInt();

            System.out.print("Enter Humidity: ");
            int humidity = sc.nextInt();

            sc.nextLine(); // clear buffer
            System.out.print("Enter Condition: ");
            String condition = sc.nextLine();

            WeatherService.saveWeather(city, temp, humidity, condition);

            System.out.println("✅ Weather data saved successfully!");
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
