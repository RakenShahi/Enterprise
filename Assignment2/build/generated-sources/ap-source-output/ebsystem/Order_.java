package ebsystem;

import ebsystem.Game;
import ebsystem.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-06-02T17:19:32")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Long> unitPrice;
    public static volatile SingularAttribute<Order, String> item;
    public static volatile SingularAttribute<Order, Game> game;
    public static volatile SingularAttribute<Order, Movie> movie;
    public static volatile SingularAttribute<Order, Long> orderId;
    public static volatile SingularAttribute<Order, Long> totalPrice;
    public static volatile SingularAttribute<Order, String> cretedAt;
    public static volatile SingularAttribute<Order, Integer> Qty;
    public static volatile SingularAttribute<Order, String> customer;

}