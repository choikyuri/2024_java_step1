package chapter04;

public class ArraySumTest01 {

	public static void main(String[] args) {
		
		int score[]= {98,90,87};
		int sum=0;
		/*
		for이용 
		score점수 출력 => score[0]: 98
		sum변수방에 점수 누적
		*/
		
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]: "+score[i]);
			sum+=score[i];
		}
		
		//sum 총점
		System.out.println("총점: "+sum);
		//avg 평균 구현후 출력(단 avg는 실수)
		double avg=sum/(double)(score.length);
		System.out.println("평균: "+avg);
		//반올림
		System.out.println("평균(반올림): "+Math.round(avg));

	}

}
