package kr.hs.emirim.jinjin.aopcal.cal;

public class MainProxy {
	public static void main(String[] args) {
		int num = 20;
		
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttCal1.factorial(num));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttCal2.factorial(num));
	}
}
