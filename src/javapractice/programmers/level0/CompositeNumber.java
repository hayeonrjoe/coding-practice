package javapractice.programmers.level0;

import java.util.ArrayList;
import java.util.List;

// 합성수 찾기
public class CompositeNumber {
    public int solution(int n) {
        List<Integer> compositeNumbers = new ArrayList<>();
        for (int currentNumber = 4; currentNumber <= n; currentNumber++){
            int divisors = 0;
            for (int i = 1; i <= currentNumber; i++){
                if (currentNumber % i == 0){
                    divisors++;
                }
            }
            if (divisors >= 3){
                compositeNumbers.add(currentNumber);
            }
        }
        int answer = compositeNumbers.size();
        return answer;
    }
}
// 합성수 찾기
// 문제 설명
// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
//
// 제한사항
// 1 ≤ n ≤ 100
//
// 입출력 예
// n	result
// 10	5
// 15	8
//
// 입출력 예 설명
// 입출력 예 #1
// 10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다.
//
// 입출력 예 #1
// 15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.