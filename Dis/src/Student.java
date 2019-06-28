
public abstract class Student {

	// Protected Variables / 
	protected String ln;
	protected String fn;
	protected double id;
	protected double s1;
	protected double s2;
	protected double s3;
	protected int gl;
	
	//Public Methods 
	
	// The d fill
	public Student() {
		ln = "";
		id = 000000;
		s1 = 0;
		s2 = 0;
		s3 = 0;
		gl = 0;
	}
	
	// the fill fill
	public Student(String n1, String n2, double i, double a, double b, double c, int g) {
		ln = n1;
		fn = n2;
		id = i;
		s1 = a;
		s2 = b;
		s3 = c;
		gl = g;
	}
	
	//COPY
	
	public Student(Student temp) {
		ln = temp.getln();
		fn = temp.getfn();
		id = temp.getid();
		s1 = temp.gets1();
		s2 = temp.gets2();
		s3 = temp.gets3();
		gl = temp.getgl();
	}
	
	  //----------------------------------------------------
	 // The start of the building blocks
	// SETS
	public void setln(String s) {
		ln = s;
	}
	
	public void setfn(String s) {
		fn = s;
	}
	
	public void setid(double num) {
		id = num;
	}
	
	public void sets1(double x) {
		s1 = x;
	}
	
	public void sets2(double x) {
		s2 = x;
	}
	
	public void sets3(double x) {
		s3 = x;
	}
	
	public void setfee(int g) {
		gl = g;
	}
	
	//Gets
	
	public String getln() {
		return ln;
	}
	
	public String getfn() {
		return fn;
	}
	
	public double getid() {
		return id;
	}
	
	public double gets1() {
		return s1;
	}
	
	public double gets2() {
		return s2;
	}
	
	public double gets3() {
		return s3;
	}
	
	public int getgl() {
		return gl;
	}
	
    //The end of the building blocks
   //--------------------------------------------
  // Abstract Methods below ;)
	
	// get fee
	public abstract double getfee();
	
	// To get the schools's average test score
	public abstract double getavg();
	
	// To get the gpa for that class
	public abstract double getgpa();
	
	// To string beacue I need one  I will do this one last
	public abstract String tostring();
		
}
