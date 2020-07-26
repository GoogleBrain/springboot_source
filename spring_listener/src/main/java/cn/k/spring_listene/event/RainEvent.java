package cn.k.spring_listene.event;

public class RainEvent extends  WeatherEvent {
    @Override
    public String getWeather() {
        return "rain....";
    }
}
