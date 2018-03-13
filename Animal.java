package com.fsavage.zoolistacm;

/**
 *
 */
public class Animal {

    public final static String MAMMAL = "mammal";
    public final static String BIRD = "bird";
    public final static String REPTILE = "reptile";
    protected long id = 0;

    public long getId() {
        return(id);
    }

    public void setId(long id) {
        this.id=id;
    }
    private String name="";
    private String location = "";
    private String type="";

    public String getName() {
        return(name);
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getLocation() {
        return(location);
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public String getType() {
        return(type);
    }

    public void setType(String type) {
        this.type=type;
    }

    public String toString() {
        return(getName());
    }

}
