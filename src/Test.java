import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        int a = al.get(0);
        System.out.println(a);
        System.out.println(al);
    }
}