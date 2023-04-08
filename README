# Java Snake Game Code Summary

This is a summary of the Java code for a simple implementation of the classic "snake" game.

## `SnakeGame` class

The `SnakeGame` class contains the main logic for the game and manages the game board, the snake, and the food.

### `SnakeGame(int width, int height)`

Constructor that initializes the game board dimensions and creates a new `Snake` and `Food` object. Accepts two integer arguments for the width and height of the game board.

### `void paint(Graphics g)`

Paint method that draws the game board, snake, and food on the screen. Accepts a `Graphics` object as an argument.

### `void move()`

Moves the snake on the game board by shifting each body segment one unit in the direction of travel. The distance moved is determined by a `UNIT_SIZE` constant defined in the class scope.

### `void checkCollision()`

Checks for collisions between the snake and the boundaries of the game board, as well as collisions between the snake's head and its body or the food. If a collision is detected, the game ends.

### `void gameOver(Graphics g)`

Displays a "game over" message on the screen when the game ends. Accepts a `Graphics` object as an argument.

### `KeyDown(KeyEvent e)`

Handles user keyboard input to control the direction of the snake. Accepts a `KeyEvent` object as an argument.

## `Snake` class

The `Snake` class represents the snake in the game.

### `Snake(int length)`

Constructor that initializes the snake's position and length. Accepts an integer argument for the starting length of the snake.

### `void move()`

Moves the snake on the game board by shifting each body segment one unit in the direction of travel. The speed of movement is controlled by a `speed` variable that increases as the snake gets longer.

## `Food` class

The `Food` class represents the food that the snake needs to eat to grow.

### `Food(int x, int y)`

Constructor that initializes the position of the food on the game board. Accepts two integer arguments for the x and y coordinates of the food.

### `void newPosition()`

Generates a new random position for the food on the game board. 

---

This summary provides an overview of the main Java code for a simple implementation of the Snake game. The actual implementation may include additional features or functionality not covered here.

## Instructions to run: 

1. Open terminal:
2. First command: javac GameFrame.java GamePanel.java SnakeGame.java
3. Second command: java GameFrame GamePanel SnakeGame
4. Program will then open.
