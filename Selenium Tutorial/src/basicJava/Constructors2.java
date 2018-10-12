package basicJava;

public class Constructors2 {

	int iage;
	String sName;
	double iheight;

//	syntax for creating a class constructor
	public Constructors2(){
		iage = 35;
	}

	public void agedisplay() {
		sName = "sreenivas";
		iheight = 5.6;

		System.out.println("My details are: Age ="+ iage +"name is:"+ sName+ "height is:"+iheight);
	}

}
