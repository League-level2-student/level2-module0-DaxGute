package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] a = new Robot[5];

		// 2. create an array of 5 robots.
		int x = 100;
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < a.length; i++) {
			a[i] = new Robot(x, 600);
			a[i].setSpeed(200);
			x += 100;
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		Random random = new Random();
		int smallY = 600;
		int winner = 0;
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (smallY > 0) {
			for (int i = 0; i < a.length; i++) {
				int y = random.nextInt(20);
				a[i].move(y);
				if (a[i].getY() < smallY) {
					smallY = a[i].getY();
					winner = i;    
				}
				
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		 
		// 7. declare that robot the winner and throw it a party!
		System.out.println("The winner is " + winner );
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
