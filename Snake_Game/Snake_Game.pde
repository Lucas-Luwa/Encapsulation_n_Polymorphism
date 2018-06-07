class Segment {
  int y;
  int x;
  //2. Create x and y member variables to hold the location of each segment.
  Segment(int x, int y) {
    this.x = x;
    this.y = y;
  }
  // 3. Add a constructor with parameters to initialize each variable.
  int gety() {
    return y;
  }
  int getx() {
    return x;
  }
  void setx(int x) {
    this.x = x;
  }
  void sety(int y) {
    this.y = y;
  }
  // 4. Add getter and setter methods for both the x and y member variables.
}
// 5. Create (but do not initialize) a Segment variable to hold the head of the Arman Snake
Segment snakehead;
// 6. Create and initialize String to hold the direction of your snake e.g. "up"
String direction = "up";
int piecesoffood = 0;
// 7. Create and initialize a variable to hold how many pieces of food the snake has eaten.
int foodX = ((int)random(50)*10);
int foodY = ((int)random(50)*10);
// 8. Create and initialize foodX and foodY variables to hold the location of the food.
// (Hint: use the random method to set both the x and y to random locations within the screen size (500 by 500).)
//int foodX = ((int)random(50)*10);
void setup() {
  size(500, 500);
  // 10. initialize your head to a new segment.
  snakehead = new Segment(200, 200);
  // 11. Use the frameRate(int rate) method to set the rate to 20.
  frameRate(20);
}
void draw() {
  background(0);
  drawFood();
  drawTail();
  drawSnake();
  move();
  collision();
}
// 13. Complete the drawFood method below. (Hint: each piece of food should be a 10 by 10 rectangle).
void drawFood() {
  rect(foodX, foodY, 10, 10);
}
//14. Draw the snake head
void drawSnake() {
  rect(snakehead.getx(), snakehead.gety(), 10, 10);
  //test your code
}
// 15. Complete the move method below.kk
void move() {
  // 16. Create a switch statement using your direction variable. Depending on the direction, add a new segment to your snake.
  // The first case will look like this
  switch(direction) {

  case "up":
    snakehead = new Segment(snakehead.getx(), snakehead.gety() - 10);
    break;
  case "down":
    snakehead = new Segment(snakehead.getx(), snakehead.gety() + 10);
    break;   

  case "left":
    snakehead = new Segment(snakehead.getx()-10, snakehead.gety());
    break;
  case "right":
    snakehead = new Segment(snakehead.getx()+10, snakehead.gety());
    break;
  }
  System.out.println(direction);
  // 17. Call the checkBoundaries method to make sure the snake doesn't go off the screen.
  checkBoundaries();
}
// 18. check if your head is out of bounds (teleport you snake to the other side).
void checkBoundaries() {
  if (snakehead.getx()<0) {
    snakehead.x = 500;
  }
  if (snakehead.getx()>500) {
    snakehead.x = 0;
  }
  if (snakehead.gety()<0) {
    snakehead.y = 500;
  }
  if (snakehead.gety()>500) {
    snakehead.y = 0;
  } else {
  }
}
// 19. Complete the keyPressed method below. Use if statements to set your direction variable depending on what key is pressed.
//Window T for formatting
void keyPressed() {
  if (keyCode == UP) {
    direction = "up";
  } else if (keyCode == DOWN) {

    direction = "down";
  } else if (keyCode == LEFT) {

    direction = "left";
  } else if (keyCode == RIGHT) {

    direction = "right";
  }
}
//20. Make sure that the key for your current direction’s opposite doesn’t work(i.e. If you’re going up, down key shouldn’t work)
// 21. Complete the missing parts of the collision method below.
void collision() {
  // If the segment is colliding with a piece of food...
  if (foodX == snakehead.getx()) {
    if (foodY == snakehead.gety()) {
      piecesoffood+=1;
      foodX = ((int)random(50)*10); 
      foodY = ((int)random(50)*10);
    }
  }
  // Increase the amount of food eaten and set foodX and foodY to new random locations.
}
/**
 ** Part 2: making the tail 
 **/
//  1. Create and initialize an ArrayList of Segments. (This will be your snake!)
ArrayList <Segment> tail = new ArrayList<Segment>();
// 2. Complete the missing parts of the drawTail method below.
void drawTail() {
  // Add your head to your ArrayList
  tail.add(snakehead);
  // Draw a 10 by 10 rectangle for each Segment in your snake ArrayList.
  for(int i = 0; i < tail.size(); i++){
   rect(tail.get(i).x, tail.get(i).y, 10, 10);
  }

  // While the snake size is greater than your food, remove the first Segment in your snake.
  if(tail.size() > piecesoffood){
    tail.remove(0);
  }
}

// 3. Complete the missing parts of the bodyCollision method below.
void bodyCollision() {
  // If different segments have the same location...
  // Set food back to 3.
  
}