package java_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_11659 { // 구간합 구하기
    /**
     * 문제
     * 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
     *
     * 출력
     * 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
     *
     * 제한
     * 1 ≤ N ≤ 100,000
     * 1 ≤ M ≤ 100,000
     * 1 ≤ i ≤ j ≤ N
     */
    public static void main(String[] args) throws IOException {
        /*
            질의 한번에 최악의 케이스인경우 10만번의 연산를 10만번 가능 (100000*100000 = 10000000000) 1억번의 연산은 자바에서 보통 1초로 시간제한 0.5초안에 풀어야 한다.

            1. 수의 개수 n개와 횟수 m을 입력받는다.
            2. 2번째에 n개의 수 number을 입력받는다. (number <=1000)
            3. 3번째에 구간합 i, j를 입력받는다. (i~j)
            4. 합배열을 만든다.
            5. 구간합 s[i

         */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[n+1];

        stringTokenizer = new StringTokenizer(bf.readLine());
        // 합배열 구하기
        for (int i=1; i<=n; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // 질문 받아 합 구간합 구하기
        for (int i=0; i<m; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            int from = Integer.parseInt(stringTokenizer.nextToken());
            int to = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[to] - S[from-1]);
        }
    }

}
