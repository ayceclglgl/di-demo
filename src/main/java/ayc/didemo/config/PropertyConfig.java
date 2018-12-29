package ayc.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import ayc.didemo.beans.ExampleDataSource;
import ayc.didemo.beans.ExampleJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties", "jmsbroker.yml"})
@PropertySources({
		@PropertySource("classpath:datasource.properties"),
		@PropertySource("jmsbroker.yml")
})
public class PropertyConfig {

	@Autowired
	Environment env;
	
	@Value("${db.username}")
	private String username;
	@Value("${db.password}")
	private String password;
	
	@Value("${jmsusername}")
	private String jmsUsername;
	@Value("${jmspassword}")
	private String jmsPassword;
	
	
	@Bean
	public ExampleDataSource exampleDataSource() {
		ExampleDataSource ds = new ExampleDataSource();
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public ExampleJmsBroker exampleJmsBroker() {
		ExampleJmsBroker jms = new ExampleJmsBroker();
		jms.setUsername(jmsUsername);
		jms.setPassword(jmsPassword);
		return jms;
	}
	
	
	/*
	 * No need to get PropertySourcesPlaceholderConfigurer as bean I think it is already there
	 * If we want to configure manually then it might be necessary
	 */
	/*@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}*/

	
}
