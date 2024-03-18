package skil;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Queue1 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        // 원하는 값을 콘솔로 입력받음
	        int n = scanner.nextInt();

	        // Queue 배열 생성
	        Queue<Integer> queue = new LinkedList<>();

	        // for문을 이용해 원하는 값만큼의 크기를 가지도록 배열에 값 추가
	        for (int i = 1; i <= n; i++) {
	            queue.offer(i);
	        }

	        // 카드를 버리는 과정
	        while (queue.size() > 1) {
	            // 맨 위의 카드를 버린다
	            queue.poll();
	            // 그 다음 카드를 movedCard의 저장
	            int movedCard = queue.poll();
	            //mocedCard를 배열의 맨뒤에 저장
	            queue.offer(movedCard);
	            // 그후 queue의 size가 1이 될때까지 반복
	        }

	        // 남아있는 카드 출력
	        System.out.println(queue.poll());
	    }	
	}

