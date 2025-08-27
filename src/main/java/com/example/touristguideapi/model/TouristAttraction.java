package com.example.touristguideapi.model;

public class TouristAttraction {

private String name;
private String description;

public TouristAttraction(String name, String description){
    this.name = name;
    this.description = description;
}

public String setName(String newName){
    name = newName;

    return name;
}

public String getName(){
    return name;
}

public String setDescription(String newDescription){
    description = newDescription;

    return description;
}

public String getDescription(){
    return description;
}



}
