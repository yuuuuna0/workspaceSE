package com.itwill.member;
/*
 * 서비스 클래스는 대부분 1개의 Dao를 가지지만(복합 업무 시 join을 사용하기 때문에),
 * 여러개의 Dao를 가질 수도 있다.
 */
public class MemberService {
	private MemberDao memberDao;
	public MemberService() throws Exception{
		this.memberDao=new MemberDao();
	}
	/*
	 * 회원가입
	 */
	
	/*
	 * 회원로그인
	 */
	
	/*
	 * 회원 아이디로 검색(회원 상세보기)
	 */
	
	/*
	 * 회원 수정(아이디로 검색)
	 */
	
	/*
	 * 회원 삭제(아이디로 삭제)
	 */
	
	/*
	 * ****cf. admin의 경우****
	 * 회원 전체검색
	 * 회원 이름으로 검색
	 * 회원 주소로 검색
	 * 회원 나이로 검색
	 * 회원 결혼여부로 검색
	 * 회원 가입일로 검색
	 */
}
