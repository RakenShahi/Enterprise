/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author Bishal
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "findAllItems", query = "SELECT i FROM Item i")
@NamedQuery(name = "findSpecificMovie", query = "SELECT i FROM Item i WHERE i.title=:title")

//@NamedQuery(name = "findAllOrders", query = "SELECT i FROM Order i")

public class Item {

    //Attributes
    @Id
    @GeneratedValue
    protected Long id;
    protected String title;
    protected String description;
    protected String company;
    protected String platform;
    protected String classification;
    protected Float price;
    protected Float stockNumber;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "Movie_fk")
    private Movie movie;
    
//    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    @JoinColumn(name = "Game_fk")
//    private Game game;
    


    //Constructors 
    public Item() {
    }

    public Item(Long id, String title, String description, String company, String platform, String classification, Float price, Float stockNumber) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.platform = platform;
        this.classification = classification;
        this.price = price;
        this.stockNumber = stockNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(Float stockNumber) {
        this.stockNumber = stockNumber;
    }

}