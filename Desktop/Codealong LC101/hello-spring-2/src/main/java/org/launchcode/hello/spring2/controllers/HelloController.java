package org.launchcode.hello.spring2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    // Handles request at path /hello
//    @GetMapping ("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
    //Handles request at path /solong
    //Lives at /hello/solong
    @GetMapping ("solong")
    public String solong(){
        return "Solong, Spring!";
    }

    //Handles requests of the form /hello?name=launchcode
    //lives at /hello
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, "+ name + "-You know that you are the bees knees!!" + "!";
    }
    // Handles requests of the form /hello/Launchcode
    // Lives at
    @GetMapping("{name}")
    public String helloAgain(@PathVariable String name){
        return "Hello, " + name +"!";
    }
    //Lives at /hello/form
    @GetMapping("form")
    public String helloform(){
        return"<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name' >" +
                "<input type='submit' value='Greet me Bro!'>" +
                "</form>" +
                "</body>" +
                "</html> ";

    }
}

