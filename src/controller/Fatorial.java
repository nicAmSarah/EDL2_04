package controller;

public class Fatorial {
	
	public Fatorial() {
		super();
	}
	
	
	public long FatorialDup(int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num * FatorialDup(num - 1);
	}
}
