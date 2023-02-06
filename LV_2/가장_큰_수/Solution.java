package org.programmers.LV_2.가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        int[] a={10,9,82,1,29,91};
        System.out.println(solution(a));
    }

    public static String solution(int[] numbers) {
        String answer = "";

        // 1. 입력 데이터를 문자열 배열로 변환.
        String[] str = new String[numbers.length];

        for(int i = 0 ; i<str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }

        // 2. Comparator 인터페이스로 정렬 기준을 설정.
        Arrays.sort(str,new Comparator<String>(){
            // 예제 입력1에서 6과 10을 생각해보면 o2가 6, o1이 10이 된다. 이를 지속해서 반복.
            public int compare(String o1,String o2){
                System.out.println(Arrays.toString(str));
                System.out.println((o2+o1).compareTo(o1+o2));
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 3. 모든 문자열을 연결한다.
        for(String arr : str)
            answer+=arr;

        // 4. 입력 데이터가 모두 0인 경우 예외 처리.
        if(str[0].equals("0")) answer = "0";

        return answer;
    }
}