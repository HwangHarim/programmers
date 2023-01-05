package org.programmers.LV_1.최대공약수_최소공배수_문제;

public class Solution {

    public static void main(String[] args) {

    }
    public int[] solution(int n, int m) {

        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);

        answer[0] = gcd(big, small);
        answer[1] = big*small/answer[0];

        return answer;
    }

    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
