package zbuer.com.filter;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author buer
 * @since 16/8/15
 */
@Configuration
public class FilterConfiguration {

	@Bean
	public FilterRegistrationBean demoFilterRegistration(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(demoFilter());
		registrationBean.addUrlPatterns("/hello/*");
		registrationBean.setName("demoFilter");
		return registrationBean;

	}
	@Bean(name = "demoFilter")
	public Filter demoFilter(){
		return new DemoFilter();
	}
}
