import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="FlowApp" width=800 height=500></applet>*/
public class FlowApp extends Applet implements ItemListener,ActionListener{
	String msg=" ";
	Checkbox winXP,solaris,mac;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	double a,b,c;
	public void init(){
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		setLayout(fl);
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		winXP=new Checkbox("Windows XP",null,true);
		solaris=new Checkbox("Solaris");
		mac=new Checkbox("Mac OS");
		add(winXP);	add(solaris);	add(mac);
		//Register to receive the events
		winXP.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);

		l1=new Label("Enter Value of A");
		l2=new Label("Enter Value of B");
		l3=new Label("Sum of Two numbers");
		t1=new TextField(4);
		t2=new TextField(4);
		t3=new TextField(6 );
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);t3.setEditable(false);
		b1=new Button("Calaculate");
		add(b1);
		b1.addActionListener(this);
	}
	//Repaint when status of a check box changes
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void actionPerformed(ActionEvent ae){
		String a1=t1.getText();
		String b1=t2.getText();
		try{
			a=Double.parseDouble(a1);
			b=Double.parseDouble(b1);
			c=a+b;
			String c1=String.valueOf(c);
			t3.setText(c1);
			showStatus("Sum");
			repaint();
		}
		catch(Exception e){
			showStatus("Invalid Data");
			t3.setText("Invalid inputs");
		}
	}
	//Display current state of the checkboxes
	public void paint(Graphics g){
		msg="Current state: ";
		g.drawString(msg,6,80);
		msg="Windows XP: "+winXP.getState();
		g.drawString(msg,6,100);
		msg="Solaris: "+solaris.getState();
		g.drawString(msg,6,120);
		msg="Mac OS: "+mac.getState();
		g.drawString(msg,6,140);
	}
}
