package cn.k.spring_listene.event;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractEventMulCast implements  EventMulticaster {

    private List<WeatherListener> listenerList = new ArrayList<>();

    @Override
    public void mulcaseEvent(WeatherEvent weatherEvent) {
        doStart();
        listenerList.forEach(i->i.onWeatherEvent(weatherEvent));
        doEnd();
    }

    @Override
    public void addListerer(WeatherListener weatherListener) {

        listenerList.add(weatherListener);
    }

    @Override
    public void delListener(WeatherListener weatherListener) {
        listenerList.remove(weatherListener);
    }

    abstract void doStart();

    abstract  void doEnd();
}
