import javax.swing.*;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;



public class Dis extends JFrame {

	
	private double finalfee = 0;
	private int totalstu;
	private double findstu;
	private ArrayList<HSstu> list=new ArrayList<HSstu>();
	private ArrayList<MSstu> list2=new ArrayList<MSstu>();
	private  ArrayList<ESstu> list3=new ArrayList<ESstu>();
	
	//>>>>>>View<<<<<<<
	
	//Labels
	
	private JLabel HSS = new JLabel("High School", SwingConstants.CENTER);
	private JLabel MSS = new JLabel("Middle School", SwingConstants.CENTER);
	private JLabel ESS = new JLabel("Intermediate School", SwingConstants.CENTER);
	
	//Label's labels
	
	private JLabel HSSL = new JLabel("ln, fn, id, gl, scores, avg, gpa, fee, ap", SwingConstants.CENTER);
	private JLabel MSSL = new JLabel("ln, fn, id, gl, scores, avg, gpa, fee, team", SwingConstants.CENTER);
	private JLabel ESSL = new JLabel("ln, fn, id, gl, scores, avg, gpa, fee, cr", SwingConstants.CENTER);
	
	//TextAreas
	
	private JTextArea ETA = new JTextArea(11, 400);
	private JTextArea MTA = new JTextArea(11, 400);
	private JTextArea HTA = new JTextArea(11, 400);
	
	//Scrollpanes? idk
	
