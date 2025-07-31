public class Permutation1 {

    static int[] arr = {1, 2, 3, 4, 5};
    static int r = 3;

    static void print() {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void permutation(int depth) {
        if (depth == r) {
            print();
            return;
        }

        for (int i = depth; i < arr.length; i++) {
            swap(depth, i);
            permutation(depth + 1);
            swap(depth, i);
        }
    }

    public static void main(String[] args) {
        permutation(0);

    }
}
