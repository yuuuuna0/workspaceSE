package dao.guest;

import java.util.Date;
import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		Guest guest=new Guest("정유나",new Date(),"email","homepage","연습","sysdate랑 sequence 어떻게 넣냐");
		guestDao.insert(guest);
		System.out.println("2.delete");
		System.out.println("3.updatet");
		System.out.println("4.findByPrimarykey");
		System.out.println("5.findAll");
			
	}

}
