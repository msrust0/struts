package org.superbiz.struts;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;
import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean filterSiteMeshRegistrationBean() {
        FilterRegistrationBean<SiteMeshFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new SiteMeshFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(0);

        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterStrutsPrepareAndExecuteRegistrationBean() {
        FilterRegistrationBean<StrutsPrepareAndExecuteFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new StrutsPrepareAndExecuteFilter());
        registrationBean.setOrder(1);
        registrationBean.addUrlPatterns(
        "/",
        "/addUserForm.action",
        "/addUser.action",
        "/findUserForm.action",
        "/findUser.action",
        "/listAllUsers.action");

        return registrationBean;
    }
}
