//package com.casestudy.flightsearchapi.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authorize) -> authorize
//                        .requestMatchers( "/home").permitAll()
//                        .requestMatchers("/ucuslar/**").permitAll()
//                        .requestMatchers("/admin").hasAnyRole("admin")
//                        .anyRequest().authenticated()
//                )
//                .formLogin(login -> login
//                        .defaultSuccessUrl("/")
//                        .permitAll())
//                .logout(logout -> logout
//                        .logoutSuccessUrl("/"));
//        return http.build();
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();}
//
//    @Bean
//    public InMemoryUserDetailsManager userDetailsService() {
//        UserDetails user1 = User.builder().username("admin").password(passwordEncoder().encode("1234")).roles("admin").build();
//        return new InMemoryUserDetailsManager(user1);
//    }
//}
//