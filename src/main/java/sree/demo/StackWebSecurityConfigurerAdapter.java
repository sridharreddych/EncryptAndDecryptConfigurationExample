/*
 * package sree.demo;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * @Configuration public class StackWebSecurityConfigurerAdapter extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.httpBasic().disable(); //
 * http.authorizeRequests().anyRequest().permitAll(); // Also doesn't work. } }
 */