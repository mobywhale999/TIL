Practice2
===

문제 설명
---
정수형 숫자를 로마 숫자 표기로 변환하는 프로그램을 작성하세요.

로마 숫자 표기법은 I, V, X, L, C, D, M 으로 이루어져있다.

|로마 숫자|정수형|
|---|---|
|I|1|
|V|5|
|X|10|
|L|50|
|C|100|
|D|500|
|M|1000|


로마 숫자 표기 방식
* 큰 기호에서 작은 기호 방향으로 작성 (XI, VI, II, ...)
* 다음의 경우 작은 기호가 큰 기호 앞에 올 수 있다.
    * I 는 V 와 X 의 앞에 올 수 있다. (IV: 4, IX: 9)
    * X 는 L 과 C 의 앞에 올 수 있다. (XL: 40, XC: 90)
    * C 는 D 와 M 의 앞에 올 수 있다. (CD: 400, CM: 900)

입출력 예시
---

|입력|출력|
|---|---|
|3|"III"|
|4|"IV"|
|6|"VI"|
|13|"XIII"|
|26|"XXVI"|
|1994|"MCMXCIV"|

## Solution.java
```java

public class Practice2 {

    public static String solution(int num){
        String result = "";
        
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        int i = 0;
        while (num > 0) {
        	while (num >= values[i]) {
        		num -= values[i];
        		result += roman[i];
        	}
        	i++;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(6));
        System.out.println(solution(13));
        System.out.println(solution(26));
        System.out.println(solution(1994));
    }
}
```
