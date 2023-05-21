# java-기초

## 1. Java 소개

### 자바 (JAVA)
- 프로그래밍 언어 중 하나
    - 프로그래밍 언어 선호도 3위 (TIOBE index 2021년 12월)

### 자바 특징
- 플랫폼 독립적
    - 운영체제에 따라 코드를 재 작성하지 않아도 됨
- 객체 지향적
    - 절차 지향적 언어에 비해 생산성 높음, 보안성 높
```mermaid
graph LR
A[자바 소스 코드 : Program.java]-->B(자바 컴파일러)
B-->C[바이트 코드 : Program.class]-->D[JVM]-->실행
```

### 자바 활용도
- 웹 애플리케이션
- 모바일 애플리케이션
- 엔터프라이즈 애플리케이션
- 웹/앱 서버...

### 자바 플랫폼 (Java Platform)
- Java SE (Standard Editon)
    - 기본 개발 환경
- Java EE (Enterprise Edition)
    - 서버 기반 프로그램 개발 환경
- Java Me (Micro Edition)
    - 모바일, 임베디드 시스템 개발 환경

## 2. 변수와 자료형

### 변수

데이터를 저장하는 메모리 공간에 붙여준 이름
```
int age = 20;
String country = "Korea";
```

### 변수 이름 규칙
| 변수 규칙 | 예시 |
| --- | --- |
| 문자와 숫자, _ (underscore), $ 사용 가능 | int apple = 2000; <br> int apple3 = 6000; <br> int _apple = 2000; |
| 숫자로 시작 X | int 3apple = 6000; |
| 대문자와 소문자 구분 | int apple = 2000; <br> int Apple = 3000; <br> int APPLE = 3500; |
| 공백 사용 X | int one apple = 2000; |
| 미리 예약된 이름 사용 X | int true = 1; <br> int if = 2; <br> int continue = 10; |

### 표기법
- 카멜 표기법 (camelCase)
    - 가장 앞의 문자는 소문자로, 나머지 단어의 첫 문자는 대문자로 표기
        > myName, iPhone, powerPoint
-  파스칼 표기법 (PascalCase)
    - 각 문자의 첫 문자를 대문자로 표기
        > MyName, IPhone, PowerPoint

### 자료형 (Data Type)
- 변수의 종류, 단위
    - 숫자 (Number)
    - 부울 (Boolean)
    - 문자 (Character)
    - 문자열 (String)
    ...
- 변수의 종류에 따라 담을 수 있는 데이터의 타입과 크기가 다름

### 자료형 - 숫자
- 숫자 형태의 자료형
    - 정수 / 실수 / 2진수, 8진수, 16진수

| 종류 | 예시 |
| --- | --- |
| 정수 | int intNum = 10; <br> long longNum = 2147483648L;  |
| 실수 | float floatNum = 01.f; <br> double doubleNum = 3.4028236E38; |
| 2진수, 8진수, 16진수 | 10진수 12를 다른 지수로 표현 시, <br> int numBase2 = 0b1100; <br> int numBase8 = 014; <br> int numBase16 = 0xC; |

### 자료형 - 부울 (Boolean)
참과 거짓을 나타내는 자료형
```
boolean isPass = true;
boolean isOk = false;
```


### 자료형 - 문자 (Character)
한 개의 문자 표현에 사용하는 자료형
```
char keyFirst = 'a';
char keyLast = 'z';
```

### 자료형 - 문자열 (String)
- 문자들로 이루어진 집합
```
String s1 = "Hello World!";
String s2 = "01234";
```

- 문자열 메소드
    - equals, indexOf, replace, substring, toUpperCase

### 자료형 - StringBuffer
- 문자열을 자주 추가하거나 변경할 때 사용하는 자료형
```
StringBuffer sb1 = new StringBuffer("Hello World");
```

- String Buffer 메소드
    - append, insert, substring

### 자료형 - 배열 (Array)
- 많은 수의 데이터를 담을 수 있는 자료형
```
int[] myArray1 = {1, 2, 3, 4, 5};
char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
```

