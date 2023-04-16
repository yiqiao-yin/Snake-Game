// Importing required Java libraries and packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import javax.swing.ImageIcon;

// Importing the JPanel class from the javax.swing package
import javax.swing.JPanel;


public class GamePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	// Defining constant variables to specify the width and height of the game screen, 
	// the size of each unit in the game and the maximum number of units that can fit on the screen
	static final int WIDTH = 500;
	static final int HEIGHT = 500;
	static final int UNIT_SIZE = 20;
	static final int NUMBER_OF_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);


	// Declaring two integer arrays to hold x and y coordinates for body parts of the snake
	final int x[] = new int[NUMBER_OF_UNITS];
	final int y[] = new int[NUMBER_OF_UNITS];


	// initial length of the snake
	int length = 5;
	int foodEaten;
	int foodX;
	int foodY;
	char direction = 'D';
	boolean running = false;
	Random random;
	Timer timer;


	// Constructor for the GamePanel class
	GamePanel() {
		// Creating a new Random object
		random = new Random();
		
		// Setting the size of the JPanel equal to the constants WIDTH and HEIGHT
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		// Setting the background color of the JPanel to dark gray
		this.setBackground(Color.DARK_GRAY);
		
		// Allowing the GamePanel to receive keyboard input by setting it to focusable
		this.setFocusable(true);
		
		// Adding a new instance of the MyKeyAdapter inner class as the key listener 
		// to detect user inputs related to moving the snake
		this.addKeyListener(new MyKeyAdapter());
		
		// Starting the game loop
		play();
	}	


	// Method that starts the game loop and gameplay
	public void play() {
		// Adds a food object to the game board
		addFood();
		
		// Sets the running variable to true, indicating that the game is currently being played
		running = true;
		
		// Creates a new Timer object with a delay of 80 milliseconds 
		// between each update and adds the current GamePanel instance as an ActionListener
		timer = new Timer(80, this);
		
		// Starts the timer, which will call the actionPerformed method of the GamePanel 
		// instance every 80 milliseconds and update the game state and repaint the screen 
		timer.start();	
	}


	// Overrides the paintComponent method of JPanel to include custom painting behavior
	@Override
	public void paintComponent(Graphics graphics) {
		// Calls the paintComponent method of the superclass (JPanel) to perform any 
		// necessary painting done by the parent class before additional painting is done
		super.paintComponent(graphics);
		
		// Calls the custom draw method, which defines how to paint this specific instance of 
		// GamePanel using the specified Graphics object
		draw(graphics);
	}


	// Moves the snake on the game board by shifting each body segment one unit in the direction of travel
	public void move() {

		// Shifts each element in the x and y arrays to the position of the previous element,
		// effectively moving each body segment one unit closer to the head's next position
		for (int i = length; i > 0; i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}

		// Determines the direction the head should move based on the current value of 'direction',
		// shifting its coordinates by a single unit length in the appropriate direction
		if (direction == 'L') {
			x[0] = x[0] - UNIT_SIZE;
		} else if (direction == 'R') {
			x[0] = x[0] + UNIT_SIZE;
		} else if (direction == 'U') {
			y[0] = y[0] - UNIT_SIZE;
		} else {
			y[0] = y[0] + UNIT_SIZE;
		}	
	}


	// Checks if the snake's head is at the same position as the food
	public void checkFood() {
		// If the head is at the same position as the food, add one to the length of the snake,
		// increment the count of foods eaten, and place a new piece of food on the game board
		if(x[0] == foodX && y[0] == foodY) {
			length++;
			foodEaten++;
			addFood();
		}
	}


	// Draws the game board and all its contents
	public void draw(Graphics graphics) {
		// If the game is running, draw the food, snake body, and score display
		if (running) {
			// Draw the food as a colored oval
			graphics.setColor(new Color(210, 115, 90));
			graphics.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);
			
			// Draw the snake's head as a white rectangle
			graphics.setColor(Color.white);
			graphics.fillRect(x[0], y[0], UNIT_SIZE, UNIT_SIZE);
			
			// Draw each segment of the snake's body as a colored rectangle
			for (int i = 1; i < length; i++) {
				graphics.setColor(new Color(40, 200, 150));
				graphics.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
			}
			
			// Draw the score display as white text centered at the top of the screen
			graphics.setColor(Color.white);
			graphics.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 25));
			FontMetrics metrics = getFontMetrics(graphics.getFont());
			graphics.drawString("Score: " + foodEaten, (WIDTH - metrics.stringWidth("Score: " + foodEaten)) / 2, graphics.getFont().getSize());
		
		} else {
			// If the game is over, call the gameOver() method to display a message
			gameOver(graphics);
		}
	}


	// Generates random coordinates for food and places it on the game board
	public void addFood() {
		// Calculate a random x coordinate for the food within the game board boundaries
		foodX = random.nextInt((int)(WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		// Calculate a random y coordinate for the food within the game board boundaries
		foodY = random.nextInt((int)(HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
	}


	// Check for collisions with the snake's own body or the game board boundaries
	public void checkHit() {
		// Check if the head of the snake has collided with any part of its body
		for (int i = length; i > 0; i--) {
			if (x[0] == x[i] && y[0] == y[i]) {
				// Stop the game if a collision is detected
				running = false;
			}
		}
		
		// Check if the head of the snake has hit the game board boundaries
		if (x[0] < 0 || x[0] > WIDTH || y[0] < 0 || y[0] > HEIGHT) {
			// Stop the game if a collision is detected
			running = false;
		}
		
		// Stop the timer if a collision was detected
		if(!running) {
			timer.stop();
		}
	}

	
	// Displays game over message and score on screen
	public void gameOver(Graphics graphics) {
		// Set the color and font for the "Game Over" message
		graphics.setColor(Color.red);
		graphics.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 50));
		
		// Calculate the width of the "Game Over" message using the current font and get its font metrics
		FontMetrics metrics = getFontMetrics(graphics.getFont());
		
		// Display the "Game Over" message at the center of the game board
		graphics.drawString("Game Over", (WIDTH - metrics.stringWidth("Game Over")) / 2, HEIGHT / 2);
			
		// Set the color and font for the score display
		graphics.setColor(Color.white);
		graphics.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 25));
		
		// Calculate the width of the score display using the current font and get its font metrics
		metrics = getFontMetrics(graphics.getFont());
		
		// Display the player's score below the "Game Over" message
		graphics.drawString("Score: " + foodEaten, (WIDTH - metrics.stringWidth("Score: " + foodEaten)) / 2, graphics.getFont().getSize());
	}


	// This code defines the actionPerformed method to handle ActionEvents
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Only do the following if the game is currently running
		if (running) {
			// Move the snake, check for food, and check for collisions with walls or itself
			move();
			checkFood();
			checkHit();
		}
		// Repaint the game board to reflect any updates
		repaint();
	}


	// This code defines a custom KeyAdapter class to listen for user keyboard input
	public class MyKeyAdapter extends KeyAdapter {
		@Override
		// This method will be called whenever the user presses a key
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) { // Check which key was pressed
				case KeyEvent.VK_LEFT: // If it was the left arrow key,
					if (direction != 'R') { // and the snake isn't currently moving right,
						direction = 'L'; // change the snake's direction to left.
					}
					break;
					
				case KeyEvent.VK_RIGHT: // If it was the right arrow key,
					if (direction != 'L') { // and the snake isn't currently moving left,
						direction = 'R'; // change the snake's direction to right.
					}
					break;
					
				case KeyEvent.VK_UP: // If it was the up arrow key,
					if (direction != 'D') { // and the snake isn't currently moving down,
						direction = 'U'; // change the snake's direction to upward.
					}
					break;
					
				case KeyEvent.VK_DOWN: // If it was the down arrow key,
					if (direction != 'U') { // and the snake isn't currently moving upward,
						direction = 'D'; // change the snake's direction to down.
					}
					break;		
			}
		}
	}
}








































