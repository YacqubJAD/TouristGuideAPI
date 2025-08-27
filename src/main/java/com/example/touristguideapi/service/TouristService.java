package com.example.touristguideapi.service;

import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class TouristService {

    private TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;

    }
}

//Connect den med Repo, så den kan connecte til Controlleren.
//