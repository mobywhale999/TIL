import java.util.Scanner;

public class Practice2 {
    public static void solution() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("알파벳 입력: ");
    	char input = sc.nextLine().charAt(0);
    	int output = 0;
    	
    	if (65 <= (int)input && (int)input <= 90) {
    		output = (int)input + 32;
    		System.out.println((char)output);
    	} else if (97 <= (int)input && (int)input <= 122) {
    		output = (int)input - 32;
    		System.out.println((char)output);
    	} else System.out.println("입력하신 값이 알파벳이 아닙니다.");
    }

    public static void main(String[] args) {
        solution();
    }
}
