package dao.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> ");
		memberDao.delete("'aaaa'");
		System.out.println("1.insert   --> ");
		//Member newmember=new Member("zzzz","zzzz","정유나","서울시 광진구",30,"F",sysdate);
		//memberDao.insert(newMember)
		System.out.println("2.update   --> ");
		//Member updatemember=new Member("bbbb","b1b1","정유가","서울시 광진구",30,"F",sysdate);
		//memberDao.update("'bbbb'");
		System.out.println("3.selectById-> ");
		//memberDao.findByPrimaryKey("'bbbb'");
		System.out.println("4.selectAll--> ");
		memberDao.findAll();
		
	}

}
