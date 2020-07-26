package cn.k.spring_listene.event;

public interface EventMulticaster {

    void mulcaseEvent(WeatherEvent weatherEvent);
    void addListerer(WeatherListener weatherListener);
    void delListener(WeatherListener weatherListener);
}
