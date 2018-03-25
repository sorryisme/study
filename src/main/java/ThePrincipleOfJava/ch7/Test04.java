package ThePrincipleOfJava.ch7;



public class Test04 {
    public static Parseable getParser(String type) {
        if(type.equals("XML")){
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed" );
    }
}

class HTMLParser implements Parseable{
    public void parse(String fileName) {
        System.out.println(fileName + "-HTML Parsing completed");
    }
}

