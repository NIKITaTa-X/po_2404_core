package lesson27_xml._05_stax;

import lesson27_xml._02_xml.XmlCat;

public class Main {
    public static void main(String[] args) {
        StaxParser.parseXml().forEach(System.out::println);
    }
}
