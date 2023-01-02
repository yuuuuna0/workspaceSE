package com.itwill.guest.test;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args) throws Exception {
		GuestService guestService=new GuestService();
		System.out.println("1.방명록 쓰기");
		System.out.println(">> "+guestService.guestWrite(new Guest(0, "한소희", null, "sohee@naver.com", "한소희홈페이지", "예쁨", "한소희 예뻐요"))+"개 작성");
		System.out.println("2.방명록 수정");
		System.out.println(">> "+guestService.guestUpdate(new Guest(3,"변경짱",null,"change@daum.net","변경홈","변경","바꿔보아요"))+"개 변경");
		System.out.println("3.방명록삭제");
		System.out.println(">> "+guestService.guestDelete(9)+"개 삭제");
		System.out.println("4.방명록 1개 보기");
		System.out.println(">> "+guestService.guestDetail(4));
		System.out.println("5.방명록 이름으로 검색");
		System.out.println(">> "+guestService.gustNameList("한소희"));
		System.out.println("6.방명록 리스트");
		System.out.println(">> "+guestService.guestList());
	}

}
