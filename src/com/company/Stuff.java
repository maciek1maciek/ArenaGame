package com.company;

public class Stuff {

    private String name;
    private String weight;

    public Stuff(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Stuff{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
