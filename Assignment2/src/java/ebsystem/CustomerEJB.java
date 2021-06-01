/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Raken
 */
@Stateless
public class CustomerEJB {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    // Attributes             
    @PersistenceContext(unitName = "as2PU")
    private EntityManager em;
    
   

    public Customer createCustomer(Customer customer) {
        em.persist(customer);
        return customer;
    }
     public List<Customer> findCustomer() {
        TypedQuery<Customer> query = em.createNamedQuery("findAllCustomers", Customer.class);
        return query.getResultList();
    }
    
    public Customer findSpecificCustomer(){
    TypedQuery<Customer> query1 = em.createNamedQuery("findSpecificCustomer", Customer.class);
    return query1.getSingleResult();
    }
}
