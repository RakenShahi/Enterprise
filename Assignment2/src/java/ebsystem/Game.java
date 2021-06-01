/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import ebsystem.Item;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;


/**
 *
 * @author Raken
 */
@Entity
@NamedQuery(name = "findAllGames", query = "SELECT g FROM Game g")
public class Game extends Item{

    //Attributes
    private String videoOutput;   
    private Float hDSpace;
    private Float noOfPlayers;

    //Constructors

    public Game() {
    }

    public Game(String videoOutput, Float hDSpace, Float noOfPlayers, Long id, String title, String description, String company, String platform, String classification, Float price, Float stockNumber) {
        super(id, title, description, company, platform, classification, price, stockNumber);
        this.videoOutput = videoOutput;
        this.hDSpace = hDSpace;
        this.noOfPlayers = noOfPlayers;
    }

    public String getVideoOutput() {
        return videoOutput;
    }

    public void setVideoOutput(String videoOutput) {
        this.videoOutput = videoOutput;
    }

    public Float gethDSpace() {
        return hDSpace;
    }

    public void sethDSpace(Float hDSpace) {
        this.hDSpace = hDSpace;
    }

    public Float getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(Float noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }
    
    

}