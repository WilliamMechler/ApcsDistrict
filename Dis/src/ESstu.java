import java.text.DecimalFormat;

public class ESstu extends Student{

	//if car rider
	private int cr;
	
	     // fill fill
		// last name, frist name, id, score 1, score 2, score 3, grade level & ap true or false
		public ESstu(String n1, String n2, double i, double a, double b, double c, int g, int r) {
			
			// super = everything for a base student
			super(n1,n2,i,a,b,c,g);
			
			// ap = the extra data I need for the high school student
			cr = r;
		}
	
		//copy
		public ESstu( ESstu temp) {
			super(temp);
			cr = temp.getcr();
		}
	
	
	//GET
		public int getcr() {
			return cr;
		}
		
	//SET
		public void setcr(int t) {
			cr = t;
		}
		
	// do the below methods last
	
	
		// getfee will stay the same for all students
		public double getfee() {
			
			if( cr == 1) {
			
				return 10;
			}
			else
			{
			    return 20;
			}
		}

		
		// getavg should stay the sam in all students
		public double getavg() {
			double avg;
			avg = s1 + s2 + s3;
			return Math.round((avg/3));
		}

		
		// getgpa will stay the sam in all students
		public double getgpa() {
			double one = 0;
			double two = 0;
			double three = 0;
			double sum = 0;
			
			//testing first score 
			
			if(s1 > 90) {
				one = 4;
			}
			else if(s1 <= 90 || s1 >80){
				one = 3;
			}
			else if(s1 <=80 || s1 >70) {
				one = 2;
			}
			else if(s1 <=70 || s1 >60) {
				one = 1;
			}
			else if(s1 <=60) {
				one = 0;
			}
			
			//testing sceond score
			
			if(s2 > 90) {
				two = 4;
			}
			else if(s2 <= 90 || s2 >80){
				two = 3;
			}
			else if(s2 <=80 || s2 >70) {
				two = 2;
			}
			else if(s2 <=70 || s2 >60) {
				two = 1;
			}
			else if(s2 <=60) {
				two = 0;
			}
			
			//testing third score
			
			if(s3 > 90) {
				three = 4;
			}
			else if(s3 <= 90 || s3 >80){
				three = 3;
			}
			else if(s3 <=80 || s3 >70) {
				three = 2;
			}
			else if(s3 <=70 || s3 >60) {
				three = 1;
			}
			else if(s3 <=60) {
				three = 0;
			}
			
			// geting the sum
			
			sum = (one + two + three) /3;
			
			// Double.parseDouble(new DecimalFormat("##.####").format(value));
			
			return  Double.parseDouble(new DecimalFormat("##.#").format(sum));
		}





		
		public String tostring() {
			String str;
			// last name | frist name | id | gl | the three scores |
				str = ln + ",   " + fn + "   " + id + " " + gl + " " + s1 + " " + s2 + " " + s3 + " " + getavg() + " " + getgpa() + " " + getfee() + " " + cr;
	
			return str; 
		}

}
