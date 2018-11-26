package mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("mvc")
public class Config {

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        //WEB-INF/view/home.jsp
//        registry.jsp("WEB-INF/view/", ".jsp");
//    }

    @Bean
    public ViewResolver resolver(){
        InternalResourceViewResolver view = new InternalResourceViewResolver();
       // WEB-INF/view/home.jsp
        view.setPrefix("WEB-INF/view/");
        view.setSuffix(".jsp");
        return view;
    }
}
