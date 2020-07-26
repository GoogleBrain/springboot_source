package cn.k.spring_listene.event;

public class SnowListener implements  WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        if(weatherEvent instanceof  SnowEvent){
            System.out.println("hello snow"+weatherEvent.getWeather());
        }
    }
}
