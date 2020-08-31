package View;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Control.Control;

public class View2 extends JFrame {
	
	
	Container cp;
	
	 
	private JList list;
	
	private JButton b1 = new JButton ("Finden");
	private JTextField t2 = new JTextField ("Name (oder Suchwort)");
	private JTextField t3 = new JTextField ("Ort o. PLZ");

	private JTextArea t4 = new JTextArea ("1. Name: Test1 Ort: Berlin Tel: 1 PLZ: 2"+"\n");
	
	 String comboBoxListe[] = {"Standardsuche", "Standardsuche","Geldautomat","Notapotheke","Kino & Filme",
		"Erweiterte Suche","Rückwärtssuche","Postleitzahlsuche","Vorwahlsuche",
	  };
	 
	private JComboBox Standardsuche = new JComboBox(comboBoxListe);
	JPanel fläche = new JPanel(new GridLayout(2,0));
	JPanel fläche2 = new JPanel(new FlowLayout());
	JPanel grund = new JPanel(new GridLayout());
	JPanel grund2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel one = new JPanel(new FlowLayout());
	JPanel two = new JPanel(new FlowLayout());
	JPanel three = new JPanel(new FlowLayout());
	JPanel four = new JPanel(new FlowLayout());
	

public View2() {
	
		cp = getContentPane();
		
		one.add(Standardsuche);
		two.add(t2);
		three.add(t3);
		four.add(b1);
	
		
		cp.add(fläche);
		fläche.add(grund);
		fläche.add(fläche2);
		fläche2.add(t4);
		grund.add(grund2);
		grund2.add(one);
		grund2.add(two);
		grund2.add(three);
		grund2.add(four);
		

		setVisible(true);
		setSize(400,500);
		b1.setActionCommand("Finden");
		Standardsuche.setActionCommand("Rückwärtsuche");
		t4.setEditable(false);
		t4.append("2. Name: Test1 Ort: München  Tel: 2 PLZ: 3" +"\n");
		t4.append("3. Name: Test3 Ort: Köln  Tel: 3 PLZ: 4" +"\n");
		t4.append("4. Name: Test4 Ort: Kassel Tel: 4 PLZ: 5" +"\n");
		
}

public void zuhoehren(Control e) {
	b1.addActionListener(e);
	Standardsuche.addActionListener(e);
}
			
		

	




public JTextField getT2() {
	return t2;
}






public void setT2(JTextField t2) {
	this.t2 = t2;
}






public JTextField getT3() {
	return t3;
}






public void setT3(JTextField t3) {
	this.t3 = t3;
}






public JPanel getOne() {
	return one;
}






public void setOne(JPanel one) {
	this.one = one;
}






public JPanel getTwo() {
	return two;
}






public void setTwo(JPanel two) {
	this.two = two;
}






public JPanel getThree() {
	return three;
}






public void setThree(JPanel three) {
	this.three = three;
}






public JPanel getFour() {
	return four;
}






public void setFour(JPanel four) {
	this.four = four;
}






public String[] getComboBoxListe() {
	return comboBoxListe;
}



public JComboBox getStandardsuche() {
	return Standardsuche;
}


public void setStandardsuche(JComboBox standardsuche) {
	Standardsuche = standardsuche;


		}










public JButton getB1() {
	return b1;
}






public void setB1(JButton b1) {
	this.b1 = b1;
}

		




	public void setComboBoxListe(String[] comboBoxListe) {
	this.comboBoxListe = comboBoxListe;
}






	public static void main(String[] args) {
		new Control();

	}

}
