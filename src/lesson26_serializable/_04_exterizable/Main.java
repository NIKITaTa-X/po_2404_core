package lesson26_serializable._04_exterizable;

import java.io.*;

public class Main {
    public static final String PATH_TO_FILE = "src/lesson26_serializable/_04_exterizable/save.save";
    public static void main(String[] args) {
        var extFile = new ExtFile("Vasya","Pupkin","ThisMyP@s$");
        try (var os = new FileOutputStream(PATH_TO_FILE);
             var oos = new ObjectOutputStream(os);
             var is = new FileInputStream(PATH_TO_FILE);
             var ois = new ObjectInputStream(is)){
            System.out.println(extFile);
            oos.writeObject(extFile);
            System.out.println("_----------------------");
            var fromFile = (ExtFile) ois.readObject();
            System.out.println(fromFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
