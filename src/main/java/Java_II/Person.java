package Java_II;

import java.util.Scanner;

public class Person {

    private String name;

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(String name){
        System.out.printf("Hello %s!",name);
    }

    public static void main(String[] args) {
        Person me = new Person();
        me.setName("aiden");
        System.out.println(me.getName());
        System.out.println("Hello " + me.getName());
    }
}
