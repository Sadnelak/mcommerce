package configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfig {

	@Bean
	public BasicAuthRequestInterceptor authRequestInterceptor() {
		return new BasicAuthRequestInterceptor("utilisateur","mdp");
	}
}
