package ThePrincipleOfJava.ch7;

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = Test04.getParser("XML");
        parser.parse("documnet.xml");
        parser = Test04.getParser("HTML");
        parser.parse("document2.html");
    }
}
