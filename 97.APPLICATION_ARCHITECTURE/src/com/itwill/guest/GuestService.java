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
		int rowCount=guestDao.insert(newGuest);
		return rowCount;
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
		int rowCount=guestDao.delete(guest_no);
		return rowCount;
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