	private JScrollPane HSP = new JScrollPane(HTA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	private JScrollPane MSP = new JScrollPane(MTA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	private JScrollPane ESP = new JScrollPane(ETA, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	//buttons
	
	private JButton btufill = new JButton("Fill");
	private JButton btuexit = new JButton("Exit");
	private JButton btufind = new JButton("Find");
	private JButton btuadd = new JButton("Add");
	private JButton btuedit = new JButton("Edit");
	
	//panels
	private JPanel pnllabel = new JPanel(new GridLayout(2,3));
	private JPanel pnldata = new JPanel(new GridLayout(1,3));
	private JPanel pnlbuttons = new JPanel(new GridLayout(1,5));
	//new GridLayout(rows,columns,spacing for rows which you dont need, spacing for columns which you dont need)
	
	//Constructor
	
	public Dis() {
		
	pnllabel.add(HSS);
	pnllabel.add(MSS);
	pnllabel.add(ESS);
	pnllabel.add(HSSL);
	pnllabel.add(MSSL);
	pnllabel.add(ESSL);
	
	pnldata.add(HSP);
	pnldata.add(MSP);
	pnldata.add(ESP);
	
	pnlbuttons.add(btufill);
	pnlbuttons.add(btufind);
	pnlbuttons.add(btuadd);
	pnlbuttons.add(btuedit);
	pnlbuttons.add(btuexit);
	
	Container con = getContentPane();
	con.add(pnllabel, BorderLayout.NORTH);
	con.add(pnldata, BorderLayout.CENTER);
	con.add(pnlbuttons, BorderLayout.SOUTH);
	btufill.addActionListener(new FillListener());
	btuexit.addActionListener(new ExitListener());
	btufind.addActionListener(new FindListener());
	btuadd.addActionListener(new AddListener());
	}
	
	
	
	
	private class FillListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		//textArea.append(additionalText);	
			
			//make | showing high school students
			
//			ArrayList<HSstu> list=new ArrayList<HSstu>();//Creating arraylist  
			
			 String[] ln = new String[20];
			 String[] fn = new String[20];
			 
			 // array of last names
			 
			 ln[0] = "Mechler";
			 ln[1] = "Smith";
			 ln[2] = "Hall";
			 ln[3] = "Senne";
			 ln[4] = "Cox";
			 ln[5] = "Nelson";
			 ln[6] = "Carter";
			 ln[7] = "Allen";
			 ln[8] = "Miller";
			 ln[9] = "Wilson";
			 ln[10] ="Davis";
			 ln[11] ="Anderson";
			 ln[12] ="Johnson";
			 ln[13] ="Moore";
			 ln[14] ="Adams";
			 ln[15] ="King";
			 ln[16] ="Scott";
			 ln[17] ="Green";
			 ln[18] ="Baker";
			 ln[19] ="Thomas";
			 
			 // list of first name
			 
			 fn[0] = "Liam";
			 fn[1] = "Emma";
			 fn[2] = "Noah";
			 fn[3] = "Olivia";
			 fn[4] = "William";
			 fn[5] = "Ava";
			 fn[6] = "James";
			 fn[7] = "Isabella";
			 fn[8] = "Logan";
			 fn[9] = "Sophia";
			 fn[10] ="Ben";
			 fn[11] ="Mia";
			 fn[12] ="Mason";
			 fn[13] ="Charlotte";
			 fn[14] ="Elijah";
			 fn[15] ="Amelia";
			 fn[16] ="Oliver";
			 fn[17] ="Evelyn";
			 fn[18] ="Jacob";
			 fn[19] ="Emily";
			 
			  double id = 2000;
			  
		      for(int i=0; i <=400; i++) {
		    	  int l;
		    	  int f;
		    	  double a;
		    	  double b;
		    	  double c;
		    	  int gl;
		    	  int ap;
		    	  //((max - min) + 1) + min;
		    	  Random rand = new Random();
		    	  
		    	  l = rand.nextInt(19);
		    	  f = rand.nextInt(19);
		    	  a = rand.nextInt((100 - 60)+1) + 60;
		    	  b = rand.nextInt((100 - 60)+1) + 60;
		    	  c = rand.nextInt((100 - 60)+1) + 60;
		    	  gl = rand.nextInt((12 - 9)+1) + 9;
		    	  ap = rand.nextInt(2);
		    	  
		    	  HSstu temp = new HSstu(fn[f],ln[l],id,a,b,c,gl,ap);
		    	  
		    	  list.add(temp);
		    	  
		    	  finalfee = finalfee + temp.getfee();
		    	  
		    	  id++;
		      }
		      
		      for( int i=0; i < list.size(); i++) {
			    	HSstu temp = new HSstu(list.get(i));
			    	HTA.append("\n" +temp.tostring());
			     }
		      
		      //end of highschool students
		      
		      //making of middleschoolers
		      
		    //make | showing high school students
				//ArrayList<MSstu> list2=new ArrayList<MSstu>();//Creating arraylist  
						  
			      for(int i=0; i <=400; i++) {
			    	  double a;
			    	  double b;
			    	  double c;
			    	  int gl;
			    	  int t;
			    	  String tm="";
			    	  int l;
			    	  int f;
			    	 // String team;
			    	  
			    	  //((max - min) + 1) + min;
			    	  Random rand = new Random();
			    	  
			    	  l = rand.nextInt(19);
			    	  f = rand.nextInt(19);
			    	  a = rand.nextInt((100 - 60)+1) + 60;
			    	  b = rand.nextInt((100 - 60)+1) + 60;
			    	  c = rand.nextInt((100 - 60)+1) + 60;
			    	  gl = rand.nextInt((8 - 7)+1) + 7;
			    	  t = rand.nextInt(4);
			    	  
			    	  if(t == 0) {
			    		  tm = "Minecraft";
			    	  }
			    	  else if ( t == 1) {
			    		  tm = "CSGO";
			    	  }
			    	  else if ( t == 2) {
			    		  tm = "Mini_Kummers";
			    	  }
			    	  else if ( t == 3) {
			    		  tm = "Eclipse";
			    	  }
			    	  MSstu temp = new MSstu(fn[f],ln[l],id,a,b,c,gl,tm);
			    	  
			    	  list2.add(temp);
			    	  
			    	  finalfee = finalfee + temp.getfee();
			    	  
			    	  id++;
			      }
			      
			      for( int i=0; i < list2.size(); i++) {
				    	MSstu temp = new MSstu(list2.get(i));
				    	MTA.append("\n" +temp.tostring());
				     }
			      
			      //end of middle schoolers
			      
			      //start of Estudents | grade school / intermediate students 4,5 & 6 grade
			      
//			      ArrayList<ESstu> list3=new ArrayList<ESstu>();//Creating arraylist  
					
				  
				  
			      for(int i=0; i <=400; i++) {
			    	  double a;
			    	  double b;
			    	  double c;
			    	  int gl;
			    	  int cr;
			    	  int l;
			    	  int f;
			    	  //((max - min) + 1) + min;
			    	  Random rand = new Random();
			    	  
			    	  l = rand.nextInt(19);
			    	  f = rand.nextInt(19);
			    	  a = rand.nextInt((100 - 60)+1) + 60;
			    	  b = rand.nextInt((100 - 60)+1) + 60;
			    	  c = rand.nextInt((100 - 60)+1) + 60;
			    	  gl = rand.nextInt((6 - 4)+1) + 4;
			    	  cr = rand.nextInt(2);
			    	  
			    	  ESstu temp = new ESstu(fn[f],ln[l],id,a,b,c,gl,cr);
			    	  
			    	  list3.add(temp);
			    	  
			    	  finalfee = finalfee + temp.getfee();
			    	  
			    	  id++;
			      }
			      
			      for( int i=0; i < list3.size(); i++) {
				    	ESstu temp = new ESstu(list3.get(i));
				    	ETA.append("\n" +temp.tostring());
				     }
			      
			      JOptionPane.showMessageDialog(null, "Total Fees = " + Double.toString(finalfee) +"\n" + "Total Students = " + "1,202");
		}
	}
	
	private class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	private class AddListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			 String st = JOptionPane.showInputDialog("Type of Student /n 1 for Highschool /n 2 for Middle School /n 3 for Intermediate School");
			 int result = Integer.parseInt(st);
			 
			 String ln ="";
			 String fn ="";
			 String s1 ="";
			 String s2 ="";
			 String s3 ="";
			 String gl ="";
			 String sp ="";
			 Double id=0.0;
			 if(result == 1) {
				 ln = JOptionPane.showInputDialog("Enter Student's Last Name");
				 fn = JOptionPane.showInputDialog("Enter Student's Frist Name");
				 s1 = JOptionPane.showInputDialog("Enter s1");
				 s2 = JOptionPane.showInputDialog("Enter s2");
				 s3 = JOptionPane.showInputDialog("Enter s3");
				 gl = JOptionPane.showInputDialog("Enter 9 or 10 or 11 or 12");
				 sp = JOptionPane.showInputDialog("Enter 1 if in AP or 0 if not in AP");
				 
				 id = 2401.0;
				HSstu temp = new HSstu(ln,fn,id, Double.parseDouble(s1), Double.parseDouble(s2), Double.parseDouble(s3),Integer.parseInt(gl),Integer.parseInt(sp));
				 
				list.add(temp);
				HTA.setText("");
				 for( int i=0; i < list.size(); i++) {
				    	HSstu temp2 = new HSstu(list.get(i));
				    	HTA.append("\n" +temp2.tostring());
				     }
			 }
			 else if(result == 2) {
				 
			 }
			 else if(result == 3) {
				 
			 }
		}
	}
	
	private class FindListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			quest("E:\\KumYell.wav");
			 //1,202 total students
			 String idfind = JOptionPane.showInputDialog("Please input id of Student \n P.S 2000 - 3202 ");
			 
			  findstu = Double.parseDouble(idfind);
			
			  HSs();
			  MSs();
			  ESs();
				
		}
	}

	
	public void HSs() {
		
		for(int i =0; i<400; i++) {
			if(i<400) {
				 HSstu temp = new HSstu(list.get(i));
			
				 if(temp.getid() == findstu) {
				    	JOptionPane.showMessageDialog(null, "ln, fn, id, gl, scores, avg, gpa, fee, ap\n" + temp.tostring());
				    	
				    	break;
				    }
			}
		
	}
}
	
	public void MSs() {
		
	for(int i =0; i <400; i++) {
			 MSstu temp = new MSstu(list2.get(i));
			    if(temp.getid() == findstu) {
			    	JOptionPane.showMessageDialog(null, "ln, fn, id, gl, scores, avg, gpa, fee, team\n" + temp.tostring());
			    	break;
			    
		}
			   
		
	}
	
}
	
	public void ESs() {
		
		for(int i=0; i < 400; i++) {
			 ESstu temp = new ESstu(list3.get(i));
			    if(temp.getid() == findstu) {
			    	JOptionPane.showMessageDialog(null, "ln, fn, id, gl, scores, avg, gpa, fee, cr\n" + temp.tostring());
			    	
			    	
			    }
			   
		}
	}

	public static void music(String filepath)
	{
	    InputStream music;
	    try
	    {
	    	music = new FileInputStream(new File(filepath));
	    	AudioStream audio = new AudioStream(music);
	    	AudioPlayer.player.start(audio);
	    	
	    }
	    catch(Exception e)
	    {
	    	JOptionPane.showMessageDialog(null,"ERROR");
	    }
	}
	
	public static void quest(String filepath)
	{
	    InputStream music;
	    try
	    {
	    	music = new FileInputStream(new File(filepath));
	    	AudioStream audio = new AudioStream(music);
	    	AudioPlayer.player.start(audio);
	    	
	    }
	    catch(Exception e)
	    {
	    	JOptionPane.showMessageDialog(null,"ERROR");
	    }
	}
	
	public static void main(String [ ] args) {
		//Student hello = new HSstu("will","mechler",2000,80,85,90,10,1);
		Dis wind = new Dis();
		wind.setTitle("Help Me!");
		wind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wind.pack();
		wind.setVisible(true);
		music("E:\\JazzW.wav");
	}
	
}


