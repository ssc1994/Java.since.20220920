package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
	Computer comp = new Computer();
	
	comp.setKey(new KeyBoard());
	comp.setMouse(new Mouse());
	comp.setMon(new Monitor("μνμ€μΊ"));
	
	comp.computerInfo();
	
	comp.getMon();
	
	
	
	}

}
