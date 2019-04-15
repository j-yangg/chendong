package org.cd.designpatterns;

import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname: StartApplication
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-13 15:15
 */
@SpringBootApplication
@RestController
public class StartApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(StartApplication.class).run(args);
    }

    @RequestMapping("/test")
    public String test() {

        System.out.println("Test Success");
        return "Test Success";
    }

}
