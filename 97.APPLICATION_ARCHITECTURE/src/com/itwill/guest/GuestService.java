package com.itwill.guest;

import java.util.List;

public class GuestService {
	private GuestDao guestDao;
	public GuestService() throws Exception{
		this.guestDao=new GuestDao();
	}
	
	/*
	 * 방명록쓰기
	 */
	public int guestWrite(Guest newGuest) throws Exception{
		//<< GuestDao객체사용>>
		return guestDao.insert(newGuest);
	}
	/*
	 * 방명록 수정
	 */
	public int guestUpdate(Guest guest) throws Exception{
		return guestDao.update(guest);
	}
	/*
	 * 방명록번호로 1개보기
	 */
	public Guest guestDetail(int guest_no) throws Exception{
		return guestDao.findByPrimaryKey(guest_no);
	}
	/*
	 * 방명록번호로삭제
	 */
	public int guestDelete(int guest_no) throws Exception{
		return guestDao.delete(guest_no);
	}
	/*
	 * 방명록 전체 검색
	 */
	public List<Guest> guestList()throws Exception {
		return guestDao.findAll();
	}
	/*
	 * 방명록 이름으로 검색해서 리스트 보기
	 */
	public List<Guest> gustNameList(String guest_name) throws Exception{
		return guestDao.findByGuestName(guest_name);
	}
	

}
