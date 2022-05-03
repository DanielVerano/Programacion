package Stax;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
//        Contar el número de veces que aparece el nombre de un producto
        XMLInputFactory xmlif = XMLInputFactory.newInstance();
        Scanner sc = new Scanner(System.in);
        String producto;
        int cantidad = 0;

        System.out.println("Introduce el producto a buscar:");
        producto = sc.nextLine();

        try {
            XMLEventReader eventReader = xmlif.createXMLEventReader(new FileInputStream("pedidos.xml"));

            while (eventReader.hasNext()) {
                XMLEvent xmlEvent = eventReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                } else if (xmlEvent.isCharacters()) {
                    Characters characters = xmlEvent.asCharacters();

                    if (characters.getData().equals(producto)) cantidad++;
                }
            }

            System.out.println("Hay " + cantidad + " de " + producto);
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
