package ebsystem;

import ebsystem.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-06-01T18:58:02")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Float> stockNumber;
    public static volatile SingularAttribute<Item, Movie> movie;
    public static volatile SingularAttribute<Item, Float> price;
    public static volatile SingularAttribute<Item, String> description;
    public static volatile SingularAttribute<Item, String> company;
    public static volatile SingularAttribute<Item, Long> id;
    public static volatile SingularAttribute<Item, String> title;
    public static volatile SingularAttribute<Item, String> classification;
    public static volatile SingularAttribute<Item, String> platform;

}