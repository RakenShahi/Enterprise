package ebsystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Raken
 */
@ManagedBean
@Named(value = "itemController")
@RequestScoped
public class ItemController {


     // Attributes             
    @EJB
    private ItemEJB itemEJB;
    private Movie movie = new Movie();
    private Movie fMovie=new Movie();
    private Item fitem=new Item();
    private Game game = new Game();
    
    private Item item= new Item();
    private List<Item> itemList = new ArrayList<Item>();
    private List<Item> foundList = new ArrayList<Item>();

    private List<Movie> movieList = new ArrayList<Movie>();
    private List<Game> gameList = new ArrayList<Game>();
    
    
    //for getting search title
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    //Public methods           
    public String doNewMovie() {
        return "newMovie.xhtml";
    }

    public String doNewGame() {
        return "newGame.xhtml";
    }
    
    
    
    public String doCreateMovie() {
        movie = itemEJB.createMovie(movie);
        movieList = itemEJB.findMovies();
        return "listMovies.xhtml";
    }
    
    public String doSearchMovie(){
        setTitle(title);       
         foundList= itemEJB.findSpecificMovie(title);
        return "foundMovie.xhtml";
    }
    
    public String doCreateGame() {
        game = itemEJB.createGame(game);
        gameList = itemEJB.findGames();
        return "listGames.xhtml";
    }
    
   

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {

        this.game = game;
    }

    public List<Item> getItemList() {
        itemList = itemEJB.findItems();
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Movie> getMovieList() {
        movieList = itemEJB.findMovies();
        return movieList;
    }

    public List<Item> getFoundList() {
        return foundList;
    }

    public void setFoundList(List<Item> foundList) {
        this.foundList = foundList;
    }
    
    

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Game> getGameList() {
                gameList = itemEJB.findGames();

        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    
  
}
