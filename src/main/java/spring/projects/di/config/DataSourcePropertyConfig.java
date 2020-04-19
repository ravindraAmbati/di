package spring.projects.di.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import spring.projects.di.examplebeans.DataSource;
import spring.projects.di.examplebeans.JMSBroker;

@Configuration
//@PropertySource({"classpath:dataSource.properties","classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:dataSource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class DataSourcePropertyConfig {

    @Autowired
    Environment env;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.url}")
    private String url;

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
        return new DataSource(env.getProperty("USERNAME"), password, url);
    }

    @Bean
    public JMSBroker jmsBroker() {
        return new JMSBroker(jmsUsername, jmsPassword, jmsUrl);
    }
}
