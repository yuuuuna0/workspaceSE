package com.itwill.member;

import java.util.List;

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
	 * 	- 아이디가 중복된 경우에는 메세지를 띄운다.
	 */
	public boolean addMember(Member member) throws Exception {
		boolean isSuccess=false;
		//	아이디의 존재 여부 체크 -> 존재하면 메세지/ 존재하지 않으면 가입 성공
		if(memberDao.findByPrimaryKey(member.getM_id())==null) {
			int rowCount=memberDao.insert(member);
			isSuccess=true;
		} else {
			isSuccess=false;
		}
		return isSuccess;
	}
	/*
	 * 회원로그인
	 */
	public int login(String id,String password) throws Exception{
		/*
		 * 0: 성공
		 * 1: 아이디 존재 안함
		 * 2: 패스워드 불일치
		 */
		int loginResult=-99;
		Member findMember=memberDao.findByPrimaryKey(id);
		if(findMember==null) {
			loginResult=1;
		} else {
			if(password.equals(findMember.getM_password())) {
				loginResult=0;
			} else {
				loginResult=2;
			}
		}
		return loginResult;
	} 
	
	/*
	 * 회원 아이디로 중복체크
	 */
	public boolean isDuplicateId(String m_id) throws Exception {
		if(memberDao.findByPrimaryKey(m_id)==null) {
			return false;
		}else {
			return true;
		}
	}
	/*
	 * 회원 상세보기
	 */
	public Member memberDetail(String m_id) throws Exception{
		return memberDao.findByPrimaryKey(m_id);
	}
	/*
	 * 회원 수정
	 */
	public int editMember(Member member) throws Exception{
		return memberDao.update(member);
	}
	/*
	 * 회원 탈퇴
	 */
	public int deleteMember(String m_id) throws Exception {
		return memberDao.delete(m_id);
	}
	/*
	 * ****cf. admin의 경우****
	 * 회원 전체검색
	 * 회원 이름으로 검색
	 * 회원 주소로 검색
	 * 회원 나이로 검색
	 * 회원 결혼여부로 검색
	 * 회원 가입일로 검색
	 */
	/*
	 * 회원 전체검색
	 */
	public List<Member> memberList() throws Exception {
		return memberDao.findAll();
	}
}
