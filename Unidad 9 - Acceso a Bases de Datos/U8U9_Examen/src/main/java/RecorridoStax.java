import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RecorridoStax {
    public static void main(String[] args) {
        XMLInputFactory xmlif = XMLInputFactory.newInstance();

        try {
            XMLEventReader xmlEventReader = xmlif.createXMLEventReader(new FileInputStream("restaurante.xml"));

            String tagActual = "";
            ArrayList<Plato> platos = new ArrayList<>();
            Plato platoActual = null;
            int numPlatos = 0;

            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                    switch (startElement.getName().getLocalPart()) {
                        case "plato":
                            platoActual = new Plato();
                            Attribute caloriasAttr = startElement.getAttributeByName(new QName("calorias"));
                            platoActual.setCalorias(Integer.parseInt(caloriasAttr.getValue()));
                            numPlatos++;
                            break;
                        case "nombre":
                            tagActual = "nombre";
                            break;
                        case "precio":
                            tagActual = "precio";
                            break;
                        default:
                            break;
                    }
                } else if (xmlEvent.isCharacters()) {
                    Characters characters = xmlEvent.asCharacters();

                    switch (tagActual) {
                        case "nombre":
                            platoActual.setNombre(characters.getData());
                            break;
                        case "precio":
                            platoActual.setPrecio(Double.parseDouble(characters.getData()));
                            break;
                        default:
                            break;
                    }
                    tagActual = "";
                } else if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();

                    if (endElement.getName().getLocalPart().equals("plato")) {
                        platos.add(platoActual);
                    }
                }
            }

//            System.out.println(platos);

            Collections.sort(platos, new Comparator<Plato>() {
                @Override
                public int compare(Plato plato, Plato t1) {
                    return plato.getCalorias() - t1.getCalorias();
                }
            });

            System.out.println("El plato con menos calorías es: " + platos.get(0));
            System.out.println("Hay " + numPlatos + " platos en la carta");

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero");
        }
    }
}
