package oop;

/**
 * Created by Codenator on 06-Apr-14.
 */
public class Car extends Super {

    String name;
    public static void main(String args[]){
        Car c = new Car();
        c.name = "Honda";
        c.idi = 2;
        System.out.println(c.name);
    }

}
