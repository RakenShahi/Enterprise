/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author Raken
 */
@Entity
@NamedQuery(name = "findAllOrders", query = "SELECT o FROM Order o")
@NamedQuery(name = "findSpecificOrder", query = "SELECT o FROM Order o WHERE o.orderId=:id")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long orderId;
    @Column
    protected String customer;
    @Column
    protected String item;
    @Column
    protected String cretedAt;
    @Column
    protected Long unitPrice; 
    @Column
    protected int Qty; 
    @Column
    protected Long totalPrice;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "MID")
    private Movie movie;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "GID")
    private Game game;

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

    //contstructor
    public Order(){
    
    }
    
    public Order(Long orderId, String customer, String item, String cretedAt, Long unitPrice, int Qty, Long totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.item = item;
        this.cretedAt = cretedAt;
        this.unitPrice = unitPrice;
        this.Qty = Qty;
        this.totalPrice = totalPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCretedAt() {
        return cretedAt;
    }

    public void setCretedAt(String cretedAt) {
        this.cretedAt = cretedAt;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
    
}
