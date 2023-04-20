import javax.swing.JFrame;

public class GameFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	// This is a Java code snippet that defines a constructor for a class called GameFrame. The code 
	// creates a new instance of the GamePanel class, sets up the JFrame window, and adds the GamePanel 
	// as a component to the JFrame. Let's dive deeper into what each line of the code does:

	// 1. `GamePanel panel = new GamePanel();` - This line creates a new instance of the GamePanel class by 
			// calling its constructor method.	
	// 2. `this.add(panel);` - This line adds the GamePanel object created in step 1 to this GameFrame object. 
	// 3. `this.setTitle("snake");` - This line sets the title of the JFrame window to "snake".	
	// 4. `this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);` - This line specifies what action should 
			// take place when the user closes the JFrame window. In this case, `JFrame.EXIT_ON_CLOSE` means 
					// that the application should be terminated when the window is closed.
	// 5. `this.setResizable(false);` - This line ensures that the JFrame window cannot be resized by setting 
			// the resizable property to false.	
	// 6. `this.pack();` - This line resizes the JFrame window so that it fits all of its components perfectly.
	// 7. `this.setVisible(true);` - This line makes the JFrame window visible on the screen.	
	// 8. `this.setLocationRelativeTo(null);` - This line centers the JFrame window on the screen.

	// Overall, this code sets up a basic JFrame window, adds a new GamePanel object to it, and configures 
	// various properties such as the window title, close operation, and size. The end result is a GUI window 
	// that displays the contents of the GamePanel.

	GameFrame() {
		GamePanel panel = new GamePanel();
		this.add(panel);
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
