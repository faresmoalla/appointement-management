package com.bezkoder.springjwt.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Location;
import com.bezkoder.springjwt.repository.LocationRepository;

@RestController
public class LocationController {
    
    @Autowired
    private LocationRepository locationRepository;
    
    @GetMapping("/locations")
    public List<Map<String, Double>> getLocations() {
        List<Location> locations = locationRepository.findAll();
        List<Map<String, Double>> result = new ArrayList<>();
        
        for (Location location : locations) {
            Map<String, Double> coordinates = new HashMap<>();
            coordinates.put("latitude", location.getLatitude());
            coordinates.put("longitude", location.getLongitude());
            result.add(coordinates);
        }
        
        return result;
    }
}