### 자료형 - 리스트 (List)
- 배열과 가티 여러 데이터를 담을 수 있는 자료형
- 추가로 여러가지 메소드를 제공
```
ArrayList l1 = new ArrayList();
l1.add(1);
```
- 리스트 메소드
    - add, get, size, remove, clear, sort, contains

### 자료형 - (Map)
- key, value 형태로 데이터를 저장하는 자료형
```
HashMap<String, String> map = new HashMap<String, String>();
map.put("product", "kiwi");
map.put("price", "9000");
```
- 맵 메소드
    - put, get, size, remove, containsKey

### 자료형 - 제네릭스 (Generics)
- 자료형을 명시적으로 지정
- 제한적일 수 있지만 안정성을 높여주고 형변환을 줄여줌
```
ArrayList<String> l1 = new ArrayList<String>();
HashMap<String, Integer> map1 = new HashMap<String, Integer>();
```

## 3. 연산자
### 항과 연산자
- 단항 연산자 : 항이 한 개
    > num++
- 이항 연산자 : 항이 두 개
    > 1 + 1
- 삼항 연산자 : 항이 세 개
    > (3 > 1) ? 1 : 0

### 대입 연산자 (=)
-  우측의 데이터를 좌측의 변수에 대입
    > int num = 100;

### 부호 연산자 (+, -)
- 부호를 나타내는 연산자
    > +10, -10

### 산술 연산자 (+, -, *, /, %)
- 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%)
    > 10 % 3

### 증가/감소 연산자 (++, --)
- 값을 1만큼 늘리거나 (++), 1만큼 줄임 (--)
    > num++, ++num, num--, --num

### 관계 연산자 (>, <, >=, <=, ==, !=)
- 두 항의 값 크기 비교
- 결과 값은 비교 결과에 따라 true 또는 false
    > 10> 9 <br>
    > 5 != 3

### 논리 연산자 (&&, ||, !)
- 논리식에 대해 참 거짓 판단
- 결과 값은 판단 결과에 따라 true 또는 false
    > (10 > 9) && (1 == 0)<br>
    > (10 > 9) || (1 == 0)

### 복합 대입 연산자
- 대입 연산자와 다른 연산자를 조합한 연산
- 코드를 간결하게 작성할 때 사용
    > num1 += num2; <br>
    > num1 %= num2;

### 2진법
- 컴퓨터에서 데이터 표현에 사용
- 2를 기반으로 하는 숫자체계

| 10진수 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 2진수 | 0 | 1 | 10 | 11 | 100 | 101 | 110 | 111 | 1000 | 1001 | 1010 |

### 2의 보수
- 2의 제곱수에서 빼서 얻은 이진수
    > 2진수 3의 2의 보수 : 11 -> 01

### 비트 연산자
- 비트 단위로 연산
- 기본 연산자와 비트 연산자 비교

| 기본 연산자 | 비트 연산자 |
| --- | --- |
| 5 && 3 <br> 5 \|\| 3 | 0101 & 0011 <br> 0101 \| 0011  |

### 비트 논리 연산자 (&, |, ^, ~)
- AND 연산자 (&)
    - 두 개의 비트 값이 모두 1인 경우에만 결과 1

| bit1 | bit2 | Result |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |
> 5 & 3 -> 1

|  | bit1 | bit2 | bit3 | bit4 |
| --- | --- | --- | --- | --- |
| 5 | 0 | 1 | 0 | 1 |
| 3 | 0 | 0 | 1 | 1 |
| 결과 | 0 | 0 | 0 | 1 |

<br>

- OR 연산자 (|)
    - 두 개의 비트 값중 하나라도 1이면 결과 1

| bit1 | bit2 | Result |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |
> 5 | 3 -> 7

