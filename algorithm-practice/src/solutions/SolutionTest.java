package solutions;

import java.util.*;

// 알고리즘 문제
class Solution {
    public int[] solution(int[] arr, int divisor) {


        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.isEmpty()){
            list.add(-1);
        }

        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}