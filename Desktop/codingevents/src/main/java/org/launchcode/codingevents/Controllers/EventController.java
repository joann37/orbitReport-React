package org.launchcode.codingevents.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping()
    public String newBasic(Model model){
        List<String> events= new ArrayList<>();
            events.add("Easter");
            events.add("Ramadan");
            events.add("Christmas");
            events.add("Thanksgiving");
            events.add("July Fourth");
            events.add("New Years");
            model.addAttribute("events", events);
            return "events/index";

    }

    @GetMapping("create")
    public  String renderCreateEventForm(){
        return "events/create";
    }
}
