package config;

import att.db.Company;
import att.db.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    @Bean
    public User user()
    {
        return new User();
    }

    @Bean
    public Company company()
    {
        return new Company();
    }

    /*@Bean
    public Login login()
    {
        return new Login();
    }*/
}
