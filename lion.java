import java.util.*;

class Main {
    static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getList());
    }
}