|  | bit1 | bit2 | bit3 | bit4 |
| --- | --- | --- | --- | --- |
| 5 | 0 | 1 | 0 | 1 |
| 3 | 0 | 0 | 1 | 1 |
| 결과 | 0 | 1 | 1 | 1 |

<br>

- XOR 연산자 (^)
    - 두 개의 비트 값이 같으면 0, 다르면 1

| bit1 | bit2 | Result |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |
> 5 ^ 3 -> 6

|  | bit1 | bit2 | bit3 | bit4 |
| --- | --- | --- | --- | --- |
| 5 | 0 | 1 | 0 | 1 |
| 3 | 0 | 0 | 1 | 1 |
| 결과 | 0 | 1 | 1 | 0 |

- 반전 연산자 (~)
    - 비트 값이 0이면 1로, 1이면 0으로 반전

| bit1 | Result |
| --- | --- |
| 0 | 1 |
| 1 | 0 |

>~5 -> -6

|  | bit1 | bit2 | bit3 | bit4 |
| --- | --- | --- | --- | --- |
| 5 | 0 | 1 | 0 | 1 |
| 결과 | 1 | 0 | 1 | 0 |   

<br>

### 비트 이동 연산자 (<<, >>, >>>)
- << 연산자
    - 비트를 왼쪽으로 이동
> 3 << 1

|  | bit1 | bit2 | bit3 | bit4 |
| --- | --- | --- | --- | --- |
| 3 | 0 | 0 | 1 | 1 |
| 결과 | 0 | 1 | 1 | 0 | 

<br>

- \>> 연산자
    - 비트를 오른쪽으로 이동
> 3 >> 1

|  | bit1 | bit2 | bit3 | bit4 |
| --- | --- | --- | --- | --- |
| 3 | 0 | 0 | 1 | 1 |
| 결과 | 0 | 0 | 0 | 1 | 

<br>

- \>>> 연산자
    - 비트를 오른쪽으로 이동 (부호비트 상관 없이 0으로 채움)

<br>

## 4. 조건문
### 조건문 - if
- 조건에 따라 무엇을 실행할지 판단하는 분기 구조
```
if (조건문 1) {
	조건문 1을 만족할 때 실행할 내용;
} else if (조건문 2) {
	조건문 2를 만족할 때 실행할 내용;
} else {
	그 외의 상황에서 실행할 내용;
}
```
### 조건문 - switch
- 입력 값에 따라 어떤 case를 실행할지 판단하는 분기 구조
```
switch (입력 값) {
	case 입력 값 1:
        실행할 내용;
        break;
    case 입력 값 2: …
        실행할 내용;
        break;
	…
	default: 
		실행할 내용;
		break;
}
```

<br>

## 5. 반복문
### 반복문 - for
- 주어진 횟수만큼 반복하여 실행하는 구조
```
for (초기치; 조건문; 증가치;) {
	반복하여 실행할 내용;
}
```
### 반복문 - while
- 조건문이 만족하는 동안 반복하여 실행하는 구조
- while과 do-while 구조가 있음
```
while (조건문) {
	반복하여 실행할 내용;
}

do {
	반복하여 실행할 내용;
} while (조건문);

```

<br>

## 6. 다차원 배열

### 다차원 배열

- 일차원 배열
```
int[] myArray1 = {1, 2, 3, 4, 5};
char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
```
- 다차원 배열
```
int[][] myArray3 = {{1, 2, 3}, {4, 5, 6}};
int[][][] myArray4 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
```
### 이차원 배열
- 이차원 배열의 생성 방법
```
int[][] myArray = {{1, 2, 3}, {4, 5, 6}};
자료형[차원] 변수명 = 초기화 자료

int[][] myArray2 = new int[2][3];
                           행 열
```

> my Array 이차원 배열 구조

| 1 : myArray[0][0] | 2 : myArray[0][1] | 3 : myArray[0][2]|
| --- | --- | --- |
| 4 : myArray[1][0] | 5 : myArray[1][1]| 6 : myArray[0][2] |

