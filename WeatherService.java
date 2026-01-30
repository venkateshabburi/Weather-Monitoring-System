package com.weather.app;

import java.sql.CallableStatement;
import java.sql.Connection;

public class WeatherService {

    public static void saveWeather(
            String city,
            int temperature,
            int humidity,
            String condition) throws Exception {

        Connection con = DBConnection.getConnection();

        CallableStatement cs =
            con.prepareCall("{call insert_weather(?,?,?,?)}");

        cs.setString(1, city);
        cs.setInt(2, temperature);
        cs.setInt(3, humidity);
        cs.setString(4, condition);

        cs.execute();
        con.close();
    }
}
