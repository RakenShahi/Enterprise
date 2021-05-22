/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Raken
 */
@Stateless
@LocalBean
public class ItemEJB {

    // Attributes             
    @PersistenceContext(unitName = "EBS")
    private EntityManager em;

    // Public Methods           
    public List<Game> findGames() {
        TypedQuery<Game> query = em.createNamedQuery("findAllBooks", Game.class);
        return query.getResultList();
    }

    public Game createGame(Game game) {
        em.persist(game);
        return game;
    }
}
