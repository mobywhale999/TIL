Practice1
===

문제 설명
---

정수형 오름차순 데이터가 nums 라는 배열에 주어졌다.  
현재 배열 내에는 중복된 데이터들이 들어있을 수 있는데 해당 중복들을 제거하는 프로그램을 작성하세요.

이 때, 추가 배열을 사용하지 않고 중복 데이터들을 제거해야 하며  
nums 배열 하나 만 사용하여 중복 데이터를 제거 후  
정렬된 데이터를 출력하세요.


입출력 예시
---
|입력|출력|
|---|---|
|1, 1, 2|1, 2|
|0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4|0, 1, 2, 3, 4|

## Solution.java
```java

public class Practice1 {
    public static void solution(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            // 정렬되어 있는 배열이므로 idx 가 0일 때와, 이전 값보다 클 때만 nums 에 업데이트
            if (idx == 0 || num > nums[idx - 1]) {
                nums[idx++] = num;
            }
        }

        System.out.print("[" + idx + "] ");
        for (int i = 0; i < idx; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test code
        solution(new int[] {1, 1, 2});
        solution(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
```
