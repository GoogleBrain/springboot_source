package cn.k.spring_listene.event;

public class SnowEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "snow.....";
    }
}
