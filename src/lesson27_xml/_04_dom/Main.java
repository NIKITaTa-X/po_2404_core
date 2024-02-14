package lesson27_xml._04_dom;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        DomParser.parseXml().forEach(System.out::println);
    }
}
