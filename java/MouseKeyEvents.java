import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MouseKeyEvents" width=800 height=600></applet>*/
public class MouseKeyEvents extends Applet implements MouseListener, MouseMotionListener{
	String msg=" ";
	int X=0,Y=0;
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
		//addKeyListener(this);
	}
	public void mouseClicked(MouseEvent me){
		X=0;	Y=10;
		msg="Mouse Clicked...";
		repaint();
	}
	public void mouseEntered(MouseEvent me){
		X=0;	Y=10;
		msg="Mouse Entered...";
		repaint();
	}
	public void mouseExited(MouseEvent me){
		X=0;	Y=10;
		msg="Mouse Exited...";
		repaint();
	}
	public void mousePressed(MouseEvent me){
		X=me.getX();	Y=me.getY();
		msg="Mouse Key Down...";
		repaint();
	}
	public void mouseReleased(MouseEvent me){
		X=me.getX();	Y=me.getY();
		msg="Mouse Key Up...";
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		X=me.getX();	Y=me.getY();
		msg="********";
		showStatus("Dragging mouse at "+X+" , "+Y);
		repaint();
	}
	public void mouseMoved(MouseEvent me){
		X=me.getX();	Y=me.getY();
		msg="********";
		showStatus("Moving mouse at "+me.getX()+" , "+me.getY());
		repaint();
	}
	/*public void keyPressed(KeyEvent ke){
		showStatus("Keyboard Key Down...");
		int key=ke.getKeyCode();
		switch(key){
			case KeyEvent.VK_F1: msg+="<F1>";	break;
			case KeyEvent.VK_PAGE_DOWN: msg+="<PageDown Key Pressed>";	break;
			case KeyEvent.VK_LEFT: msg+="<Navigation Left Key Pressed>";	break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent ke){
		showStatus("Keyboard Key Up...");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}*/
	public void paint(Graphics g){
		g.drawString(msg,X,Y);
		/*g.drawLine(100,60,20,20);
		g.fillOval(107,70,8,8);
		g.drawOval(80,80,20,10);
		g.drawOval(120,80,20,10);
		g.drawRoundRect(105,95,10,20,10,10);//top,left,width,height,xDiam,yDiam
		g.drawRoundRect(100,120,20,10,10,10);*/
		
	}
}
