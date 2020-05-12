package sem;

public class VectorCode {



    public VectorCode(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public void add(int x) {
        ListElement element = new ListElement();
        element.setValue(x);
        ListElement head;
        if (head == null) {
            setHead(element);
            length++;
            return;
        }
        int i = 0;
        ListElement hhhhhhh = head;
        while (hhhhhhh.getNext()!=null) {
            hhhhhhh.setPos(i);
            hhhhhhh = hhhhhhh.getNext();
            i++;
        }
        hhhhhhh.setNext(element);
        length++;
    }

    public void go() {
        ListElement gg = head;
        while (gg != null) {
            System.out.println(gg.getValue());
            gg = gg.getNext();
        }
    }

    public void VectorSum(int[] arr) {
    }
    public VectorCode VectorSum(VectorCode v) {
        VectorCode newList = new VectorCode();
        ListElement n = head;
        int i = 0;
        while (n.getNext() != null) {
            n = n.getNext();
            n.setPos(i);
            i++;
        }
        int sum = 0;
        while (i != -1) {
            sum += n.getPos(i);
            n.getNext();
            newList.add(sum);
            i--;
            System.out.println(sum);
        }
        return newList;
    }

        public VectorCode(){
        }

    public void mult(int a,int c) {
        ListElement elem = head;
        while(elem != null) {
            if(elem.getValue() == a) {
                elem.setValue(elem.getValue() * c);
            }
            elem = elem.getNext();
        }
        }

    private VectorCode sum(VectorCode v){
        VectorCode vector = new VectorCode();
        ListElement v1 = this.getHead();
        ListElement v2 = v.getHead();
        int summa = 0;
        while (v1 != null){
            summa = v1.getValue()+v2.getValue();
            v1 = v1.getNext();
            v2 = v2.getNext();
            vector.add(summa);
        }
        return vector;
    }


    public void insert(int k, int pos) {
        ListElement elem = new ListElement();
        ListElement cnt = new ListElement();
        cnt.getValue(pos-1);
        if (cnt == null) {
            elem.setNext(head);
            head= elem;
        } else {
            elem.setNext(cnt.getNext());
            cnt.setNext(elem);
        }
    }

    public static int[] decode (VectorCode list) {
        ListElement аabb = list.getHead();
        int[] array1 = new int[list.length];
        for (int i = 0; i < array1.length; i++){
            array1[i] = аabb.getValue();
            аabb = аabb.getNext();
        }
        return array1;
    }

    public void delete(int pos){
        ListElement list = new ListElement();
        int current =list.getValue(getPos(pos));
        if (current!=0) {
            list.setValue(0);
        }
    }
    public int scalarProduct(VectorCode v){
        ListElement v1 = this.head;
        ListElement v2 = v.getHead();
        int scalarprod = 0;
        while(v1!=null) {
            scalarprod += v1.getValue() * v2.getValue();
            v1.getNext();
            v2.getNext();
        }
        return scalarprod;
    }
}