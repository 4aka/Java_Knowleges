package XML;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLParserSAX {
	// http://java-course.ru/begin/xml/

	public static final String currentDir = System.getProperty("user.dir");
	public static final String path = currentDir + "/resources/";

	public static void main(String[] args) {

		final String fileName = path + "test.xml";

		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {
				boolean record = false;

				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes) {
					if (qName.equalsIgnoreCase("KVED")) {
						record = true;
					}
				}

				@Override
				public void characters(char[] ch, int start, int length) {
					if (record) {
						new String(ch, start, length);
						System.out.println(ch);
						System.out.println(start);
						System.out.println(length);
						record = false;
					}
				}
			};
			saxParser.parse(fileName, handler);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}