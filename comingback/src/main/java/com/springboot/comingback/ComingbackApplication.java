package com.springboot.comingback;

import com.springboot.comingback.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication    //项目核心注解，目的就是开启Spring Boot的自动配置
//也可以@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ComingbackApplication {

    @Autowired
    private Book book;

    public static void main(String[] args) {
        //下列梁行代码关闭了banner的展示
        //SpringApplicationBuilder builder = new SpringApplicationBuilder(
        //      ComingbackApplication.class);
        //builder.bannerMode(Banner.Mode.OFF).run(args);

        SpringApplication.run(ComingbackApplication.class, args);
    }

    @RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
    String index(){
        return "HELLO SPRING BOOT!";
    }

    @RequestMapping(value = "/book")
     String book(){
        return "Hello Spring Boot! The Book's Name is "+book.getName()+"; and Book's Autohr" +
                " is "+book.getAuthor()+"; and Book's price is"+book.getPrice()+" --BO";
//        return "nice to meet you!";
    }
}
