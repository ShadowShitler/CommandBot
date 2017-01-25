package org.usfirst.frc.team369.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;



public class Shooter{
	
	Victor shootTop;
	Victor shootBot;
	Relay LoadingRelay;
	DoubleSolenoid PP;
	DigitalInput limit;
	Timer RelayTime;
	boolean isLoaded = true;
	boolean motorsOn;
	boolean shooting = false;
	double motorsStarted;
	double newStamp;
	static boolean limmy;
	boolean isPPDown;
	

	
	public Shooter(int shootTopPos, int shootBotPos, int loadRelay, int Sol1, int Sol2, int lim){
		shootTop = new Victor(shootTopPos);
        shootBot = new Victor(shootBotPos);
        LoadingRelay = new Relay(loadRelay);
        PP = new DoubleSolenoid (Sol1,Sol2);
        limit = new DigitalInput(lim);
        motorsOn = false;
        
	}

	public void load(){
		if(isLoaded == false){
			PPdown();
			LoadingRelay.set(Relay.Value.kForward);
			Timer.delay(.25);
			LoadingRelay.set(Relay.Value.kOff);
			isLoaded = true;
			isPPDown = true;
		}
		
			
	}
	
	public void getReady(){
		shootTop.set(.75);
		shootBot.set(.5);
		if (motorsOn == false){
			motorsStarted = Timer.getFPGATimestamp();
			motorsOn = true;
		}	
	}

	public void shoot(int x){
		getReady();

		shooting = true;
		
		for (int i = 0; i < x;){
			newStamp = Timer.getFPGATimestamp();
			//PPdown();
			load();
		if ((newStamp - motorsStarted) < .5){
			PPup();
			isPPDown = false;
			i++;
		}
		}
		shooting = false;
	}

	public boolean isShooting(){
		return shooting;
	}
	public void PPup(){
		PP.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void PPdown(){
	
		PP.set(DoubleSolenoid.Value.kForward);
		}

	public void stopShootMotors(){
		shootTop.set(0);
		shootBot.set(0);
		motorsOn = false;
	}
	public void limmyt(){
		if (limit.get()){
			limmy = true;
		}
		else if (!limit.get()){
			limmy = false;
		}
		
	}
public void isPPdown(){
		 if (limit.get()){
			 isLoaded = true;
		 }
		 else if(!limit.get()){
			 isLoaded = false;
		 }
	}
}