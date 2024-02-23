import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    Element element = new Element(6, null, null);

    for (int i = 0; i < 20; i++) {
        int number = (int) (Math.random() * 20);
        element.add(number);
        System.out.println(number);
    }
    element.showAll();
    Element el = element.search(2);
    System.out.println(el.number);
    System.out.println(Element.shag);
    }
}
