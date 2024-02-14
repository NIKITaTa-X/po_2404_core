package lesson27_xml._06_jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.*;
import java.util.List;

public class JaxbUtils {
    public static final String PATH_TO_FILE = "src/lesson27_xml/_06_jaxb/cats.xml";
    public static final String PATH_TO_OUT = "src/lesson27_xml/_06_jaxb/out.xml";

    public static List<CatJaxb> unmarshal() throws JAXBException, FileNotFoundException {

        var jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        var unmarsheller = jaxbContext.createUnmarshaller();
        var catAggregator = (CatAggregator) unmarsheller.unmarshal(new FileReader(PATH_TO_FILE));
        return catAggregator.getCats();
    }

    public static void marshal(List<CatJaxb> cats) throws JAXBException, IOException {
        var catAggregator = new CatAggregator();
        catAggregator.setCats(cats);
        var jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        var marsheller = jaxbContext.createMarshaller();
        marsheller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marsheller.marshal(catAggregator, new FileWriter(PATH_TO_OUT));

    }
}
