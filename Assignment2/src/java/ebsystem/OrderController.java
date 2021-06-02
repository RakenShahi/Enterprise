/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebsystem;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.annotation.ManagedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Raken
 */
@ManagedBean
@Named(value = "orderController")
@RequestScoped
public class OrderController implements Serializable {

    /**
     * Creates a new instance of OrderController
     */
    
    @EJB
    private OrderEJB orderEJB;
   

    private Order order=new Order();
    private List<Order> orderLists = new ArrayList<Order>();
    private List<Order> foundOrder = new ArrayList<Order>();
    private String name;
    private String itemName;
    private Integer orderId;
    private Integer qty;
    
    //Customer
    @EJB
    private CustomerEJB customerEJB;
    private Customer customer = new Customer();
    private List<Customer> customerList = new ArrayList<Customer>();
    private Map<Long, String> customerMap;
    
    //Item
    @EJB
    private ItemEJB itemEJB;
    private Item item = new Item();
    private List<Item> itemList = new ArrayList<Item>();
    private Map<Long, String> itemMap;
    
    public String doNewOrder(){
    return "newOrder.xhtml";
    }
    
    @PostConstruct
    public void orderFormPage(){
    //Combobox setup for customer name
    //Customer Combobox
    this.customerList = customerEJB.findCustomer();
        this.customerMap = new LinkedHashMap<Long, String>();
        for(Customer customer:customerList)
        {
            this.customerMap.put(customer.getId(),customer.getName());
        } 
    
        //Item Combobox
    this.itemList = itemEJB.findItems();
        this.itemMap= new LinkedHashMap<Long, String>();
        for(Item item:itemList)
        {
            this.itemMap.put(item.getId(),item.getTitle()+" - "+item.getPrice());
        }
    }

    
    public String doCreateOrder() {
        order = orderEJB.createOrder(order);
        orderLists = orderEJB.findOrder();
        return "listOrders.xhtml";
    }
    
    public String doSearchOrder(){
        setOrderId(orderId);       
         foundOrder= orderEJB.findSpecificOrder(orderId);
        return "foundOrder.xhtml";
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {    
        this.itemName = itemName;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Map<Long, String> getItemMap() {
        return itemMap;
    }

    //Getter & Setter
    public void setItemMap(Map<Long, String> itemMap) {
        this.itemMap = itemMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public List<Order> getOrderLists() {
        return orderLists;
    }

    public void setOrderLists(List<Order> orderLists) {
        this.orderLists = orderLists;
    }

    public List<Order> getFoundOrder() {
        return foundOrder;
    }

    public void setFoundOrder(List<Order> foundOrder) {
        this.foundOrder = foundOrder;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Map<Long, String> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<Long, String> customerMap) {
        this.customerMap = customerMap;
    }
    
    
    
    
    
    
    
    
}