## 7. 클래스와 객체
### 클래스 (class)
- 객체를 정의하는 설계도
> 객체 : 사물, 실체
- 붕어빵 틀
- 레시피
- ...

### 객체, 인스턴스
- 객체 (Object)
    - 실체
- 인스턴스 (Instance)
    - 클래스와 객체의 관계
    - 클래스로부터 객체를 선언 (인스턴스 화)
    - 어떤 객체는 어떤 클래스의 인스턴스

### 클래스 사용
- 클래스 : 객체를 만들기 위한 설계도
    - 객체 변수, 메소드로 이루어짐
```
public class 클래스명 {
    // 객체 변수
    // 메소드
    // + 접근제어자
    // + static
}

 클래스명 객체명 = new 클래스명();
 ```

 ### 생성자 (Constructor)
 - 객체가 생성될 때 자동으로 호출됨
 - 생성자 규칙
    - 클래스명과 이름 맞추기
    - 리턴 타입 없음
```
public class 클래스명 {
    클래스명(){}
}
```

### this, this()
- this : 객체 자신을 의미
- this() : 생성자

### 오버로딩 (Overloading)
 - 한 클래스 내에서 같은 이름의 메소드를 여러 개 정의
 - 오버로딩 조건
    - 메소드 이름이 같아야함
    - 매개변수의 개수 또는 타입이 달라야함
    - (리턴타입의 차이로는 오버로딩이 되지 않음)

``` 
public class 클래스명 {
    클래스명() {}
    클래스명(String name, String type) {
        구현 내용;
    }
}
```

### 접근제어자
- public : 모든 접근을 허용합니다. 어떠한 클래스가 접근을 하든 모두 허용됩니다.
- protected : 상속받은 클래스 또는 같은 패키지에서만 접근이 가능합니다.
- default : 기본 제한자로써 아무것도 붙지 않고, 자신 클래스 내부와 같은 패키지 내에서만 접근이 가능.
- private : 외부에서 접근이 불가능합니다. 즉, 같은 클래스 내에서만 접근이 가능합니다.

| 한정자 | 클래스 내부 | 동일 패키지 | 하위 클래스 | 그 외의 영역 |
| -- | -- | -- | -- | -- |
| public | O | O | O | O |
| protected | O | O | O | X |
| default | O | O | X | X |
| private | O | X | X | X |

> 접근영역 : public > protected > default > private

### Static
- 변수나 메소드의 특성을 바꾸는 키워드
- Static 특징
    - 메모리에 한 번만 할당됨
    - 즉, Static 변수나 메소드는 공유되는 특성을 가짐

- Static 클래스 변수
    - 해당 클래스의 각 객체들이 값을 공유
- Static 클래스 메소드
    - 객체를 생성하지 않아도 호출 가능

## 8. 상속
### 상속 (Inheritance)
- 기존 클래스에 기능 추가 및 재정의하여 새로운 클래스를 정의
    - 부모 클래스 (=상위 클래스, 기초 클래스) : 상속 대상이 되는 기존 클래스 
    - 자식 클래스 (=하위 클래스, 파생 클래스) : 기존 클래스를 상속하는 클래스 

- 부모 클래스의 필드와 메소드가 상속됨 (생성자 초기화 블록은 상속되지 않음)
- 다중 상속은 불가능
- private default 멤버는 자식 클래스에서 접근 불가 (default의 경우, 내부 패키지의 자식 클래스는 가능)

### super, super()
- super
    - 부모 클래스와 자식 클래스의 멤버 이름이 같을 때 구분하는 키워드
- super()
    - 부모 클래스의 생성자 호출

### 오버라이딩 (Overriding)
- 부모 클래스의 메소드를 자식 클래스에서 재정의
- 오버라이딩 조건
    - 메소드의 선언부는 부모 클래스의 메소드와 동일해야 함
    - 반환 타입에 한해, 부모 클래스의 반환 타입으로 변환할 수 있는 타입으로 변경 가능
    - 부모 클래스의 메소드보다 접근제어자를 더 좁은 범위로 변경 불가
    - 부모 클래스의 메소드보다 더 큰 범위의 예외 선언 불가

