package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TouristRepository {
    ArrayList<TouristAttraction> attractionList = new ArrayList<>();

    
    public TouristRepository(){
        attractionList.add(new TouristAttraction("Tivoli", "Dansk forlystelsespark"));
        attractionList.add(new TouristAttraction("Rundetårn", "Tårn placeret i centrum af København"));
        attractionList.add(new TouristAttraction("Parken", "Hjem til Danmarks bedste fodboldklub"));
        attractionList.add(new TouristAttraction("Lille havfrue", "Historisk statue"));
    }

    public ArrayList<TouristAttraction> getAll() {


        return attractionList;
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
        TouristAttraction newAttraction = new TouristAttraction(attraction.getName(), attraction.getDescription());

        attractionList.add(newAttraction);
        return newAttraction;
    }

    public TouristAttraction updateAttractionName(TouristAttraction attraction, String update) {
        attraction.setName(update);

        return attraction;
    }

    public TouristAttraction updateAttractionDescription(TouristAttraction attraction, String update) {
        attraction.setDescription(update);

        return attraction;
    }

    public TouristAttraction deleteAttraction(String name) {
        if (!(name == null )){
            TouristAttraction tempAttraction = getAttractionByName(name);
            attractionList.remove(tempAttraction);

            return tempAttraction;
        }

        return null;
    }

    public TouristAttraction updateAttraction(TouristAttraction attraction){
        TouristAttraction tempAttraction = getAttractionByName(attraction.getName());


        if(tempAttraction != null){
            //attractionList.remove(tempAttraction);
            tempAttraction.setName(attraction.getName());
            tempAttraction.setDescription(attraction.getDescription());

            //attractionList.add(tempAttraction);

            return tempAttraction;
        }

        return null;
    }

}
