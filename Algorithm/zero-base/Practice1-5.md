Practice5
===

문제 설명
---
n개의 데이터가 height 배열에 주어졌다.  
height 배열의 각각의 원소는 아래 그림과 같이 각 벽에 대한 높이를 의미한다.

이와 같이 높이 값들이 주어졌을 때,  
이 중에서 어떤 두 벽을 고르면 가장 많은 물을 담을 수 있는지를 확인하고  
그 때의 면적을 출력하세요.

![](https://velog.velcdn.com/images/mobywhale/post/d9f17433-07e3-4036-b996-7f191803d313/image.png)

입출력 예시
---
|입력|출력|
|---|---|
|1, 8, 6, 2, 5, 4, 8, 3, 7|49|
|5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2|26|

## Solution.java
```java

public class Practice5 {
    public static int solution(int[] height) {
    	int left = 0;
    	int right = height.length - 1;
    	int maxArea = 0;
 
    	while (left < right) {
    		
	    	int x = (right - left);
	    	int y = height[right] < height[left] ? height[right] : height[left];
	    	int curArea = x * y;
	    	maxArea = maxArea > curArea ? maxArea : curArea;
	    	
	    	if (height[left] < height[right]) {
	    		left++;
	    	} else if (height[left] > height[right]) {
	    		right--;
	    	}
	    	
    	}
    	
    	return maxArea;
  
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}
```
