import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
	int x,y;
	String event;
	public void init()
	{
	addMouseListener(this);
	addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("Mouse is"+event+"at:"+x+"&"+y,x,y);
	}
	public void mouseMoved(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		event="Moving";
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		event="Dragging";
		repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		event="Clicked";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		event="Released";
		repaint();
	}
	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		event="Pressed";
		repaint();
	}
	public void mouseEntered(MouseEvent e)
	{
		showStatus("Mouse Entered applet area");
	}
	public void mouseExited(MouseEvent e)
	{
		showStatus("Mouse Exited applet area");
	}
}
//<applet code="MouseEvents.class" width=500 height=500></applet>
	
	