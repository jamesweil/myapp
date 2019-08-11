package me.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "Hello Springboot.";
    }

    @RequestMapping("hello")
    public void hello() {

    }

    @RequestMapping("snoop")
    public void snoop() {

    }
}
