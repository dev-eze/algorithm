package java_problem;

import java.io.IOException;
import java.util.Scanner;

public class Problem_2018 { // 투 포인터, 연속된 자연수의 합 구하기
    /**
     * 문제
     * 어떠한 자연수 N은, 몇 개의 연속된 자연수의 합으로 나타낼 수 있다. 당신은 어떤 자연수 N(1 ≤ N ≤ 10,000,000)에 대해서, 이 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 알고 싶어한다. 이때, 사용하는 자연수는 N이하여야 한다.
     *
     * 예를 들어, 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5의 4가지가 있다. 반면에 10을 나타내는 방법은 10, 1+2+3+4의 2가지가 있다.
     *
     * N을 입력받아 가지수를 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫 줄에 정수 N이 주어진다.
     *
     * 출력
     * 입력된 자연수 N을 몇 개의 연속된 자연수의 합으로 나타내는 가지수를 출력하시오
     */
    public static void main(String[] args) throws IOException {
        /*
            1. n 입력 받는다.
            2. 필요값을 초기화 한다.
            3. 투포인터를 이용하여 카운팅하여 반환한다.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 1;
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;

        while (endIndex != n) {
            if (sum == n) {
                count++; endIndex++; sum = sum + endIndex;
            } else if (sum > n) {
                sum = sum - startIndex; startIndex++;
            } else { // sum < n
                endIndex++; sum = sum + endIndex;
            }
        }
        System.out.println(count);
    }
}
