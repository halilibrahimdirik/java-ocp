package chapter1;

public class AccessModifiers1 {

	public static void main(String[] args) {
		ClassInsideMain classInsideMain = new ClassInsideMain();
		classInsideMain.packageField = "";
		classInsideMain.protectedField = "";
		classInsideMain.publicField = "";
		classInsideMain.privateField = ""; // FAILS
	}

}

class ClassInsideMain {
	public String publicField;
	private String privateField;
	String packageField;
	protected String protectedField;
}
