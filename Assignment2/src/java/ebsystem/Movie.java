/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import javax.persistence.Entity;

/**
 *
 * @author Raken
 */
@Entity
public class Movie extends Item {

    //Attributes
    private Integer duration;
    private String specialFeatures;   

    //Constructors
    public Movie() {
    }
    
    public Movie(Integer duration, String specialFeatures, Long id, String title, String description, String company, String platform, String classification, Float price, int stockNumber) {
        super(id, title, description, company, platform, classification, price, stockNumber);
        this.duration = duration;
        this.specialFeatures = specialFeatures;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}
