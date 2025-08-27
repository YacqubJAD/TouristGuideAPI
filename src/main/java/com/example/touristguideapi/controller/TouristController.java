package com.example.touristguideapi.controller;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("touristguideapi")
public class TouristController {
    private TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;

    }

    // Getend-point der kalder og retuner en liste af alle turist atraktioner
    // via service og repository
    @GetMapping("touristguide list")
    public TouristAttraction toursiliste(){

        return toursiliste();
    }



}
