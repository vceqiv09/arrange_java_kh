package control;

public class Control_switch_1011 {

	public static void main(String[] args) {
		// switch문
		
		int value = 1;
		switch(value) {
			case 1:
				System.out.println("case 1에 해당되어 동작");
				break;
			case 2:
				System.out.println("case 2에 해당되어 동작");
				break;
			default:
				System.out.println("default");
		}
		
		String str = "1";
		switch(str) {
			case "1":
				System.out.println("1");
		}
		
	}

}