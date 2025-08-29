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

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> byName(@PathVariable String name) {

        TouristAttraction byName = touristService.getSpecificAttraction(name);
        return new ResponseEntity<>(byName, HttpStatus.OK);
    }

    @GetMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(TouristAttraction attraction){

        return new ResponseEntity<>(touristService.addAttraction(attraction), HttpStatus.OK);

    }

    @PostMapping("/update")
    public ResponseEntity<TouristAttraction> updateAttraction(@RequestBody TouristAttraction attraction){

        TouristAttraction update = touristService.updateAttraction(attraction);
        return new ResponseEntity<>(update, HttpStatus.OK);
    }

    @PostMapping("/delete/{name}")
    public ResponseEntity<TouristAttraction> deleteAttraction(@PathVariable String name){

        TouristAttraction delete = touristService.deleteAttraction(name);
        return new ResponseEntity<>(delete, HttpStatus.OK);
    }

}
