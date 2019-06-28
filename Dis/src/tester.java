import java.util.*;  

public class tester {

	public static void main(String[] args) {
		//ES = 23
		ArrayList<HSstu> list=new ArrayList<HSstu>();//Creating arraylist  
		
		  double id = 2000;
		  
	      for(int i=0; i <=400; i++) {
	    	  double a;
	    	  double b;
	    	  double c;
	    	  int gl;
	    	  int ap;
	    	  //((max - min) + 1) + min;
	    	  Random rand = new Random();
	    	  
	    	  a = rand.nextInt((100 - 60)+1) + 60;
	    	  b = rand.nextInt((100 - 60)+1) + 60;
	    	  c = rand.nextInt((100 - 60)+1) + 60;
	    	  gl = rand.nextInt((12 - 9)+1) + 9;
	    	  ap = rand.nextInt(2);
	    	  
	    	  HSstu temp = new HSstu("will","bob",id,a,b,c,gl,ap);
	    	  
	    	  list.add(temp);
	    	  
	    	  id++;
	      }
	    	  
	    	  
	     for( int i=0; i < list.size(); i++) {
	    	HSstu temp = new HSstu(list.get(i));
	    	System.out.println(temp.tostring());
	     }
	     
	     	
			
	}

}
