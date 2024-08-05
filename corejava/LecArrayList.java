import java.util.*;

public class LecArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(1);
        System.out.println(list);

        // System.out.println(list.get(1));
        Collections.sort(list);
        System.out.println(list);

    }
}
