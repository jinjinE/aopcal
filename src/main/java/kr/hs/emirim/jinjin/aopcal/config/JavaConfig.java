package kr.hs.emirim.jinjin.aopcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kr.hs.emirim.jinjin.aopcal.aspect.ExeTimeAspect2;
import kr.hs.emirim.jinjin.aopcal.cal.Calculator;
import kr.hs.emirim.jinjin.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.jinjin.aopcal.cal.RecCalculator;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	@Bean
	public ExeTimeAspect2 exeTimeAspect() {
		return new ExeTimeAspect2();
	}
	@Bean
	public Calculator impCal() {
		return new ImpeCalculator();
	}
	
	@Bean
	public Calculator recCal() {
		return new RecCalculator();
	}
}
