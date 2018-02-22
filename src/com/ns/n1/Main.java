package com.ns.n1;

public class Main {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("iu");
		member.setAge(26);
		member.setWeight(48);
		member.setH(165.5);
		member.setS("f");
		member.setPhon("0101010");
		member.info();
		
		Inbody ib = new Inbody();
		ib.check(member);
		
		
	}

}
