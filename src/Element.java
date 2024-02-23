public class Element {
    static int shag = -1;
    int number;
    Element element1;
    Element element2;

    public Element(int number, Element el1, Element el2) {
        this.number = number;
        element1 = el1;
        element2 = el2;
    }
    public void add(int number) {
        if (number == this.number) {
            return;
        }
        if (number > this.number) {
            if (element2 == null) {
                element2 = new Element(number, null, null);
            } else {
                element2.add(number);
            }
        } else {
            if (element1 == null) {
                element1 = new Element(number, null, null);
            } else {
                element1.add(number);
            }
        }

    }

    public Element search(int number) {
        shag++;
        if (number == this.number) {
            return this;
        }
        if (number > this.number && element2 != null) {
            return element2.search(number);
        }
        if (element1 != null) {
            return element1.search(number);
        }
        return null;
    }
    public void showAll() {
        if (element2 != null) {
            System.out.print(number + " ==> " + element2.number + " and ");
        } else {
            System.out.print(number + " ==> " + "null" + " and ");
        }
        if (element1 != null) {
            System.out.println(number + " ==> " + element1.number);
        } else {
            System.out.println(number + " ==> " + "null");
        }
        if (element2 != null) element2.showAll();
        if (element1 != null) element1.showAll();
    }
}
