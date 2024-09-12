//Spring-secuirty
// SecurityConfig.java
@Configuration
@EnableWebSecurity
public class SecurityConfigOAuth extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .oauth2Login()
                .and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }

    @Bean
    public AutorizationServerEndPointsConfigure  autorizationServerEndPointsConfigure(){
        return new AutorizationServerEndPointsConfigure()
                .tokenStore(new InMemoryTokenStore())
                .authenticationManager(authenticationManager());
    }

    @Bean
    public TokenStore tokenStore(){
        return new InMemoryTokenStore();
    }
}
