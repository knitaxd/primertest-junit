package entornosTest;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello, world!");
		Suma s = new Suma(2,3);
		Suma s2 = new Suma(2,-33);
		Suma s3 = new Suma(47,3);
		
		System.out.println(s.sumar());
		System.out.println(s2.sumar());
		System.out.println(s3.sumar());
	}

}
