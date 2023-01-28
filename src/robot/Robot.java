package robot;

public class Robot {
	String name;
	public  void  sayHello() {
		System.out.println("hi, I'm is "+name);
	}
	public static void main (String[]args) {
		Robot robot =new Robot();
		robot.name="Java Robot";
		robot.sayHello();
	}
}
