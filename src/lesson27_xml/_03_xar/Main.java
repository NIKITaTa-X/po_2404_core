package lesson27_xml._03_xar;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static final String PATH = "src/lesson27_xml/_03_xar/cats.xml";

    public static void main(String[] args) {
        try {
            var factory = SAXParserFactory.newInstance();
            var parser = factory.newSAXParser();
            var handler = new SaxHandler();
            parser.parse(new FileInputStream(PATH), handler);
            var cats = handler.getCats();
            cats.forEach(System.out::println);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
