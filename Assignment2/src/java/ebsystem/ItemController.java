/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Raken
 */
@Named(value = "itemController")
@RequestScoped
public class ItemController {

    /**
     * Creates a new instance of ItemController
     */
    public ItemController() {
    }
    
     // Attributes             
    @EJB
    private ItemEJB itemEJB;
    private Item item = new Item();
    private Game game = new Game();
    private List<Item> itemList = new ArrayList<Item>();
    private List<Game> gameList = new ArrayList<Game>();

    // Public Methods           
    public String doCreateItem() {
        game = itemEJB.createGame(game);
        gameList = itemEJB.findGames();
        return "listBooks.xhtml";
    }

    //Getters & Setters         
    public Item getBook() {
        return item;
    }

    public void setBook(Item book) {
        this.item = book;
    }

    public List<Item> getBookList() {
        return itemList;
    }

    public void setBookList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
