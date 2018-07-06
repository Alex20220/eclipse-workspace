package _JUnit;

public class Calc {
	public  int add(int a, int b) {
		return a+b;
	}
	public int div(int d, int e) {
		if (e==0) {
			throw new IllegalArgumentException();
		}
		return d/e;
	}
	public static void main(String[] args) {

	}

}
