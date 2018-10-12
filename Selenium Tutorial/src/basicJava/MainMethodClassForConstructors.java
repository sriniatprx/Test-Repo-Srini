package basicJava;

public class MainMethodClassForConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an class object implicitly calling constructors at compile time
		Constructors1 callconstructorclass = new Constructors1(35);
		callconstructorclass.agedisplay();

		Constructors2 callconstrConstructors2 = new Constructors2();
			callconstrConstructors2.agedisplay();

	}

}
