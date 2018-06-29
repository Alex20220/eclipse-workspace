package _Swing;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

public class ButtonAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
			
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked");
	}

	public ButtonAction(String name, Icon icon) {
		super(name, icon);
		
	}


	public ButtonAction(String name) {
		super(name);
		
	} 

	
}
