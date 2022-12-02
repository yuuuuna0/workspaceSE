
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("---학생 10명 성적 데이터를 저장하기 위한 배열 객체 생성 초기화---");
		int[] noArray= {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray= {"KIM","Lee","PARK","JUNG","CHOI","LIM","SHIN","MIN","KANG","KWEON"};
		int[] korArray= {23,89,30,80,80,76,16,85,34,68};
		int[] engArray= {59,48,67,56,44,89,100,65,29,89};
		int[] mathArray= {75,88,89,98,91,46,59,86,25,78};
		int[] totArray=new int[10];
		double[] avgArray= {0,0,0,0,0,0,0,0,0,0,0};
		char[] gradeArray= {'F','F','F','F','F','F','F','F','F','F'};
		int[] rankArray= {1,1,1,1,1,1,1,1,1,1};
		/*
		 * 총점,평균,평점 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i]=korArray[i]+engArray[i]+mathArray[i];
			avgArray[i]=totArray[i]/3.0;
			if(avgArray[i]>=90 && avgArray[i]<=100) {
				gradeArray[i]='A';
			} else if(avgArray[i]>=80) {
				gradeArray[i]='B';
			}else if(avgArray[i]>=70) {
				gradeArray[i]='C';
			}else if(avgArray[i]>=60) {
				gradeArray[i]='D';
			}else {
				gradeArray[i]='F';
			}
		}
		/*
		 * 총점으로 석차 계산
		 */
		//1번 학생(index-->0)
		/*for(int i=0; i<noArray.length;i++) {
			if(totArray[0]<totArray[i]) {
				rankArray[0]++;
			}
		}
		*/
		for(int i=0; i<noArray.length;i++) {
			for(int j=0;j<noArray.length;j++) {
				if(totArray[j]<totArray[i]) {
					rankArray[j]++;
				}
			}
		}
		
		System.out.printf("-----------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-------------------------------------------------%n");
		/*
		 * 학생검색(번호,국어,영어,수학,학점,석차)
		 */
		//번호 3번인 학생 1명 찾아서 1명 정보 출력(학생 정보는 중복되지 않는다.)
		System.out.println(">>>>번호 3번인 학생 1명 찾아서 1명 정보 출력(학생 정보는 중복되지 않는다.)");
		for(int i=0;i<noArray.length;i++) {
			if(noArray[i]==3) {
				System.out.printf("%2d %6s %5d %4d %4d %4d %5.1f %3c %4d%n",noArray[i],nameArray[i], korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				break;
			}
		}
		//국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		System.out.println(">>>>국어점수 80점인 학생들 여러명 찾아서 여러명정보출력");
		for(int i=0;i<noArray.length;i++) {
			if(korArray[i]==80) {
				System.out.printf("%2d %6s %5d %4d %4d %4d %5.1f %3c %4d%n",noArray[i],nameArray[i], korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
			}
		}
		// 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		System.out.println(">>>>영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		for(int i=0;i<noArray.length;i++) {
			if(engArray[i]<=50) {
				System.out.printf("%2d %6s %5d %4d %4d %4d %5.1f %3c %4d%n",noArray[i],nameArray[i], korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
			}
		}
		//수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		System.out.println(">>>>수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력");
		for(int i=0;i<noArray.length;i++) {
			if(mathArray[i]>=70) {
				System.out.printf("%2d %6s %5d %4d %4d %4d %5.1f %3c %4d%n",noArray[i],nameArray[i], korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
			}
		}
		//학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		System.out.println(">>>>학점이 D학점이하인 학생모두찾아서 여러명 정보출력");
		for(int i=0;i<noArray.length;i++) {
			if(gradeArray[i]>='D') {
				System.out.printf("%2d %6s %5d %4d %4d %4d %5.1f %3c %4d%n",noArray[i],nameArray[i], korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
			}
		}
		
		/*
		 * 정렬
		 * 		1. 오름차순
		 * 		ex> 1,2,3,4,5
		 * 			a,b,c,d,e,.... / 가,나,.....힣
		 * 		2. 내림차순(descending)
		 * 		ex> 5,4,3,2,1
		 * 			z,y,x,....... / 힣,.......,나,가
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬전  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		
		/*
		 * 학생 총점 순으로 오름차순 정렬
		 */
		int a=10;
		int b=3;
		//swap a,b
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("------swap------");
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println(">>>>학생 총점 순으로 오름차순 정렬");
		//1회
		for (int i = 0; i < noArray.length; i++) {
			for (int j = 0; j < (noArray.length-(i+1)); j++) {
				if(totArray[j]>totArray[j+1]) {
					//swap
					int tempTot=totArray[j];
					totArray[j]=totArray[j+1];
					totArray[j+1]=tempTot;
				}
			}
		}
		// 1회
		for (int j = 0; j < (noArray.length-1); j++) {
			if(totArray[j]>totArray[j+1]) {
				//swap
				int tempTot=totArray[j];
				totArray[j]=totArray[j+1];
				totArray[j+1]=tempTot;
			}
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬후 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);				
		}
		
		
		
		
		
		
		
		
		
	}

}
