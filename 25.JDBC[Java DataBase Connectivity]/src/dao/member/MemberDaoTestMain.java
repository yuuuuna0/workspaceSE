package dao.member;

import java.util.Date;
import java.util.List;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> ");
		memberDao.delete("'aaaa'");
		System.out.println("1.insert   --> ");
		Member newMember=new Member("aaaa","aaaa","정유나","서울시 광진구",30,"F",new Date());
		memberDao.insert(newMember);
		System.out.println("2.update   --> ");
		Member updateMember=new Member("bbbb","b1b1","정유가","서울시 광진구",30,"F",new Date());
		memberDao.update(updateMember);
		System.out.println("3.selectById-> ");
		Member selectById= memberDao.findByPrimaryKey("'cccc'");
		if(selectById !=null) {
			System.out.println(selectById);
		} else {
			System.out.println("찾으시는 아이디가 없습니다.");
		}
		System.out.println("4.selectAll--> ");
		List<Member> selectAll=memberDao.findAll();
		System.out.println(selectAll);
	}

}
