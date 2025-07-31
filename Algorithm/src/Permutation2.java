import java.util.*;

public class Permutation2 {

    static int[] arr = {1, 2, 3, 4, 5};
    static int r = 3;
    static boolean[] isVisited = new boolean[5];
    static int[] answer = new int[5];

    static void print() {
        for (int i = 0; i < r; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }

    static void permutation(int depth) {
        if (depth == r) {
            print();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                answer[depth] = arr[i];
                permutation(depth + 1);
                isVisited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        permutation(0);

    }
}
