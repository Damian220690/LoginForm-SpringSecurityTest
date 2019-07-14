package pl.nieweg.login_formspring_security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableJpaRepositories(basePackages = "pl.nieweg.login_formspring_security")
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

}
