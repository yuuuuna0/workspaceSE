package com.itwill.shop.user;

/*
 * - 쇼핑몰 회원관리 업무(비즈니스로직,예외처리,트랜젝션,보안,로깅)을 수행하는 클래스
 * - UI(SWING,서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스(객체)
 * - Dao를 이용해서 데이타베이스를 조작작업(CRUD)하는 클래스
 */
public class UserService {
	private UserDao userDao;
	public UserService() throws Exception{
		userDao=new UserDao();
	}
	
	
	/*
	 * 회원가입
	 */
	public int create(User user) throws Exception{
		//1.아이디중복체크
		if(userDao.countByUserId(user.getUserId())>=1) {
			//중복
			return -1;
		}else {
			//가입
			int rowCount=userDao.insert(user);
			return rowCount;
		}
	}
	
	/*
	 * 회원로그인
	 */
	public int login(String userId,String password)throws Exception{
		/*
		 * 0 : 실패
		 * 1 : 성공
		 * 
		 */
		int result=0;
		if(userDao.countByUserId(userId)==1) {
			//아이디존재하는경우
			User loginUser = userDao.findByPrimaryKey(userId);
			if(loginUser.getPassword().equals(password)) {
				//패쓰워드일치
				result=1;
			}else {
				//패쓰워드불일치
				result=0;
			}
		}else {
			//회원이아닌경우
			result=0;
		}
		return result;
	}
	
	
	/*
	 * 회원로그아웃
	 */
	public void logout() {
		/*
		 * 로그아웃시 DB작업이필요하다면 기술함
		 */
	}
	/*
	 * 로그인한 회원의 정보보기
	 */
	public User findUser(String userId) throws Exception{
		return userDao.findByPrimaryKey(userId);
	}
	/*
	 * 회원수정
	 */
	public int update(User user)throws Exception{
		return userDao.update(user);
	}
	/*
	 * 아이디중복체크
	 */
	public boolean isDuplicateId(String userId) throws Exception{
		if(userDao.countByUserId(userId)>=1) {
			return true;
		}else {
			return false;
		}
	}
	/*
	 * 회원탈퇴
	 */
	public int remove(String userId) throws Exception{
		return userDao.delete(userId);
	}
	
}
