/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton [] a;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		_02_FindTheHiddenButton dog = new _02_FindTheHiddenButton();
		dog.start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String num = JOptionPane.showInputDialog("Enter a number:");
		int x = Integer.parseInt(num);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		a = new JButton [x];
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i < a.length; i++ ) {
			//6. initialize each JButton in the array
			a[i] = new JButton();
			//7. add the ActionListener to each JButton
			a[i].addActionListener(this);
			//8. add each JButton to the panel
			panel.add(a[i]);
		}
		
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		Random random = new Random();
		hiddenButton = random.nextInt(x);
		window.pack();
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		a[hiddenButton].setText("me");
		System.out.println("me");
		//15. Use Thread.sleep(100); to pause the program.
		//    Surround it with a try/catch
		
		try {
			Thread.sleep(500);
		}catch(Exception e){
			
		}
			
		
		//16. Set the text of the JButton located at hiddenButton to be blank.
			a[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(a[hiddenButton].equals(buttonClicked)) {
			JOptionPane.showMessageDialog(null, "yay");
		}
		//18. else tell them to try again
	}
}
