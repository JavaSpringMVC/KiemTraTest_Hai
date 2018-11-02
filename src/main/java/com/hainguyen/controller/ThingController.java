package com.hainguyen.controller;

import com.hainguyen.model.Thing;
import com.hainguyen.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThingController {
    @Autowired
    ThingService thingService;

    @GetMapping("/thing/s")
    public ModelAndView listThing(){
        Iterable<Thing> things = thingService.findAll();
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("things", things);
        return modelAndView;
    }

    @GetMapping("/thing")
    public ModelAndView createThing(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("thing", new Thing());
        return modelAndView;
    }

    @PostMapping("/dothing")
    public ModelAndView saveThing(@ModelAttribute("thing") Thing thing){
        thingService.save(thing);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("message", "Create thing successful");
        return modelAndView;
    }


    @GetMapping("/thing/{id}")
    public ModelAndView viewThing(@PathVariable int id){
        Thing thing = thingService.findById(id);
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("thing", thing);
        return modelAndView;
    }
}
