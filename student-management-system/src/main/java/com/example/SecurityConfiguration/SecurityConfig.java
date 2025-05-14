package com.example.SecurityConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(requests -> requests
                                .requestMatchers("/students/**").authenticated() // Requiring tehier login for /students
                                .anyRequest().permitAll()
                )
                .oauth2Login(login -> login //alows the google cloud's oauth2 login
                        .defaultSuccessUrl("/"))
                .logout(logout -> logout
                        .logoutSuccessUrl("/")); // Redirect after i successful logout

        return http.build();
    }
}
