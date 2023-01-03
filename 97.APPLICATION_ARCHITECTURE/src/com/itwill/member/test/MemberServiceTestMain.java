package com.itwill.member.test;

import javax.swing.JOptionPane;

import com.itwill.guest.Guest;
import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception{
		MemberService memberService=new MemberService();
		System.out.println("1. 회원가입");
		boolean addSuccess1=memberService.addMember(new Member("zzzz","zzzz","엑스맨","경기도민",30, "F", null));
		if(addSuccess1) {
			System.out.println("로그인 화면으로 이동");
		} else {
			JOptionPane.showMessageDialog(null, "중복된 아이디입니다.");
		}
		boolean addSuccess2=memberService.addMember(new Member("cccc","cccc","중복남","경기도민",33, "T", null));
		if(addSuccess2) {
			System.out.println("로그인 화면으로 이동");
		} else {
			JOptionPane.showMessageDialog(null, "중복된 아이디입니다.");
		}
		System.out.println("2. 회원 로그인");
		System.out.println(">> )"+memberService.login("aaaa", "aaaa"));
		System.out.println(">> )"+memberService.login("bbbb", "bbbb"));
		System.out.println(">> )"+memberService.login("dddd", "dddd"));
		System.out.println("3. 회원 아이디 중복체크");
		System.out.println(">> "+memberService.isDuplicateId("zzzz"));
		System.out.println(">> "+memberService.isDuplicateId("aaaa"));
		/*
		System.out.println("4. 회원 수정");
		System.out.println(">> "+memberService.editMember(null));
		System.out.println("5. 회원 삭제");
		System.out.println(">> "+memberService.deleteMember(null));
		*/
	}

}
