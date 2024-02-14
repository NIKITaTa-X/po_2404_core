package lesson26_serializable._02_standard_inherirance;

import java.io.Serializable;

public class Parent {
    int parentField;

    public Parent(){
        System.out.println("Inside parent's constructor");
        parentField = 5;
    }

}
