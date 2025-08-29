package com.example.touristguideapi.service;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;

    }

    public List<TouristAttraction> getAllAttractions() {

        return touristRepository.getAll();
    }

    public TouristAttraction getSpecificAttraction(String name){
        return touristRepository.getAttractionByName(name);


    }

    public TouristAttraction addAttraction(TouristAttraction attraction){

        return touristRepository.addAttraction(attraction);

    }

    public TouristAttraction updateAttraction(TouristAttraction attraction){

        return touristRepository.updateAttraction(attraction);
    }

}

//Connect den med Repo, så den kan connecte til Controlleren.
//