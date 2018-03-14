package com.hasanainalsabonchi.resturantlist;

/**
 * Created by hasanainalsabonchi on 5/7/16.
 */
public class Resturant {
    public int logo;
    public String name;
    public String type;
    public String opinion;
    public String price;
    public  int Rating;


    public Resturant(int logo,String name, String type,String opinion, String price,int Rating){

        super();
        this.logo = logo;
        this.name = name;
        this.type = type;
        this.opinion=opinion;
        this.price=price;
       this.Rating=Rating;

    }



}
