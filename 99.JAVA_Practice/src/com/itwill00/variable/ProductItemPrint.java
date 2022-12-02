package com.itwill00.variable;

public class ProductItemPrint {

	public static void main(String[] args) {
		// 변수선언
		String bookName;
		String author;
		String category;
		int originPrice, price;
		int discount;
		String publisher;
		int totalPage;
		int pubYear, pubMonth, pubDate;

		// 변수에 데이터 입력
		bookName = "잘될 수밖에 없는 너에게";
		author = "최서영";
		category = "한국에세이";
		originPrice = 16000;
		discount = 10;
		price = 14400;
		publisher = "북로망스";
		totalPage = 272;
		pubYear = 2022;
		pubMonth = 8;
		pubDate = 18;

		// 변수내용 출력
		System.out.println("----------------------------------------------");
		System.out.println("책이름    : " + bookName);
		System.out.println("저  자    : " + author);
		System.out.println("카테고리  : " + category);
		System.out.print("가  격    : " + "(" + discount + "% 할인)  ");
		System.out.println("₩" + originPrice + " -----> " + "₩" + price);
		System.out.println("출판사    : " + publisher);
		System.out.println("쪽  수    : " + totalPage);
		System.out.print("출판일    : ");
		System.out.println(pubYear + "년 " + pubMonth + "월 " + pubDate + "일");
		System.out.println("----------------------------------------------");

	}

}
