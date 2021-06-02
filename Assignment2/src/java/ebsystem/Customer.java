/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Raken
 */
@Entity
@NamedQuery(name = "findAllCustomers", query = "SELECT c FROM Customer c")
@NamedQuery(name = "findSpecificCustomer", query = "SELECT sc FROM Customer sc WHERE sc.name=:name")
public class Customer {

    //Attributes
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long customerId;
    @Column
    protected String name;
    @Column
    protected String address;
    @Column
    protected String phoneNumber;
    @Column
    protected String emailAddress;
    
    //Constructors
    public Customer(){
    }

    public Customer(Long id,String name, String address, String phoneNumber, String emailAddress) {
        this.customerId = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return customerId;
    }

    public void setId(Long id) {
        this.customerId = id;
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