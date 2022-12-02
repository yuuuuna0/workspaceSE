
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자 출력
		 */
		/*char c1=0;
		while(c1<65535) {
			System.out.print(c1+" ");
			if(c1%100==0) {
				System.out.println();
			}
			c1++;
		}
		System.out.println();
		*/
		
		/*
		  - 영문 소문자 출력
		    a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,
		 */
		char c2='a';
		while(c2<='z') {
			System.out.print(c2+",");
			c2++;
		}
		System.out.println();
		/*
		  - 영문 소문자 출력
		    a,b,c,d,e
		    f,g,h,i,j
		    k,l,m,n,o
		    p,q,r,s,t
		    u,v,w,x,y
		    z
		 */
		char c3='a';
		int letterCount=0;
		while(c3<='z') {
			System.out.print(c3);
			letterCount++;		
			if(c3!='z' && letterCount%5!=0) {
				System.out.print(",");
			}else if(letterCount%5==0) {
				System.out.println();
			}
			c3++;
		}
		
		System.out.println();
		char c4='A';
		while(c4<='Z') {
			System.out.println(c4+" ");
			if((c4-'A'+1)%5==0) {
				System.out.println();
			};
			c4++;
		}
		
		
		
		/*
		 * Quiz:
		  - 한글 출력
		  - 숫자형 문자(0~9) 출력
		 */
		char han='가';
		char c5='0';
		while(han<='힣') {
			System.out.print(han+" ");
			if((han-'가'+1)%20==0) {
				System.out.println();
			}
			han++;
		}
		System.out.println();
		while(c5<='9') {
			System.out.print(c5+" ");
			c5++;
		}
		
	}

}
