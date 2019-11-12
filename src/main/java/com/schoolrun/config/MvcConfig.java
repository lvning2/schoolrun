package com.schoolrun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // registry.addInterceptor(new LoginInceptor()).excludePathPatterns("/","/js/**","/lib/layui/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/welcome").setViewName("/User/welcome.html");
        registry.addViewController("/UserTasknewest.html").setViewName("User/UserTasknewest");
        registry.addViewController("/Usermessangelist.html").setViewName("User/Usermessangelist");
        registry.addViewController("/UserTaskstart.html").setViewName("User/UserTaskstart");
        registry.addViewController("/UserTaskmain").setViewName("User/UserTaskmain");

        registry.addViewController("/ErrandMain.html").setViewName("Errand/ErrandMain");
        registry.addViewController("/ErrandTasknewest.html").setViewName("Errand/ErrandTasknewest");
        registry.addViewController("/ErrandTasklist.html").setViewName("Errand/ErrandTasklist");
        registry.addViewController("/ErrandTaskMylist.html").setViewName("Errand/ErrandTaskMylist");

       // registry.addViewController("/AdmainGrade.html").setViewName("/Admain/AdminGrade.html");
        //registry.addViewController("/AdmainManage.html").setViewName("/Admain/AdmainManage.html");

    }
}
