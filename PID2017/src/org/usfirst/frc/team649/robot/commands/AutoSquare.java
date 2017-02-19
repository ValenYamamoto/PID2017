package org.usfirst.frc.team649.robot.commands;

import org.usfirst.frc.team649.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoSquare extends CommandGroup {
    public AutoSquare(double distance) {
    	addSequential(new DrivetrainPIDCommand(distance, false));
    	addSequential(new DrivetrainPIDCommand(-90, true));
    	addSequential(new DrivetrainPIDCommand(distance, false));
    	addSequential(new DrivetrainPIDCommand(-90, true));
    	addSequential(new DrivetrainPIDCommand(distance, false));
    	addSequential(new DrivetrainPIDCommand(-90, true));
    	addSequential(new DrivetrainPIDCommand(distance, false));
    	addSequential(new DrivetrainPIDCommand(-90, true));
    	
//    	double turnDistance = Robot.drivetrain.getTranslationalDistanceForTurn(90);
//    	addParallel(new DrivePIDRight(turnDistance));
//    	addParallel(new DrivePIDLeft(-turnDistance));
    	//addSequential(new DrivetrainPIDCommand(distance));
//    	SmartDashboard.putString("Auto Square", "Executing");
//    	addSequential(new ResetDrivetrainEncoders());
//    	addSequential(new TurnWithEncoders(90));
//    	addSequential(new ResetDrivetrainEncoders());
//    	addSequential(new DrivetrainPIDCommand(distance));
//    	addSequential(new TurnWithEncoders(90));
//    	addSequential(new DrivetrainPIDCommand(distance));
//    	addSequential(new TurnWithEncoders(90));
//    	addSequential(new DrivetrainPIDCommand(distance));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
