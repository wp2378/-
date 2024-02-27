package skil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SS {

	public static void main(String[] args) throws IOException {

		
		int arr_num = 5; 
		//입력받은 숫자를 읽어 정수형태로 arr_num 변수에 저장.
		
		int[][] number = new int[arr_num][arr_num]; 
		//해당 숫자만큼 배열생성 
		
		int zz_cnt = 1; //지그재그 수열값
		
		//지그재그 구성로직
		for(int i=0; i<=arr_num-1; i++){ //행
			
			if ((i%2)==0){ 
				//수열의 진행방향. true:왼->오, false:오->왼
				
				for(int j=0; j<=arr_num-1; j++){
					number[i][j]=zz_cnt; 
					//수열값 증가시키면서 배열에 차례대로 값을 저장. 
					
					zz_cnt++; 
				} 
				
			}else{
				
				for(int j=arr_num-1; j>=0; j--){ 
					number[i][j]=zz_cnt;  
					zz_cnt++; 
				}
				
			} 
		} 
		
		//출력로직
		for (int k=0; k<=arr_num-1; k++){ //행 출력
			
			for (int l=0; l<=arr_num-1; l++){ // 열 출력 
				System.out.print(number[k][l]+"\t"); 
				// 배열 값 출력.
			}
			
			System.out.println();//개행 
		} 	
	}
}