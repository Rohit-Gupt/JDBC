package com.gui;
import javax.swing.*;
import java.awt.*;
public class GUIApp 
{
	JFrame f;
	JButton add,select,update,delete;
	GUIApp()
	{
		f=new JFrame("GuiApp");
		f.setSize(400,400);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		add = new JButton("ADD");
		select = new JButton("SELECT");
		update = new JButton("UPDATE");
		delete = new JButton("DELETE");
		f.add(add);
		f.add(select);
		f.add(update);
		f.add(delete);
		
		
		
		
		
		
	}
	public static void main(String []args)
	{
		new GUIApp();
		
	}

}
