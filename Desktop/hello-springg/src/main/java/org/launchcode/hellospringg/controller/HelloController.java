package org.launchcode.hellospringg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
//    //Handles request at path /hello
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello() {
////        return "Hello, Spring! What is Popping?";
//    }
    //lives /hello/seeYa
    @GetMapping("seeYa")
    public String seeYa() {
        return "SeeYa Later, Spring! Hope all is well!";
    }

    // lives at /hello/hello
    //Handles request of the form /hello?name=launchCode

    @RequestMapping(method= {RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String helloWithQueryParam(@RequestParam String name){
        return "Hi there "+ name + "!!";
    }
    //Handles request of the form hello/launchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hi there now my good buddy "+ name + "!!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me now!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}

