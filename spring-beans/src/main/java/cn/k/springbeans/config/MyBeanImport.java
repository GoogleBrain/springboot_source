package cn.k.springbeans.config;

import cn.k.springbeans.domain.Bird;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 第五种方式，需要在application类中import一下
 */
public class MyBeanImport implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        RootBeanDefinition root = new RootBeanDefinition();
        root.setBeanClass(Bird.class);
        registry.registerBeanDefinition("Bird",root);
    }
}
