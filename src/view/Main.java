package view;

import controller.SNController;

public class Main {

	public static void main(String[] args) {
		SNController sn = new SNController();
		
		int n = 5;
		
		System.out.println(sn.sN(n));

	}

}
