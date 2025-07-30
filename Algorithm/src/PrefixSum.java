public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] pSum = new int[arr.length - 1];

        pSum[0] = arr[0];
        for (int i = 1; i < pSum.length; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        // index 4 ~ 6의 구간 합을 출력하는 예시 (5 + 6 + 7)
        System.out.println(pSum[6] - pSum[3]);
    }
}
