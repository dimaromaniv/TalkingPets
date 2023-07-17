package io.zipcoder.polymorphism;

public abstract class Pet {

    private String name;
    private String type;


    public Pet () {

    }

    public  Pet (String name) {
        this.name = name;
//        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getType (boolean expected) {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }



    public abstract String speak();



}
