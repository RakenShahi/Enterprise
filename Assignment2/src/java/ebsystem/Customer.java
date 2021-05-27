/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import javax.persistence.*;

/**
 *
 * @author Raken
 */
@Entity
@NamedQuery(name = "findAllCustomers", query = "SELECT c FROM Customer c")
@NamedQuery(name = "findSpecificCustomer", query = "SELECT sc FROM Customer sc")
public class Customer {

    //Attributes
    @Id
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    
    //Constructors
    public Customer(){
    }

    public Customer(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
   
}