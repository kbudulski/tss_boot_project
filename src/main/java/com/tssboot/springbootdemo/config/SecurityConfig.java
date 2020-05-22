package com.tssboot.springbootdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource securityDataSource;

    public SecurityConfig(DataSource securityDataSource) {
        this.securityDataSource = securityDataSource;
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.jdbcAuthentication().dataSource(securityDataSource);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasRole("USER")
                .antMatchers("/welcome-page/**").hasRole("USER")
                .antMatchers("/list-customers/**").hasRole("USER")
                .antMatchers("/data/**").hasRole("ADMIN")
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/access-denied");
    }
}
