/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import ebsystem.Item;
import javax.persistence.Entity;

/**
 *
 * @author Raken
 */
@Entity
public class Movie extends Item {

    //Attributes
    private Float duration;
    private String specialFeatures;   

    //Constructors
    public Movie() {
    }
    
    public Movie(Float duration, String specialFeatures, Long id, String title, String description, String company, String platform, String classification, Float price, Float stockNumber) {
        super(id, title, description, company, platform, classification, price, stockNumber);
        this.duration = duration;
        this.specialFeatures = specialFeatures;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}
