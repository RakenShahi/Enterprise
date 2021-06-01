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
public class Game extends Item{

    //Attributes
    private String videoOutput;   
    private Integer hDSpace;
    private Integer noOfPlayers;

    //Constructors

    public Game() {
    }

    public Game(String videoOutput, Integer hDSpace, Integer noOfPlayers, Long id, String title, String description, String company, String platform, String classification, Float price, int stockNumber) {
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

    public Integer gethDSpace() {
        return hDSpace;
    }

    public void sethDSpace(Integer hDSpace) {
        this.hDSpace = hDSpace;
    }

    public Integer getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(Integer noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    } 
}
