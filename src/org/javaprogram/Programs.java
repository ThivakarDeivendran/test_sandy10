package org.javaprogram;

public class Programs {
	
	 public void name()
	 {
		 System.out.println("Arvind");
	 }
	 
	 private void age()
	 {
		System.out.println("32");
	 }
	 
	 protected void gender()
	 {
		 System.out.println('M');
	 }
	 
	  void place()
	 {
		 System.out.println("chennai");
	 }

	public static void main(String[] args) {
		
		Programs p = new Programs();
		p.name();
		p.age();
		p.gender();
		p.place();

	}

}
