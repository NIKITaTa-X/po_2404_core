package lesson26_serializable._02_standard_inherirance;

import java.io.*;

public class Main {
    public static final String PATH_TO_FILE = "src/lesson26_serializable/_02_standard_inherirance/save.save";
    public static void main(String[] args) {
        System.out.println("creating child");
        //var child = new Child(1);
        try(//var os = new FileOutputStream(PATH_TO_FILE);
            //var oos = new ObjectOutputStream(os);
            var is = new FileInputStream(PATH_TO_FILE);
            var ois = new ObjectInputStream(is)){
            //System.out.println("Serializing...");
            //oos.writeObject(child);
            System.out.println("Deserializing...");
            var fromFile = (Child) ois.readObject();
            System.out.println(fromFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
