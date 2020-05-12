package sem;

public class ListElement {
    private int value;
    private ListElement next ;
    private int pos;

    public void setPos(int pos,int i) {
        this.pos = pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos(int i) {
        return pos;
    }

    public int getPos() {
        return pos;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public int setValue(int value) {
        this.value = value;
        return value;
    }

    public int getValue(int pos) {
        return value;
    }

    public ListElement getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }
}
