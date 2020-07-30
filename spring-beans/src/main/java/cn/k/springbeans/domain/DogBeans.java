package cn.k.springbeans.domain;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 第三种方式，继承接口
 */
@Component
public class DogBeans implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new DogBeans();
    }

    @Override
    public Class<?> getObjectType() {
        return DogBeans.class;
    }
}
