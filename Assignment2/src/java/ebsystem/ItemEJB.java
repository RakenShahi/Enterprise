/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Bishal
 */
@Stateless
@LocalBean
public class ItemEJB {

    // Attributes             
    @PersistenceContext(unitName = "as2PU")
    private EntityManager em;

    // Public Methods           
    public List<Item> findItems() {
        Query query = em.createNamedQuery("findAllItems",Item.class);
        return query.getResultList();
    }
    
    public List<Movie> findMovies() {
        TypedQuery<Movie> query = em.createNamedQuery("findAllMovies", Movie.class);
        return query.getResultList();
    }
    
    public Movie findSpecificMovie() {
        TypedQuery<Movie> query = em.createNamedQuery("findSpecificMovie", Movie.class);
        query.setParameter("Title","JJLD");
        Movie fMovie=query.getSingleResult();
        return fMovie;
    }
    
    
    public Customer findSpecificCustomer(){
    TypedQuery<Customer> query1 = em.createNamedQuery("findSpecificCustomer", Customer.class);
    return query1.getSingleResult();
    }

    public Movie createMovie(Movie movie) {
        em.persist(movie);
        return movie;
    }
    
    public List<Game> findGames() {
        TypedQuery<Game> query = em.createNamedQuery("findAllGames", Game.class);
        return query.getResultList();
    }

    public Game createGame(Game game) {
        em.persist(game);
        return game;
    }
    
    public List<Customer> findCustomer() {
        TypedQuery<Customer> query = em.createNamedQuery("findAllCustomers", Customer.class);
        return query.getResultList();
    }

    public Customer createCustomer(Customer customer) {
        em.persist(customer);
        return customer;
    }
}
