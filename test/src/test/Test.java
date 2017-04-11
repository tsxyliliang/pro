package test;

public class Test {
	public static int add(int a,int b){
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));
		System.out.println(add(1,3));
	}
}
