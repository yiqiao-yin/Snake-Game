# Java Snake Game Code Summary

<p align="center"><img src="https://github.com/yiqiao-yin/Snake-Game/blob/main/docs/anime.gif"></img></p>

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

Running the Java Snake Game Code in VSCode: To run the Java code for this Snake game, you will need to have Java and Visual Studio Code installed on your computer. 

### 1. Clone the repository

Clone the repository that contains the Java code onto your local machine. You can do this by running the following command in your terminal:

```
git clone https://github.com/yiqiao-yin/Snake-Game.git
```

### 2. Open the Java project in VSCode

Open up Visual Studio Code and choose "Open Folder" from the File menu. Navigate to the directory where you cloned the repository in step 1 and select it. This should open up the Java project in VSCode.

### 3. Run the code

To run the Java code, click on the "Run" button at the top of the screen (or use the keyboard shortcut `Ctrl + Shift + D` followed by `Enter`). This should bring up the Run panel at the top of the screen. From here, you can click the green "Play" button to run the program. 

The Snake game should now be running in a new window. Use the arrow keys on your keyboard to control the direction of the snake and try to eat as many pieces of food as possible!