package spring.projects.di.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof LifeCycleDemoBean){

            System.out.println("### postProcessBeforeInitialization() ###");
            System.out.println("### "+bean.toString()+" ###");
            System.out.println("### "+beanName+"###");
            ((LifeCycleDemoBean)bean).beforeInit();
        }
        return bean;
    }

     @Override
     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

         if(bean instanceof LifeCycleDemoBean){

             System.out.println("### postProcessAfterInitialization() ###");
             System.out.println("### "+bean.toString()+" ###");
             System.out.println("### "+beanName+"###");
             ((LifeCycleDemoBean)bean).afterInit();
         }
         return bean;
    }
}
