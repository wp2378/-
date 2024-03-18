package skil;

public class Skil1 {

	 public static int findGCD(int num1, int num2) {
	        // 두 수 중 작은 수를 구함
	        int smallerNumber = Math.min(num1, num2);

	        // 두 수 중 큰 수를 구함
	        int largerNumber = Math.max(num1, num2);

	        // 유클리드 호제법을 사용하여 최대공약수 계산
	        while (smallerNumber != 0) {
	            int remainder = largerNumber % smallerNumber;
	            largerNumber = smallerNumber;
	            smallerNumber = remainder;
	        }

	        // 최대공약수 반환
	        return largerNumber;
	    }

	    public static void main(String[] args) {
	        // 테스트
	        int number1 = 24;
	        int number2 = 36;

	        int gcd = findGCD(number1, number2);
	        System.out.println("최대공약수: " + gcd);
	    }
}
