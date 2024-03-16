package java_array;

import java.util.Arrays;
import java.util.Scanner;

public class P_1546 {
    /**
     * 문제 : https://www.acmicpc.net/problem/1546 평균구하기
     *
     * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
     *
     * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
     *
     * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
     *
     * 출력
     * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
     * @param args
     */
    public static void main(String[] args) {
        /*
        1. 점수를 n개를 입력받는다. (0<n<=1000, 0<점수<=100)
        2. 입력된 점수를 배열에 담는다.
        3. 배열중 가장 최고 값 max을 구한다.
        4. 반복문으로 각 점수 score/M*100을 구하여 저장한다.
        5. n으로 나눈 값을 avg에 담아 출력한다.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = new int[n];

        for(int i=0; i<n; i++) {
            scores[i] = sc.nextInt();
        }

        int max = Arrays.stream(scores).max().getAsInt();

        double sum = 0;
        double avg ;
        for(int i=0; i<n; i++) {
            sum += ((scores[i] / (double)max)*100);
        }

        avg = sum / n;
        System.out.println(avg);
    }
}
