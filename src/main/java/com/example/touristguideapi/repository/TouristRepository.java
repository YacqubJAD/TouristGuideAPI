package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TouristRepository {
    ArrayList<TouristAttraction> attractionList = new ArrayList<>();


    public ArrayList<TouristAttraction> TouristAdd() {
        attractionList.add(new TouristAttraction("Goden", "Hvorfor puller dwarf?"));
        attractionList.add(new TouristAttraction("Eiffeltårnet", "højt tårn"));
        attractionList.add(new TouristAttraction("Anfield", "Bedste stadium i verdenen"));
        attractionList.add(new TouristAttraction("Eiffeltårnet i vegas", "Det bedre eiffeltårnet"));

        return attractionList;
    }

    public ArrayList<TouristAttraction> getAllAttractions() {
        return attractionList;
    }


    public TouristAttraction getAttractionByName(String name) {
        for (TouristAttraction attraction : attractionList) {
            if (attraction.getName().equalsIgnoreCase(name)) return attraction;
        }
        return null;
    }

    public void addAttraction(TouristAttraction attraction) {
        if (!(attraction == null)) attractionList.add(attraction);
    }

    public TouristAttraction updateAttractionName(TouristAttraction attraction, String update) {
        attraction.setName(update);

        return attraction;
    }

    public TouristAttraction updateAttractionDescription(TouristAttraction attraction, String update) {
        attraction.setDescription(update);

        return attraction;
    }

    public void deleteAttraction(TouristAttraction attraction) {
        if (!(attraction == null )) attractionList.remove(attraction);

    }

}
