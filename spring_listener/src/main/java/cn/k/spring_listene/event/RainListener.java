package cn.k.spring_listene.event;

public class RainListener implements  WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {

        if(weatherEvent instanceof  RainEvent){
            System.out.println("hello rain"+weatherEvent.getWeather());
        }
    }
}
