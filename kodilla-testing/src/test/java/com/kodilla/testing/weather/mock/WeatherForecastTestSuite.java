package com.kodilla.testing.weather.mock;                                        // [1]

import com.kodilla.testing.weather.stub.Temperatures;                            // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                         // [3]
import org.junit.jupiter.api.Assertions;                                         // [4]
import org.junit.jupiter.api.Test;                                               // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;                                          // [9]

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {                                                 // [10]
    @Mock
    private Temperatures temperaturesMock;
    @Test                                                                         // [11]
    void testCalculateForecastWithMock() {                                        // [12]
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.AverageTemperature();
        //Then
        Assertions.assertEquals(25.56, average, 0.01);
    }
    @Test
    void testMedianTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.MedianTemperature();
        //Then
        Assertions.assertEquals(25.5, median, 0.01);
    }
}