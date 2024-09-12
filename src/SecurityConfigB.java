// SecurityConfig.java
@Configuration
@EnableWebSecurity
public class SecurityConfigB extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }
}

// UserDetailsServiceImpl.java
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) {
        return new User("admin", "{noop}password", Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }
}
