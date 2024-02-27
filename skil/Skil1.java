package skil;

public class Skil1 {

	
	public static boolean isPrime(int number) {
	        // 1 또는 음수는 소수가 아님
	        if (number <= 1) {
	            return false;
	        }

	        // 2부터 제곱근까지의 숫자로 나누어떨어지는지 확인
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                // 나누어떨어지면 소수가 아님
	                return false;
	            }
	        }

	        // 나누어떨어지지 않으면 소수임
	        return true;
	    }

	    public static void main(String[] args) {
	        // 테스트
	        int testNumber = 17; // 소수인지 확인할 숫자
	        if (isPrime(testNumber)) {
	            System.out.println(testNumber + "는 소수입니다.");
	        } else {
	            System.out.println(testNumber + "는 소수가 아닙니다.");
	        }
	    }
	}

