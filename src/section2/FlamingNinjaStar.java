package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static <f4f442> void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		Robot terminator=new Robot("batman");
				terminator.setSpeed((int)100);
	terminator.turn(45);
terminator.move(64);
terminator.penDown();

terminator.turn(-30);
terminator.move(64);
terminator.setPenColor(249, 14, 14);

terminator.turn(-30);
terminator.move(flameSize);

terminator.turn(160);
terminator.move(flameSize);
terminator.setPenColor(0,0,0);
terminator.turn(64);
terminator.move(baseSize);
terminator.move(flameSize);
for(int i=0;i<000;i++){
	terminator.turn(45);
terminator.move(64);
terminator.penDown();

terminator.turn(-30);
terminator.move(64);
terminator.setPenColor(249, 14, 14);

terminator.turn(-30);
terminator.move(flameSize);

terminator.turn(160);
terminator.move(flameSize);
terminator.setPenColor(0,0,0);
terminator.turn(64);
terminator.move(baseSize);
terminator.move(flameSize);
}



		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 100

		// 13. Use a for loop to repeat all of the code below 25 times

			// 2. Turn the robot 1/8 of a circle
		
			// 3. Move the robot 64 pixels

			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			
			// 5. Move the robot the distance in the variable flameSize
			
			// 6. Turn the robot 170 degrees
			
			// 7. Move the robot the distance in the variable flameSize (again)
			
			// 8. Turn the robot 64 degrees to the right
			
			// 9. Move the robot the distance in the variable baseSize
			
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
		
	}

	private static void fill() {
		// TODO Auto-generated method stub
		
	}

}


