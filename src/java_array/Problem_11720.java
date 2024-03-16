package java_array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_11720 {
    /**
     * 문제: https://www.acmicpc.net/problem/11720
     * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
     *
     * 출력
     * 입력으로 주어진 숫자 N개의 합을 출력한다.
     * @param args
     */
    public static void main(String[] args) {
        /*
        1. n값을 입력받는다. (1 ≤ n ≤ 100)
        2. n개로 이루어진 정수를 문자열로 받는다.
        3. i위치에 있는 문자를 반환하여 char로 담는다.
        4. char[i]를 숫자로 반환하여 숫자배열에 담는다.
        5. 숫자 배열 값의 합을 반환한다.

        - toCharArray()사용하여 char[]로 담은후 숫자로 변환하여 합산하는 방법
        - Character.getNumericValue() 메서드는 주어진 문자에 해당하는 숫자 값을 변환하여 합산하는 방법
            -> '0' ~ '9' 사이의 문자가 주어지면 해당하는 숫자를 반환 이외에는 -1을 반환.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numberStr = sc.next();
        char chars[] = numberStr.toCharArray();
        int numbers[] = new int[n];
        for (int i=0; i<n; i++) {
            numbers[i] = Character.getNumericValue(chars[i]);
        }

        long sum = Arrays.stream(numbers).sum();

        System.out.println(sum);
    }

}
