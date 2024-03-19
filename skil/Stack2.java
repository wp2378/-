package skil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack2 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // 배열의 크기 입력받아서 생성
	        int n = scanner.nextInt();
	        int[] numbers = new int[n];
	        // 입력받은 배열의 size와 같아질때까지 배열의 값을 추가
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        int[] result = findNextGreater(numbers);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }

	    public static int[] findNextGreater(int[] arr) {
	        int[] result = new int[arr.length];
	        // 배열 result의 값을 -1로 초기화 [-1,-1,-1,-1]
	        Arrays.fill(result, -1);
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 0; i < arr.length; i++) {
	        	// 스택이 
	            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
	                result[stack.pop()] = arr[i];
	            }
	            stack.push(i);
	        }
	        return result;
	    }
}
