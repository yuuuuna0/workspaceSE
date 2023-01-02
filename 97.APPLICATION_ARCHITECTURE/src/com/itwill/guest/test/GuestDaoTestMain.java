package com.itwill.guest.test;

import java.util.Date;
import java.util.List;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestDao;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		Guest insertGuest=new Guest(0,"정유가",new Date(),"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		System.out.println(">> "+guestDao.insert(insertGuest));
		System.out.println("2.delete");
		System.out.println(">> "+guestDao.delete(2));
		System.out.println("4.findByPrimarykey");
		Guest findGuest=guestDao.findByPrimaryKey(3);
		System.out.println("3.update");
		findGuest.setGuest_title("변경타이틀");
		findGuest.setGuest_content("아이고어려부라");
		System.out.println(">> "+guestDao.update(findGuest));
		System.out.println("5.findAll");
		System.out.println(">> "+guestDao.findAll());
		System.out.println("6.findByGuestName");
		System.out.println(">> "+guestDao.findByGuestName("정유가"));
	}

}
