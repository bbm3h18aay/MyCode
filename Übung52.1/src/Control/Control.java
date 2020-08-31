package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Model.Model;
import View.TestUnusedView;
import View.View2;

public class Control implements ActionListener, ListSelectionListener {
	private View2 V;
	private Model M;
			
	public Control() {
		V = new View2();
		V.zuhoehren(this);
		M = new Model();
		


	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {	
		String s = (String) V.getStandardsuche().getSelectedItem();
		if(e.getActionCommand().equals("Finden")) {
			
			if(s.equals("Rückwärtssuche")) {
		M.suchen2(V.getT3().getText());	
			}
			
			if(s.equals("Standardsuche")) {
		M.suchen(V.getT2().getText(), V.getT3().getText());
			}
			
		}
					
	
		
		switch(s) {
					
		case "Standardsuche":
			V.getT3().setText("Ort o. PLZ");
			V.getThree().setVisible(true);
			V.getT2().setText("Name (oder Suchwort)");
			break;
		case "Rückwärtssuche":
			V.getOne().add(V.getStandardsuche());
			V.getThree().setVisible(false);
			V.getT2().setText("Vorwahl und Telefonnummer");
				break;						
        }
			
		
	}
	
	

		
	}
	
	
