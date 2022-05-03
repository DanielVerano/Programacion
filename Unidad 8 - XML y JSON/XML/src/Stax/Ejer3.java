package Stax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ejer3 {
    public static void main(String[] args) {
//        Volcar a un fichero XML una lista de módulos
        Modulo mod1 = new Modulo("LM", 4, 1);
        Modulo mod2 = new Modulo("PROG", 8, 2);
        Modulo mod3 = new Modulo("BBDD", 6, 3);
        Modulo mod4 = new Modulo("SSII", 6, 4);
        Modulo mod5 = new Modulo("ENDES", 3, 5);
        Modulo mod6 = new Modulo("FOL", 3, 6);

        XMLOutputFactory xmlof = XMLOutputFactory.newInstance();

        try {
//            Escritor de eventos
            XMLEventWriter eventWriter = xmlof.createXMLEventWriter(new FileOutputStream("modulos.xml"));

//            Creador de eventos
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
