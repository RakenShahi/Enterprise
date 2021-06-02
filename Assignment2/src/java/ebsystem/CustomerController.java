/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.annotation.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ejb.EJB;


/**
 *
 * @author Raken
 */
@ManagedBean
@Named(value = "customerController")
@SessionScoped
public class CustomerController implements Serializable{

    @EJB
    private CustomerEJB customerEJB;
    private Customer customer=new Customer();
    private List<Customer> customerList = new ArrayList<Customer>();
        private List<Customer> foundCustomer = new ArrayList<Customer>();
        private String name;

    public List<Customer> getFoundCustomer() {
        return foundCustomer;
    }

    public void setFoundCustomer(List<Customer> foundCustomer) {
        this.foundCustomer = foundCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public String doNewCustomer(){
    return "newCustomer.xhtml";
    }
    
    public String doCreateCustomer() {
        customer =customerEJB.createCustomer(customer);
        customerList = customerEJB.findCustomer();
        return "listCustomers.xhtml";
    }
    public String doSearchCustomer(){
        setName(name);       
         foundCustomer= customerEJB.findSpecificCustomer(name);
        return "foundCustomer.xhtml";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
