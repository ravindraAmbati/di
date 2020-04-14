package spring.projects.di.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, ApplicationContextAware, BeanFactoryAware, BeanNameAware  {

    public LifeCycleDemoBean() {
        System.out.println("### LifeCycleDemoBean() - constructor ###");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### setBeanFactory() ###");
        System.out.println("### "+beanFactory.toString()+" ###");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("### setBeanName() ###");
        System.out.println("### "+s+" ###");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("### destroy() ###");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### afterPropertiesSet() ###");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("### setApplicationContext() ###");
        System.out.println("### "+applicationContext.toString()+" ###");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
