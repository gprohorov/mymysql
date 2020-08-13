package pro.edu.mymysql;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class Genre {


    private String id; //

    private String name;
    private String description;



    public Genre() {
        this.id = UUID.randomUUID().toString();  //  5th step - generate an id

    }

    public Genre(String name, String desc) {
        this.id = UUID.randomUUID().toString();   //  5th step - generate an id
        this.name = name;
        this.description = desc;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}