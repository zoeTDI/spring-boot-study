package cn.study.caldm.section_two.interfaces.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.study.caldm.section_two.domain.model.Message;

@RestController 
public class MessageController {
    @RequestMapping ("/hello")
    public Message sayHello() {
        return new Message("Hello World");
    }
}
