Practice5
===

문제 설명
---
n개의 정수형 데이터가 height 배열에 주어졌다.  
height 배열의 각각의 원소는 아래 그림과 같이 각 벽에 대한 높이를 의미한다.

이와 같이 높이 값들이 주어졌을 때,  
벽 사이사이의 빈 공간에 담을 수 있는 물의 총량을 출력하세요.

![](https://velog.velcdn.com/images/mobywhale/post/370bdaf4-67b7-497d-8775-0934d4562058/image.png)

입출력 예시
---
|입력|출력|
|---|---|
|0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1|6|
|4, 2, 0, 3, 2, 5|9|

## Solution.java
```java

public class Practice5 {
    public static int solution(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        // 좌, 우 인덱스 설정
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;

        while (left < right) {
            if (height[left] < height[right]) { // 왼쪽 벽이 낮은 경우
                if (height[left] >= leftMax) { // 이전의 왼쪽 최대 높이 벽보다 더 큰 경우,
                    leftMax = height[left];     // 물이 담기진 않고 벽 높이 갱신
                } else {
                    result += leftMax - height[left];   // 그 외의 경우는 높이 줄어든 만큼 물이 담김
                }
                left++;
            } else {    // 오른쪽 벽이 낮은 경우
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    result += rightMax - height[right];
                }
                right--;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        // Test code
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(solution(height));

        height = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(solution(height));
    }
}
```