## 9. 다형성
### 다형성 (Polymorphism)
- 한 객체가 여러 가지 타입을 가질 수 있는 것
- 부모클래스 타입의 참조 변수로 자식클래스 인스턴스
```
참조
class Person {}
class Student extends Person {}

Person p1 = new Student();
// Student s1 = new Person();
```
### instanceof
- 실제 참조하고 있는 인스턴스의 타입 확인
```
참조
class Person {}
class Student extends Person {}

Person p1 = new Student();
// Student s1 = new Person();
System.out.println(p1 instanceof Pereson);
```

## 10. 추상 클래스
### 추상 메소드 (Abstract Methos)
- 자식클래스에서 반드시 오버라이딩 해야하는 메소드
- 선언만하고 구현 내용 없음
```
abstract void print();
```

### 추상 클래스 (Abstract Class)
- 하나 이상의 추상 메소드를 포함하는 클래스
- 반드시 구현해야 하는 부분에 대해 명시적으로 표현
- 추상 클래스 자체는 객체 생성 불가
```
abstract class 클래스명 {
    ...
    abstract void print();
}
```

## 11. 인터페이스
### 인터페이스
- 다중 상속처럼 사용할 수 있는 기능
- 추상 메소드와 상수만으로 이루어짐
```
접근제어자 interface 인터페이스이름 {
    public static final 타입 상수이름 = 값;
    public abstract 반환타입 메소드이름(매개변수);
    ...
}

 class 클래스 이름 implements 인터페이스이름 {
    ...
 }
 ```
### 상속과 인터페이스 동시 사용
- 동시 사용으로 다중 상속과 같은 효과
```
접근제어자 interface 인터페이스이름 {
    ...
}

접근제어자 class 클래스이름 {
    ...
}

class 클래스이름 extends 클래스이름 implements 인터페이스이름 {
    ...
}
```

## 12. 내부 클래스
### 내부 클래스 (Inner Class)
- 클래스 in 클래스 (클래스 안에 선언한 클래스)
```
class Outer {
    ...
    class Inner {
        ...
    }
}
```
### 내부 클래스 특징
- 내부 클래스에서 외부 클래스 멤버에 접근 가능
- 외부에서는 내부 클래스에 접근 불가
### 내부 클래스 종류
- 인스턴스 클래스 (instance class)
- 정적 클래스 (static class)
- 지역 클래스 (local class)
- 익명 클래스 (anonymous class)

### 익명 클래스 (Anonymous Class)
- 이름을 가지지 않는 클래스
- 선언과 동시에 객체 생성
- 일회용 클래스
```
클래스이름 참조변수이름 = new 클래스 이름(){
    ...
};
```

## 13. 입출력
### 콘솔 입력
- 입출력 방식 중 콘솔 입력 방법
```
System.in.read()
InputStreamReader reader = ...
BuffueredReader br = ...
Scanner ...
```
### 콘솔 출력
- 입출력 방식 중 콘솔 출력 방법
```
System.out.println(...);
System.out.print(...);
System.out.printf(...);
```
### 파일 출력
- 입출력 방식 중 파일로 출력하는 방법
```
FileOutputStream ...
FileWriter ...
PrintWriter ...
```
### 파일 입력
- 입출력 방식 중 파일로부터 입력 받는 방법
```
FileInputStream ...
BufferedReaer ...
```

## 14. 예외 처리
### 예외 (Exception)
- 정상적이지 않은 Case
    - 0으로 나누기
    - 배열의 인덱스 초가
    - 없는 파일 열기
    - ...

