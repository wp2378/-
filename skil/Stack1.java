package skil;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        //배열의 자릿수를 입력
	        int n = scanner.nextInt();

	        Stack<Integer> stack = new Stack<>();
	        StringBuilder result = new StringBuilder();

	        int current = 1; // 다음에 push할 숫자
	        boolean isPossible = true;

	        for (int i = 0; i < n; i++) {
	        	//원하는 배열대로 숫자를 입력
	            int target = scanner.nextInt();

	            // 스택의 맨 위 숫자가 타겟 숫자가 될 때까지 push
	            while (current <= target) {
	                stack.push(current);
	                //push를 실행할경우 +가 출력되면 줄바꿈
	                result.append("+\n");
	                current++;
	            }

	            // 스택의 맨 위 숫자가 타겟 숫자와 같으면 pop
	            if (!stack.isEmpty() && stack.peek() == target) {
	                stack.pop();
	              //pop를 실행할경우 -가 출력되면 줄바꿈
	                result.append("-\n");
	            } else { // 만약 타겟 숫자와 스택의 맨 위 숫자가 다르다면 수열을 만들 수 없음
	                isPossible = false;
	                break;
	            }
	        }

	        if (isPossible) {
	            System.out.println(result.toString().trim());
	        } else {
	            System.out.println("NO");
	        }
	    }
}
