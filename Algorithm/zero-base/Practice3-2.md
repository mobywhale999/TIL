Practice2
===

문제 설명
---

주어진 nums 배열에서 두 번 나타나는 모든 정수의 배열을 반환하는 프로그램을 작성하세요.  
* nums 배열은 [1, n] 범위의 정수로 이루어져 있다.
* 각 정수는 한 번 또는 두 번 나타날 수 있다.


반환을 위한 메모리 공간 외에 추가 적인 배열 사용은 하지 않는다.


입출력 예시
---
|입력|출력|
|---|---|
|4, 3, 2, 7, 8, 2, 3, 1|2, 3|
|1, 1, 2|1|
|1, 3, 1, 3, 5, 5|1, 3, 5|

## Solution.java
```java
import java.util.ArrayList;

public class Practice2 {
    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // [1, n]의 범위로 이루어져 있는 것과 최대 2번 까지 나타날 수 있는 것을 이용
        // 각 원소의 값을 인덱스 삼아 해당 위치의 값에 부호처리를 하면
        // 같은 값이 있는지 여부를 체크할 수 있음
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                list.add(Math.abs(index + 1));
            }

            nums[index] = -nums[index];
        }
        return list;
    }

    public static void main(String[] args) {
        // Test code
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(solution(nums));

        nums = new int[]{1, 1, 2};
        System.out.println(solution(nums));

        nums = new int[]{1, 3, 1, 3, 5, 5};
        System.out.println(solution(nums));
    }
}
```
