package hust.soict.dsai.swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
public class ButtonListener implements ActionListener{   
	public ButtonListener(JTextField tfDisplay) {
	        this.tfDisplay = tfDisplay;
	    }
	private JTextField tfDisplay;
	@Override 
    public void actionPerformed(ActionEvent e) {  
        String button = e.getActionCommand();  
        if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {  
            tfDisplay.setText((tfDisplay).getText() + button);  
        }  
        else if (button.equals("DEL")) {  
        	String Text = tfDisplay.getText();
        	if (Text.length() > 0) {
        	Text = Text.substring(0,Text.length() - 1);
        	tfDisplay.setText(Text);
        }
        }
        else {  
           tfDisplay.setText("");
        }  
    }
	public JTextField getTfDisplay() {
		return tfDisplay;
	}
	public void setTfDisplay(JTextField tfDisplay) {
		this.tfDisplay = tfDisplay;
	}  
}