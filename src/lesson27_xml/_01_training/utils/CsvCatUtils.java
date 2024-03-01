package lesson27_xml._01_training.utils;

import lesson27_xml._01_training.exceptions.TxtException;
import lesson27_xml._01_training.model.CsvCat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvCatUtils {
    public static final String PATH_TO_FILE = "src/lesson27_xml/_01_training/resources/cats.csv";

    public static List<CsvCat> extaractFromFile() {
        var cats = new ArrayList<CsvCat>();
        try (var sc = new Scanner(new FileInputStream(PATH_TO_FILE))) {
            while (sc.hasNextLine()) {
                try {
                    cats.add(CsvCatFactory.getInstance(sc.nextLine()));
                } catch (TxtException e) {
                    System.err.println(e);
                    System.err.println("Message: " + e.getCause().getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found!!!");
        }
        return cats;
    }

    public static void printCats(List<CsvCat> cats) {
        cats.forEach(System.out::println);
    }
}
