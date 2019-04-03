/**
 * @author Manoj Regmi
 */

package lab5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight {
//	static String light = "";
	public static void main(String[] args) {
		
		JFrame mainFrame = new JFrame("Traffic Light");
		JPanel mainPanel = new JPanel();
		JRadioButton red = new JRadioButton("Red");
		JRadioButton green = new JRadioButton("Green");
		JRadioButton yellow = new JRadioButton("Yellow");
		ButtonGroup btngrp = new ButtonGroup();
		JButton submit = new JButton("click");
		
		btngrp.add(red);
		btngrp.add(green);
		btngrp.add(yellow);
		
		mainPanel.add(red);
		mainPanel.add(green);
		mainPanel.add(yellow);
		mainPanel.add(submit);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
		mainFrame.setSize(700, 700);
		
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("in");
				if(red.isSelected()) {
					System.out.println("Red");
				}
				if(green.isSelected()) {
					System.out.println("Green");
//					light = "Green";
				}
				if(yellow.isSelected()) {
					System.out.println("Yellow");
//					light = "Yellow";
				}
			}
		});
//		System.out.println(light);
	}

}
