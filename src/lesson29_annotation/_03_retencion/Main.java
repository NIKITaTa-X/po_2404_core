package lesson29_annotation._03_retencion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var annotatedClassObj = new AnnotatedClass();
        var annotations = annotatedClassObj.getClass().getAnnotations();
        System.out.println("Quantity RunTime annotations " + annotations.length);
        Arrays.stream(annotations).forEach(System.out::println);
    }
}
