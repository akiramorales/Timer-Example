import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class DaFrame extends JFrame implements ActionListener
{
	private int height;
	private int wide;
	private JButton daButton;
	height = 0, wide = 0;
	public DaFrame()
	{
		setBounds(100, 100, 800, 600);
		setLayout(null);
		
		JButton daButton = new JButton("DaButton");
		daButton.setSize(100, 50);
		daButton.setLocation(getWidth()/2-daButton.getWidth()/2, getHeight()/2-daButton.getHeight()/2);
		add(daButton);
		Timer t1 = new Timer(100, this);
		t1.start();
		this.setFocusable(true);
		
		this.addKeyListener(new KeyListener()
				{

					@Override
					public void keyPressed(KeyEvent e) {
						if(e.getKeyCode() == e.VK_UP)
						{
							height = 5;
						}
						else if(e.getKeyCode() == e.VK_DOWN)
						{
							height = -5;
						}
						else if(e.getKeyCode() == e.VK_LEFT)
						{
							wide = -5;
						}
						else if(e.getKeyCode() == e.VK_RIGHT)
						{
							wide = 5;
						}
					}

					@Override
					public void keyReleased(KeyEvent e) {
						if(e.getKeyCode() == e.VK_UP)
						{
							height = 0;
						}
						else if(e.getKeyCode() == e.VK_DOWN)
						{
							height = 0;
						}
						else if(e.getKeyCode() == e.VK_LEFT)
						{
							wide = 0;
						}
						else if(e.getKeyCode() == e.VK_RIGHT)
						{
							wide = 0;
						}
					}

					@Override
					public void keyTyped(KeyEvent e) {
						
					}
			
				});
		
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		daButton.setSize(daButton.getWidth() + wide, daButton.getHeight() + height);
		daButton.setLocation(getWidth()/2-daButton.getWidth()/2, getHeight()/2-daButton.getHeight()/2);
		repaint();
	}
	
	public static void main(String args[])
	{
		new DaFrame();
	}

}
