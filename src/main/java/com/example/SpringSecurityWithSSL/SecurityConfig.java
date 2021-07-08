package com.example.SpringSecurityWithSSL;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.headers()
                .frameOptions().sameOrigin()
                .httpStrictTransportSecurity().disable();

        //http.requiresChannel()
        //        .antMatchers("/login.html").requiresSecure();

        http.formLogin()
                .loginPage("/login.html")
                .loginProcessingUrl("/check.action")
                .and()
                .logout()
                .logoutSuccessUrl("/login.html")
                .logoutUrl("/logout")
                .and()
                .authorizeRequests()
                .antMatchers("/testAuthenticated.html")
                .authenticated()
                .antMatchers("/testPermitAll.html")
                .permitAll()
                .antMatchers("/login.html").permitAll()
                .anyRequest().permitAll();
    }
}
