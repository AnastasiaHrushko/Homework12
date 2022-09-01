package Homework12;

import java.util.Date;
import java.util.GregorianCalendar;

public class Product {
    private int id;
    private String name;

    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Product(){

    }

    @Override
    public String toString() {
        return "Товар{" +
                "код товара " + id +
                ", название'" + name +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
