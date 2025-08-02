import java.util.*;

public class Combination {

    static int[] arr = {1, 2, 3, 4, 5};
    static int r = 3;
    static List<Integer> list = new ArrayList<>();

    static void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    static void combination(int start) {
        if (list.size() == r) {
            print();
            return;
        }

        for (int i = start + 1; i < arr.length; i++) {
            list.add(arr[i]);
            combination(i);
            list.remove(list.size() - 1);
        }

        return;
    }

    public static void main(String[] args) {
        combination(-1);
    }
}
