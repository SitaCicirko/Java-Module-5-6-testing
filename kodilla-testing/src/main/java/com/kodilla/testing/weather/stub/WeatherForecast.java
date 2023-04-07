package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double AverageTemperature(){
        Collection<Double> average = temperatures.getTemperatures().values();
        double sum = 0;
        for (Double av : average){
            sum += av;
        }
        return sum / average.size();
    }
    public double MedianTemperature(){
        Collection<Double> median = temperatures.getTemperatures().values();
        List<Double> medians = new ArrayList<>(median);
        Collections.sort(medians);

        int size = medians.size();
        int mid = size / 2;
        if (size % 2 == 0){
            return (medians.get(mid - 1) + medians.get(mid)) / 2;
        }else  {
            return medians.get(mid);
        }
    }
}