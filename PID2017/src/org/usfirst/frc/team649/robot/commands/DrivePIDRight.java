// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team649.robot.commands;

import org.usfirst.frc.team649.robot.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class  DrivePIDRight extends Command {
	double distance;
	double tolerance = 0.25;
	public PIDController drivePID;
	public Timer time;
	public boolean isFinished;
	
    public DrivePIDRight(double distance) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	drivePID = Robot.rightDT.getPIDController();
    	
    	this.distance = distance;
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
	protected void initialize() {
    	drivePID.enable();
    	Robot.isPIDActiveRight = true;
    	double setpoint = Robot.rightDT.getPosition() + distance;
    	drivePID.setSetpoint(setpoint);
    	SmartDashboard.putNumber("setpoint right", setpoint);
    	time = new Timer();
    	time.reset();
    	isFinished = false;
//    	System.out.println("INIT RIGHT PID");
//    	Robot.logMessage("Init Right PID, right Enc: " + Robot.rightDT.getPosition() + ", moving to: " + setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
	protected void execute() {
//    	System.out.println("RUNNING RIGHT PID");
    	if(drivePID.onTarget() && time.get() < 0.01){
    		time.start();
    	}else if(time.get() > 0.01 && !drivePID.onTarget()){
    		time.stop();
    		time.reset();
    	}
    	if(time.get()> 0.1){
    		isFinished = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
	protected boolean isFinished() {

        return isFinished;
    }

    // Called once after isFinished returns true
    @Override
	protected void end() {
    	drivePID.disable();
    	Robot.isPIDActiveRight = false;
//    	System.out.println("END RIGHT PID")
//    	Robot.logMessage("Finished Right PID, right Enc: " + Robot.rightDT.getPosition());
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
	protected void interrupted() {
    }
}