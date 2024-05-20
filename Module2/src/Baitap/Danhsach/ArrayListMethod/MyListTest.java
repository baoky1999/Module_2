package Baitap.Danhsach.ArrayListMethod;

public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList(20);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1,"F");
        list.add(2,"D");
        list.remove(1);
        list.clone();
        System.out.println(list.contains("H"));
        System.out.println(list.size());
        System.out.println(list.add("K"));
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.clear();
        System.out.println(list.size());

    }
}
