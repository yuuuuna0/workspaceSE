package dao.guest;

import java.util.Date;
import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		Guest guest1=new Guest(0,"정유가",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		Guest guest2=new Guest(0,"정유나",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		Guest guest3=new Guest(0,"정유다",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		Guest guest4=new Guest(0,"정유라",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		Guest guest5=new Guest(0,"정유마",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		Guest guest6=new Guest(0,"정유바",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		guestDao.insert(guest1);
		guestDao.insert(guest2);
		guestDao.insert(guest3);
		guestDao.insert(guest4);
		guestDao.insert(guest5);
		guestDao.insert(guest6);
		System.out.println("2.delete");
		guestDao.delete(2);
		System.out.println("3.update");
		Guest guest7=new Guest(0,"정변경",null,"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		guestDao.update(guest7);
		System.out.println("4.findByPrimarykey");
		guestDao.findByPrimaryKey(3);
		System.out.println("5.findAll");
		guestDao.findAll();	
	}

}
