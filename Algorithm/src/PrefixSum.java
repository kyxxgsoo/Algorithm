public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] pSum = new int[arr.length];

        // pSum은 1부터 시작하는 것이 좋다.
        // (나중에 구간 합 구할 때, a ~ b의 구간합을 구하려면 pSum[b] - pSum[a - 1]로 값을 구해야한다.
        // 이 때, arr도 0이 아니라 1번째 index 부터 채워넣어야 생각하고 구현하기 편하다.
        for (int i = 1; i < pSum.length; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
            System.out.println(pSum[i]);
        }

        // index 4 ~ 6의 구간 합을 출력하는 예시 (4 + 5 + 6) = 15
        System.out.println(pSum[6] - pSum[4 - 1]);
    }
}
