package org.usfirst.frc.team369.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int
		LeftFront = 0,
		LeftBack = 1,
		RightFront = 2,
		RightBack = 3;
	
	static int 
	square = 1,
	x = 2,
	circle = 3,
	triangle = 4,
	L1 = 5,
	R1 = 6,
	L2 = 7,
	R2 = 8,
	share = 9,
	options = 10,
	L3 = 11,
	R3 = 12,
	ps = 13,
	touchpad = 14,
	//analog
	leftX = 0,
	leftY = 1,
	rightX = 2,
	L2Analog = 3,
	R2Analog = 4,
	rightY = 5;
		
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
