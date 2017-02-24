
package org.usfirst.frc.team649.robot;

import org.usfirst.frc.team649.robot.commands.AutoSquare;
import org.usfirst.frc.team649.robot.commands.DriveForwardRotate;
import org.usfirst.frc.team649.robot.commands.DrivePIDLeft;
import org.usfirst.frc.team649.robot.commands.DrivePIDRight;
import org.usfirst.frc.team649.robot.commands.DrivetrainPIDCommand;
import org.usfirst.frc.team649.robot.commands.ResetDrivetrainEncoders;
//import org.usfirst.frc.team649.robot.commands.RunIntake;
import org.usfirst.frc.team649.robot.commands.SetGearFlap;
import org.usfirst.frc.team649.robot.commands.SetGearIntakeFlywheels;
import org.usfirst.frc.team649.robot.commands.SetIntakeGearCommand;
//import org.usfirst.frc.team649.robot.commands.SetIntakePistons;
import org.usfirst.frc.team649.robot.commands.TurnWithEncoders;
import org.usfirst.frc.team649.robot.subsystems.DrivetrainSubsystem;
import org.usfirst.frc.team649.robot.subsystems.GearSubsystem;
import org.usfirst.frc.team649.robot.subsystems.IntakeSubsystem;
import org.usfirst.frc.team649.robot.subsystems.LeftDTPID;
import org.usfirst.frc.team649.robot.subsystems.RightDTPID;
import org.usfirst.frc.team649.robot.subsystems.ShooterSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

	SendableChooser<Command> chooser = new SendableChooser<>();
	public static DrivetrainSubsystem drivetrain;
	public static GearSubsystem gear;
	public static IntakeSubsystem intake;
	public static ShooterSubsystem shoot;
	public static LeftDTPID leftDT;
	public static boolean isPIDActiveLeft; 
	public static boolean isPIDActiveRight; 
	public static RightDTPID rightDT;
	public static boolean isPIDActive;
	public static boolean isPIDTurn;
	public static int gearIntakeState;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new DrivetrainSubsystem();
		//leftDT = new LeftDTPID();
		//rightDT = new RightDTPID();
		isPIDActiveLeft = false;
		isPIDActiveRight = false;
		isPIDActive = false;
		//drivetrain.resetEncoders();
		isPIDTurn = false;
		//drivetrain.callibrateGyro();
//		gear = new GearSubsystem();
//		intake = new IntakeSubsystem();
		gearIntakeState = 3;
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		isPIDTurn = false;
		//drivetrain.resetEncoders();
		//new AutoSquare(65).start();
		new DrivetrainPIDCommand(160, false).start();
		//new DrivetrainPIDCommand(40, false).start();
		//new ResetDrivetrainEncoders().start();
		//new TurnWithEncoders(90).start();
		//new DrivePIDRight(12).start();
		//new DrivePIDLeft(12).start();
		//new DrivetrainPIDCommand(-90, true).start();
	}  

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		//SmartDashboard.putNumber("Right Encoder", drivetrain.getDistanceDTRight());
		//SmartDashboard.putNumber("Left Encoder", drivetrain.getDistanceDTLeft());
		SmartDashboard.putBoolean("TurnPID Boolean", isPIDTurn);
		
	}

	@Override
	public void teleopInit() {
		
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
	
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putNumber("Forward", oi.driver.getForward());
		SmartDashboard.putNumber("Rotation", oi.driver.getRotation());
//		SmartDashboard.putNumber("Right Motor 1", drivetrain.motors[0].getOutputCurrent());
//		SmartDashboard.putNumber("Right Motor 2", drivetrain.motors[1].getOutputCurrent());
//		SmartDashboard.putNumber("Left Motor 1", drivetrain.motors[2].getOutputCurrent());
//		SmartDashboard.putNumber("Left Motor 2", drivetrain.motors[3].getOutputCurrent());
		
		drivetrain.driveFwdRot(-oi.driver.getForward(), oi.driver.getRotation());
		
//		if (oi.driver.intakeRight()) {
//			intake.setRightPower(0.5);
//		} else  {
//			intake.setRightPower(0);
//		}
//		
//		if (oi.driver.intakeLeft()) {
//			intake.setLeftPower(0.5);
//		} else {
//			intake.setLeftPower(0);
//		}
		
//		if (oi.driver.intakeBoth()) {
//			intake.setLeftPower(0.5);
//			intake.setRightPower(0.5);
//		} else if (oi.driver.intakeBoth() == false) {
//			intake.setLeftPower(0);
//			intake.setRightPower(0);
//		}
		
//		if (oi.driver.shootRight()) {
//			shoot.setRightFlywheel(0.5);
//		} else if (oi.driver.shootRight() == false) {
//			shoot.setRightFlywheel(0);
//		}
//		
//		if (oi.driver.shootLeft()) {
//			shoot.setLeftFlywheel(0.5);
//		} else if (oi.driver.shootLeft() == false) {
//			shoot.setLeftFlywheel(0);
//		}
		
//		if (oi.driver.shootBoth()) {
//			shoot.setLeftFlywheel(0.5);
//			shoot.setRightFlywheel(0.5);
//		} else if (oi.driver.shootBoth() == false) {
//			shoot.setLeftFlywheel(0);
//			shoot.setRightFlywheel(0);
//		}
//		if (oi.operator.gearFlap()) {
//			new SetGearFlap().start();
//		}
//		new SetIntakeGearCommand(oi.operator.gearIntake()).start();
//		
//		if (oi.operator.gearBallIntake()) {
//			gearIntakeState = 1;
//		}
//		else if (oi.operator.gearIntake()) {
//			gearIntakeState = 2;
//		}
//		else {
//			gearIntakeState = 3;
//		}
//		new SetGearIntakeFlywheels(gearIntakeState).start();
//		
//		if (oi.operator.runIntake()) {
//			new RunIntake().start();
//		}
//		if (oi.operator.intakeDeploy()) {
//			new SetIntakePistons(false).start();
//		}
//		if (oi.operator.intakeUp()) {
//			new SetIntakePistons(true).start();
//		}
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
