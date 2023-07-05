package Java_II;

import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {


    public static Person[] addPerson(Person newPerson, Person[] homies){
        Person[] newArray;
        newArray = new Person[homies.length +1];
        System.arraycopy(homies,0, newArray, 0, homies.length);
        newArray[newArray.length -1] = newPerson;
        return newArray;
    }


    public static void main(String[] args) {

        Input newInput = new Input();


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] homies = {
                new Person("mark"),
                new Person("john"),
                new Person("rob"),
        };

        for(Person homie : homies){
            System.out.println(homie.getName());
        }
        System.out.println("Please add another person:");
        String promptName = newInput.getString("Please add another person:");
        Person newPerson = new Person(promptName);
        homies = addPerson(newPerson, homies);

        for(Person homie : homies){
            System.out.println(homie.getName());
        }


    }
}
