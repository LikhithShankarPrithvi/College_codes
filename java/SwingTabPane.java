import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
/*<applet code="SwingTabPane" width=300 height=120></applet>*/

public class SwingTabPane extends JApplet{
	public void init(){
		JButton b1;
		try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					makeGUI();
				}
			});
		}catch(Exception e){
			System.err.println("Can't create because of "+e);
		}
	}
	private void makeGUI(){
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Fruits", new FruitsPanel());
		jtp.addTab("Login", new LoginPanel());
		jtp.addTab("Flavours", new FlavoursPanel());
		add(jtp);
	}
}
class FruitsPanel extends JPanel{	
	public FruitsPanel(){
		JCheckBox cb1=new JCheckBox("Apple");
		JCheckBox cb2=new JCheckBox("Orange");
		JCheckBox cb3=new JCheckBox("Mango");
		JCheckBox cb4=new JCheckBox("Grapes");
		add(cb1);add(cb2);add(cb3);add(cb4);
	}
}
class LoginPanel extends JPanel implements ActionListener{
	public String msg;
	double a,b,c;
	JButton b1,b2;
	JTextField tf;
	JPasswordField pf;
	public LoginPanel(){
		FlowLayout gl=new FlowLayout();
		setLayout(gl);
		JLabel u = new JLabel("Enter username: ");
    		JLabel p = new JLabel("Enter password: ");
    		tf = new JTextField(20);
    		pf = new JPasswordField(20);
    		b1 = new JButton("See Password");
		b2 = new JButton("Reset");
		add(u); add(tf); add(p); add(pf); add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae){
		String a=tf.getText();
		String b=pf.getText();
		if(ae.getSource()==b1){
			tf.setText("Entered Password: " +b);
		}
		else if(ae.getActionCommand()=="Reset"){
			tf.setText("");
			pf.setText("");
		}		
	}
}
class FlavoursPanel extends JPanel{
	public FlavoursPanel(){
		JComboBox jcb=new JComboBox();
		jcb.addItem("Vanilla");
		jcb.addItem("Strawberry");
		jcb.addItem("Butter Scotch");
		jcb.addItem("Chocolate");
		add(jcb);
	}
}
