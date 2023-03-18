package com.bezkoder.springjwt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    
    @GetMapping("/map")
    public String showMap(Model model) {
        double latitude = 37.7749;
        double longitude = -122.4194;
        double longitude = -122.4194;
        
        model.addAttribute("latitude", latitude);
        model.addAttribute("longitude", longitude);
        model.addAttribute("description", description);
        return "map";
    }
}
