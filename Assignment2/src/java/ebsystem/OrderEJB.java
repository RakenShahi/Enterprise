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
public class OrderEJB {
// Attributes             
    @PersistenceContext(unitName = "as2PU")
    private EntityManager em;
    
        
    
public Order createOrder(Order order) {
        em.persist(order);
        return order;
    }
    
    public List<Order> findOrder() {
        TypedQuery<Order> query = em.createNamedQuery("findAllOrders", Order.class);
        return query.getResultList();
    }
    
    public List<Order> findSpecificOrder( Integer orderId) {
        TypedQuery<Order> query = em.createNamedQuery("findSpecificOrder", Order.class);
        query.setParameter("id",orderId);
        return query.getResultList();
    }
    
    
    
    


}