### 예외 처리 (Exception Handling)
- 정상적이지 않은 Case에 대한 적절한 처리 방법
```
try {
    ...
} catch (예외 case 1) {
    ...
} catch (예외 case 2) {
    ...
}
```
```
int a =0;
try {
    a = 5 / 0;
} catch (ArithmeticException e) {
    System.out.println(e);
}
```
### finally
- 예외 발생 여부와 관계없이 항상 실행되는 부분
```
try {
    예외가 발생할 수도 있는 부분;
} catch (예외 case 1) {
    예외 case1이 발생해야 실행되는 부분;
} finally {
    항상 실행되는 부분;
}
```
### throw, throws
- throw :  예외를 발생 시킴
- throws : 예외를 전가 시킴
```
... 함수이름() {
        throw new Exception();
}

... 함수이름() throws Exception {
    ...
}
```
## 15. 컬렉션 프레임워크
### 컬렉션 프레임워크 (Collection Framework)
- 여러 데이터를 편리하게 관리할 수 있게 만들어 놓은 것
    - 자료 구조 및 알고리즘을 구조화
- 대표 인터페이스
    - List 인터페이스, Set 인터페이스, Map 인터페이스

![](https://velog.velcdn.com/images/mobywhale/post/ec6e9384-08b8-42f0-9f50-0008b7ce0936/image.png)

### List 인터페이스
- 순서가 있는 데이터의 집합
- 데이터 중복 허용
- 대표 구현 클래스
    - ArrayList
    - LinkedList
    - Vector
```
ArrrayList list1 = new ArrayList();
LinkedList list2 = new LinkedList();
Verctor v = new Vector();
```
### Set 인터페이스
- 순서가 없는 데이터의 집합
- 데이터의 중복 허용하지 않음
- 대표 구현 클래스
    - HashSet
    - TreeSet
```
HashSet set1 = new HashSet();
TreeSet set2 = new TreeSet();
```
### Map 인터페이스
- 키와 값의 쌍으로 이루어진 데이터 집합
- 순서를 유지 하지 않음
- 대표 구현 클래스
    - HashMap
    - TreeMap
```
HashMap map1 = new HashMap();
TreeMap map2 = new TreeMap();
```
## 16. 람다식
### 람다 표현식 (Lambda Expression)
- 메소드 대신 하나의 식으로 표현하는 것
- 익명 함수 (Anonymous function)
```
반환타입 메소드이름 (매개변수, ...) {
    실행문
}

public int sum (int x, int y) {
    return x + y;
}
```
```
(매개변수, ...) -> { 실행문 ... }
(int x, int y) -> {return x + y};
```
### 람다식 장점
- 일반적으로 코드가 간결해짐
- 코드 가독성이 높아짐
- 생산성이 높아짐
### 람다식 단점
- 재사용이 불가능 (익명)
- 디버깅 어려움
- 재귀함수로는 맞지 않음
## 17. 스트림
### 스트림 (Stream)
- 배열, 컬렉션 등의 데이터를 하나씩 참조하여 처리 가능한 기능
- for문의 사용을 줄여 코드를 간결하게 함
- 스트림은 크게 3가지로 구성
    - Stream 생성
    - 중개 연산
    - 최종 연산
```
데이터소스객체.Stream생성().중개연산().최종연산();
```
### 스트림 생성
- 배열 스트림
```
String[] arr = new String[]{"a", "b", "c"};
Stream stream = Arrays.stream(arr);
```
- 컬렉션 스트림
```
ArrayList list = new AraayList(Arrays.asList(1, 2, 3));
Stream stream = list.stream();
```
### 스트림 중개연산
- Filtering
    - filter 내부 조건에 참인 요소들을 추출
```
IntStream intStream = IntStrea.range(1, 10).filter(n -> n % 2 == 0);
```
- Mapping
    - map 안의 연산을 요소별로 수행
```
IntStream intStream = IntStream.range(1, 10).map(n -> n + 1);
```
### 스트림 최종연산
- Sum, Average
```
IntStream.range(1, 5).sum()
IntStream.range(1, 5).average().getAsDouble()
```
- min, max
```
IntStream.range(1, 5).min().getAsInt();
IntStream.range(1, 5).max().getAsInt();
```
