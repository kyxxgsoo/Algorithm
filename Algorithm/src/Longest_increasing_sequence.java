import java.util.*;

public class Longest_increasing_sequence {

    static int[] arr = { 10, 20, 10, 30, 20, 50 };
    static int[] cache = { 1, 1, 1, 1, 1, 1 };
    static int answer = Integer.MIN_VALUE;
    static int startIdx = -1;
    static int[] lis = { -1, -1, -1, -1, -1, -1 };
    static List<Integer> lisList = new ArrayList<>();

    static void go(int idx) {
        if (idx == -1) {
            return;
        }
        lisList.add(arr[idx]);
        go(lis[idx]); // lis[idx]에는 prev의 idx가 들어있다.
        return;
    }

    public static void main(String[] args) {

        for (int cur = 0; cur < arr.length; cur++) {
            for (int prev = 0; prev < cur; prev++) {
                // 선택하고 이전 애들을 돌면서 나보다 큰 값이 있으면서 && 이전 캐시 + 1한 값이 내 캐시보다 크면 +1한 값으로 갱신
                if (arr[prev] < arr[cur] && cache[cur] < cache[prev] + 1) {
                    cache[cur] = cache[prev] + 1;
                    lis[cur] = prev; // 현재 idx의 이전 idx를 저장(trace)

                    // 전체 길이(answer)를 갱신하고, 시작 지점 저장(startIdx의 value를 trace하여 역순으로 추적)
                    if (answer < cache[cur]) {
                        answer = cache[cur];
                        startIdx = cur; // 역으로 추적할 시작 지점을 저장
                    }
                }
            }
        }

        System.out.println(answer + "");
        go(startIdx);

        Collections.reverse(lisList);
        for (int i = 0; i < lisList.size(); i++) {
            System.out.print(lisList.get(i) + " ");
        }
    }
}
