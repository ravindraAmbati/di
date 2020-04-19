package spring.projects.di.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import spring.projects.di.examplebeans.DataSource;
import spring.projects.di.examplebeans.JMSBroker;

@Configuration
//@PropertySource({"classpath:dataSource.properties","classpath:jms.properties"})
//@PropertySources({
//        @PropertySource("classpath:dataSource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
//application.properties is auto configured and hanlded by spring boot
public class DataSourcePropertyConfig {

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.url}")
    private String dbUrl;

    @Value("${jms.username}")
    private String jmsUsername;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.url}")
    private String jmsUrl;

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DataSource dataSource() {
        return new DataSource(dbUsername, dbPassword, dbUrl);
    }

    @Bean
    public JMSBroker jmsBroker() {
        return new JMSBroker(jmsUsername, jmsPassword, jmsUrl);
    }
}
