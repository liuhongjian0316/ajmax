package work.aijiu.ajmax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: aijiu
 * @version: 1.0
 * @description: 作用
 * @createDate: 2022/6/7 15:35
 * @updateUser: aijiu
 * @updateDate: 2022/6/7 15:35
 **/
@RestController
public class TestController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
