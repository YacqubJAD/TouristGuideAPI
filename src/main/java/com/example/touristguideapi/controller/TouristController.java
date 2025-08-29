package com.example.touristguideapi.controller;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("attractions")
public class TouristController {
    private TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;

    }

    // Getend-point der kalder og retuner en liste af alle turist atraktioner
    // via service og repository
    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> attractionList(){

        List<TouristAttraction> attractionsList = touristService.getAllAttractions();
        return new ResponseEntity<>(attractionsList, HttpStatus.OK);
    }



}
