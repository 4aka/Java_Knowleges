package XML;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public class XMLParserStAX {

	public static final String currentDir = System.getProperty("user.dir");
	public static final String path = currentDir + "/resources/";

	File result = new File(path + "result.txt");
	final static String fileName = path + "UO.xml";

	public static void main(String[] args) {

		try {
			XMLStreamReader xmlr = XMLInputFactory.newInstance().createXMLStreamReader(fileName,
					new FileInputStream(fileName));

			while (xmlr.hasNext()) {
				xmlr.next();
				if (xmlr.hasText()) {
					if (xmlr.getText().contains("62.01")) {
						System.out.println(xmlr.getText());
					}
				}
			}
		} catch (FileNotFoundException | XMLStreamException ex) {
			ex.printStackTrace();
		}
	}

	public static void write() {
		try {
			XMLOutputFactory output = XMLOutputFactory.newInstance();
			XMLStreamWriter writer = output.createXMLStreamWriter(new FileWriter("result.xml"));

			writer.writeStartDocument("1.0");
			writer.writeStartElement("Result");
			// Делаем цикл для книг
			for (int i = 0; i < 5; i++) {
				// Записываем Book
				writer.writeStartElement("FIO");
				writer.writeStartElement("KVED");
				writer.writeCharacters("Number #" + i);
				writer.writeEndElement();
				writer.writeEndElement();
			}
			writer.writeEndElement();
			writer.writeEndDocument();
			writer.flush();
		} catch (XMLStreamException | IOException ex) {
			ex.printStackTrace();
		}
	}
}