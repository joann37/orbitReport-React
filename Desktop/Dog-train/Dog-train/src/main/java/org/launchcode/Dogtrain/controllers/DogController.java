package org.launchcode.Dogtrain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DogController {
//    @GetMapping("big")
//    @ResponseBody
//    public String poodle(){
//        return "roof, roof!!";
//    }
    @GetMapping("short")
    @ResponseBody
    public String pitbull(){
        return "meow!, roof!!";
    }
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="big")
    @ResponseBody
    public String dogWithQueryParam(@RequestParam String name){
        return "GoodDay, "+ name + "!!!";
    }
    @GetMapping("big/{name}")
    @ResponseBody
    public String dogWithPathParam(@PathVariable String name){
        return "Whatup, " + name + "!!!";
    }
    @GetMapping("form")
    public String dogForm(){
        return "form";
    }
}
