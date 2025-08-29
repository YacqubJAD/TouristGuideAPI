package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TouristRepository {
    ArrayList<TouristAttraction> attractionList = new ArrayList<>();


    public ArrayList<TouristAttraction> touristAdd() {
        attractionList.add(new TouristAttraction("Tivoli", "Dansk forlystelsespark"));
        attractionList.add(new TouristAttraction("Rundetårn", "Tårn placeret i centrum af København"));
        attractionList.add(new TouristAttraction("Parken", "Hjem til Danmarks bedste fodboldklub"));
        attractionList.add(new TouristAttraction("Lille havfrue", "Historisk statue"));

        return attractionList;
    }

    public TouristRepository(){
        touristAdd();
    }

    //public ArrayList<TouristAttraction> getAllAttractions() {
      //  return attractionList;
    //}


    public TouristAttraction getAttractionByName(String name) {
        for (TouristAttraction attraction : attractionList) {
            if (attraction.getName().equalsIgnoreCase(name)) return attraction;
        }
        return null;
    }

    public TouristAttraction addAttraction(TouristAttraction attraction) {
        if (!(attraction == null)) {
            attractionList.add(attraction);
            return attraction;
        }

        return null;
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

    public TouristAttraction updateAttraction(TouristAttraction attraction, String newName, String newDescription){

        if(!(attraction == null) || !(newName == null) || !(newDescription == null)){
            attraction.setName(newName);
            attraction.setDescription(newDescription);

            return attraction;
        }

        return null;
    }

}
