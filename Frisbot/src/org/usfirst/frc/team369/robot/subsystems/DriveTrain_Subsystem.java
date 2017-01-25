package org.usfirst.frc.team369.robot.subsystems;

import org.usfirst.frc.team369.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain_Subsystem extends Subsystem{
	private RobotDrive MainDrive = new RobotDrive(RobotMap.LeftFront,RobotMap.LeftBack, RobotMap.RightFront, RobotMap.RightBack);
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void Drive(double leftSpeed, double rightSpeed){
		MainDrive.tankDrive(leftSpeed, rightSpeed);
	}

	public void Stop(){
		MainDrive.tankDrive(0,0);
	}
}
