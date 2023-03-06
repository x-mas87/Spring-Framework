package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;
	public LgTV() {
		System.out.println("===>lgtv 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("lgtv--전원켠다");
	}
	public void powerOff() {
		System.out.println("lgtv--전원끈다");
		
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	
	}

}
