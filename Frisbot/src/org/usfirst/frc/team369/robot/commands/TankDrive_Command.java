package org.usfirst.frc.team369.robot.commands;

import org.usfirst.frc.team369.robot.OI;
import org.usfirst.frc.team369.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive_Command extends Command{

	public TankDrive_Command(){
		requires(Robot.DriveTrain);
		
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.DriveTrain.Drive(Robot.oi.getleftSpeed(),Robot.oi.getRightSpeed());
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}


}
