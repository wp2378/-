package skil;

public class Skil3 {

	 public static void main(String[] args) {
	        int rows = 5; // 출력할 행의 개수 설정
	        int cols = 5; // 출력할 열의 개수 설정
	        int counter = 1; // 출력할 숫자 초기값 설정
	        int zz_cnt = 1; //지그재그 수열값
	        int [][] number = new int[rows][cols];

	        for (int i = 1; i <= rows; i++) {
	            // 홀수 행은 왼쪽에서 오른쪽으로 출력
	            if (i % 2 != 0) {
	                for (int j = 1; j <= cols; j++) {
	                	
	                    System.out.print(counter + "\t");
	                    counter++;
	                }
	            } else {
	                // 짝수 행은 오른쪽에서 왼쪽으로 출력
	                for (int j = cols; j >= 1; j--) {
	                	
	                    System.out.print(counter + "\t");
	                    counter++;
	                }
	            }

	            System.out.println(); // 다음 행으로 이동
	        }
	    }
	 
	 
}
