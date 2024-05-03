package chapter04;

public class Example02 {

	public static void main(String[] args) {
		//for 문을 이용하여 다음 배열의 점수를 줄단위로 평균과 전체평균 을 구하세요
		int[][] array = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88} }; //3행 x열
		/* 행고정 2차원 배열
		95 86 => 0
		83 92 96 => 1
		78 83 93 87 88 => 2
        */
		double avg=0; //각 행의 평균
		int total=0; //각 행의 합
		int alltotal=0; //전체배열의 합
		int count=0; //전체 요소의 갯수 셈
		//행  array.length => 3
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) { // 0행 => 0열, 1열 | 1행 => 0열, 1열, 2열
				total +=array[i][j]; //array[1][0] array[1][1] array[1][2]
				count++;//전체 평균에 사용될 카운트
			}
			alltotal +=total; //전체 평균에 사용될 합
			avg=(double)total/array[i].length;
			System.out.println((i+1)+"번째 행의 평균 : "+avg+"입니다.");
			total=0; //다음 행의 계산을 위해 쓰레기값 버림
		}//for
		
		avg=(double)alltotal/count;
		System.out.println("배열 전체의 평균 : "+avg+"입니다.");

	}

}
