package generic;

import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("--------String------------");
		HashSet<String> nameSet=new HashSet<String>();
		nameSet.add("KIM");
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		System.out.println(nameSet);
		boolean isAdd = nameSet.add("KIM");
		System.out.println("추가여부: "+isAdd);
		System.out.println(nameSet);
		
		System.out.println("--------Integer------------");
		HashSet<Integer> lottoSet=new HashSet<Integer>();
		
		lottoSet.add((int)(Math.random()*45+1));
		lottoSet.add((int)(Math.random()*45+1));
		lottoSet.add((int)(Math.random()*45+1));
		lottoSet.add((int)(Math.random()*45+1));
		lottoSet.add((int)(Math.random()*45+1));
		lottoSet.add((int)(Math.random()*45+1));
		/*
		while(lottoSet.size()<6) {
			lottoSet.add((int)(Math.random()*45+1));
		}
		*/
		System.out.println(lottoSet);
		
		
		
	}

}
