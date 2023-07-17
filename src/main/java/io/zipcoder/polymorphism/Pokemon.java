package io.zipcoder.polymorphism;

public class Pokemon extends Pet{
    public Pokemon() {
        super("Pikachu");
    }
    public Pokemon (String name) {
        super(name);
    }

    public String speak() {
        return "Pica - pica";
    }


}
