package kr.hs.emirim.jinjin.aopcal.main;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.jinjin.aopcal.cal.Calculator;

public class MainXmlPojo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator impCal = ctx.getBean("impCal",Calculator.class);
		long finveFact1 = impCal.factorial(5);
		System.out.println("impCal.factorial(5) = "+finveFact1);
		
		Calculator recCal = ctx.getBean("recCal",Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " +fiveFact2);
	}

}
