package com.itwill.member.test;

import java.util.Date;
import java.util.List;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> "+memberDao.delete("eeee"));
		System.out.println("1.insert   --> "+memberDao.insert(new Member("dddd","dddd","정유나","서울시 광진구",30,"F",null)));
		System.out.println("2.update   --> "+memberDao.update(new Member("bbbb","b1b1","정유가","서울시 광진구",30,"F",null)));
		Member selectById= memberDao.findByPrimaryKey("cccc");
		System.out.println("3.selectById-> ");
		if(selectById !=null) {
			System.out.println(selectById);
		} else {
			System.out.println("찾으시는 아이디가 없습니다.");
		}
		System.out.println("4.selectAll--> "+memberDao.findAll());
	}
}
