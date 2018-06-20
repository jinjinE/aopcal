package kr.hs.emirim.jinjin.aopcal.main;

import kr.hs.emirim.jinjin.aopcal.cal.Calculator;
import kr.hs.emirim.jinjin.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.jinjin.aopcal.cal.RecCalculator;

public class MainNano {
	public static void main(String[] args) {
		long num = 10000;
		long start1 = System.nanoTime();
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.nanoTime();
		System.out.printf("Imp factorial(%d) : ����ð� = %d",num, (end1 - start1));

		System.out.println();
		
		long start2 = System.nanoTime();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.nanoTime();
		System.out.printf("Rec factorial(%d) : ����ð� = %d",num, (end2 - start2));
	}
}
