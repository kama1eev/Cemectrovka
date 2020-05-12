package sem;

class TestMethods1 {
    public static void main(String[] args) throws  NullPointerException{
        testDelete();
        testScalar();
        testSum();
        testVectorSum();
        testMult();
    }


    public static void testDelete() {
        testDelete1();
        testDelete2();
    }

    public static void testScalar() {
        testScalar1();
        testScalar2();
    }

    public static void testSum() {
        testSum1();
        testSum2();
    }

    public static void testVectorSum() {
        testVectorSum1();
        testVectorSum2();
    }


    public static void testMult() {
        testMult1();
        testMult2();
    }


    public static void testDelete1() {
        ListElement list = new ListElement();
        int num = 2;
        int arr[] = new int[]{1, 2, 3, 4};
        int current = list.getValue(num);
        if (current != 0) {
            list.setValue(0);
            System.out.println("success1");
        } else {
            System.out.println("fail1");
        }

    }

    public static void testDelete2() {
        ListElement list = new ListElement();
        int num = 3;
        int arr[] = new int[]{1, 2, 0, 4};
        int current = list.setValue(arr[num]);;
        if (current != 0) {
            list.setValue(0);
            System.out.println("success2");
        } else {
            System.out.println("fail2");
        }
    }

    public static void testScalar2() {
        ListElement v1 = new ListElement();
        ListElement v2 = new ListElement();
        v1.setValue(2);
        v1.setValue(3);
        v2.setValue(2);
        v2.setValue(3);
        int scalarprod = 0;
        while (v1 != null) {
            scalarprod += v1.getValue() * v2.getValue();
            v1.getNext();
            v2.getNext();
        }
        if (scalarprod == 13) {
            System.out.println("success3");
        } else {
            System.out.println("fail3");
        }
    }

    public static void testScalar1() {
        ListElement v1 = new ListElement();
        ListElement v2 = new ListElement();
        v1.setValue(0);
        v1.setValue(1000);
        v2.setValue(100000000);
        v2.setValue(0);
        int scalarprod = 0;
        while (v1 != null) {
            scalarprod += v1.getValue() * v2.getValue();
            v1.getNext();
            v2.getNext();
        }
        if (scalarprod == 0) {
            System.out.println("success4");
        } else {
            System.out.println("fail4");
        }
    }

    public static void testSum1(){
            VectorCode vector = new VectorCode();
            ListElement v1 = new ListElement();
            v1.setValue(3);
            v1.setValue(15);
            ListElement v2 = new ListElement();
            v2.setValue(5);
            v2.setValue(0);
            int summa = 0;
            while (v1 != null) {
                summa = v1.getValue() + v2.getValue();
                v1 = v1.getNext();
                v2 = v2.getNext();
                if (summa==8 || summa==15){
                    System.out.println("success5");
                }else {
                    System.out.println("fail5");
                }
                vector.add(summa);
            }
    }
    public static void testSum2(){
        VectorCode vector = new VectorCode();
        ListElement v1 = new ListElement();
        v1.setValue(-15);
        v1.setValue(15);
        ListElement v2 = new ListElement();
        v2.setValue(-45);
        v2.setValue(45);
        int summa = 0;
        while (v1 != null) {
            summa = v1.getValue() + v2.getValue();
            v1 = v1.getNext();
            v2 = v2.getNext();
            if (summa==0){
                System.out.println("success6");
            }else {
                System.out.println("fail6");
            }
            vector.add(summa);
        }
    }

    public static void testVectorSum1() {
        VectorCode newList = new VectorCode();
        int x = 5;
        ListElement n  = new ListElement();
        n.setValue(x);n.setValue(x);

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
        if (sum==15){
            System.out.println("success7");
        }else {
            System.out.println("fail7");
        }
    }
    public static void testVectorSum2() {
        VectorCode newList = new VectorCode();
        int x = 5;
        int y = 10;
        int z = 7;
        ListElement n  = new ListElement();
        n.setValue(x);n.setValue(y);n.setValue(z);
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
            if(sum==5||sum==15||sum==22){
                System.out.println("success8");
            }else {
                System.out.println("fail8");
            }
        }
        if (sum==15){
            System.out.println("success9");
        }else {
            System.out.println("success9");
        }
    }

    public static void testMult1(){
        ListElement elem = new ListElement();
        int a = 5;
        int c = 777;
        int i =0;
        elem.setValue(15);elem.setValue(5);elem.setValue(1111);elem.setValue(5);elem.setValue(5);
        while(elem != null) {
            if(elem.getValue() == a) {
                elem.setValue(elem.getValue() * c);
                i++;
            }
            elem = elem.getNext();
        }
        if (i==3) {
            System.out.println("success10");
        }else {
            System.out.println("fail10");
        }
    }
    public static void testMult2(){
        ListElement elem = new ListElement();
        int a = 5;
        int c = 777;
        int i =0;
        elem.setValue(15);elem.setValue(7);elem.setValue(1111);elem.setValue(55);elem.setValue(55);
        while(elem != null) {
            if(elem.getValue() == a) {
                elem.setValue(elem.getValue() * c);
                i++;
            }
            elem = elem.getNext();
        }
        if (i==0) {
            System.out.println("success11");
        }else {
            System.out.println("fail11");
        }
    }
}