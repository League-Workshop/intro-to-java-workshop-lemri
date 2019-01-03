package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot terminator=new Robot("batman");
		Robot r2d2=new Robot("mini");
		Robot r2g=new Robot("mini");
		terminator.setSpeed((int)100);
		r2d2.setSpeed((int)100);
		r2g.setSpeed((int)100);
		terminator.penDown();
	r2g.penDown();
		r2d2.penDown();
	terminator.setRandomPenColor();
	for (int i = 5; i < 100; i++) {
		terminator.move(200);
	r2d2.turn(100);
	r2d2.move(50);
		terminator.turn(75);
		terminator.move(55);
		terminator.turn(67);
		terminator.move(54);
		terminator.turn(90);
		r2d2.turn(90);
		terminator.move(50);
		terminator.turn(90);
		terminator.move(6);
		terminator.turn(70);
		terminator.move(62);
		r2d2.move(150);
		terminator.turn(30);
		r2g.move(25);
		r2g.turn(95);
		 r2d2.setRandomPenColor();
		 r2g.setRandomPenColor();
		 terminator.setRandomPenColor();
	}
	}
		
		// 5. Set your robot's pen down 
		
		// 3. Set the robot to go at max speed (100)
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			
	}

