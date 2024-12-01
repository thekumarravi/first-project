package app_java_4;
public class E {
	public static void main(String[] args) {
		try {
			Integer.parseInt("Hello");
		} catch(NullPointerException e) {
			System.out.println(1);
		}catch (ArithmeticException e) {
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}
	}

}
