package com.itwill04.array.lotto;

public class LottoMain {
	
	public static void main(String args[]) {
		System.out.println("----로또번호 6개 생성[중복번호 허용 안 됨]----");
		int[] lottoNumber= {0,0,0,0,0,0};
		/*
		 * QUIZ: 중복체크
		 */
		for(int i=0;i<lottoNumber.length;i++) {
			lottoNumber[i]=(int)(Math.random()*45)+1;
		}
		
		for (int i = 0; i < lottoNumber.length; i++) {
			for(int j=0;j<lottoNumber.length;j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
				}
			} 
			System.out.print(lottoNumber[i] + " ");
		}
	}
}
	

