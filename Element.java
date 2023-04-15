public class Element<T> {
    private T element;
    private Element<T> prev;
    private Element<T> next;
    private int index;

    public Element(T element, Element<T> prev, Element<T> next, int index) {
        this.element = element;
        this.prev = prev;
        this.next = next;
        this.index = index;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Element<T> getPrev() {
        return prev;
    }

    public void setPrev(Element<T> prev) {
        this.prev = prev;
    }

    public Element<T> getNext() {
        return next;
    }

    public void setNext(Element<T> next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        String prevs;
        String nexts;
        if (prev == null) prevs = "Отсутствует";
        else prevs = prev.simple();
        if (next == null) nexts = "Отсутствует";
        else nexts = next.simple();
        return "Node\n" +
                "element=" + element +
                "\nprev=" + prevs +
                "\nnext=" + nexts +
                "\nindex=" + index +
                '.';
    }

    public String simple (){

        return String.format("%d : %s", index, element);
    }
}
