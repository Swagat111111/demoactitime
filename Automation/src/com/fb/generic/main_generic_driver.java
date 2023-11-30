package com.fb.generic;

public class main_generic_driver {

	public static void main(String[] args) throws Exception{
		generic g=new generic();
		String url = g.getpropertydata("URL");
		String un=g.getpropertydata("UN");
		String pw=g.getpropertydata("pw");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		System.out.println(g.getexeldata("sagar", 2, 1));
		
		g.setexeldata("sagar", 2, 2, "hero");
		System.out.println(g.getexeldata("sagar", 2, 2));
	}

}
