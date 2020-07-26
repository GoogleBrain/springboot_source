package cn.k.spring_listene.event;

public class WeatherEventMul extends  AbstractEventMulCast {
    @Override
    void doStart() {
        System.out.println("开始.>>>>.");
    }

    @Override
    void doEnd() {
        System.out.println("结束>>>>>>>>>>>>>>");
    }
}
