package org.usfirst.frc.team649.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int OPERATOR_JOYSTICK = 0;
	public static final int DRIVE_LEFT_JOYSTICK = 1;
	public static final int DRIVE_RIGHT_JOYSTICK = 2;
	
	/*****PRACTICE BOT*****/
	
	/*public static class Drivetrain {
		// FR,BR,BL,BR
		public static final int[] MOTOR_PORTS = { 0, 1, 2, 3 };
		public static final int[] DRIVE_SOLENOID_PORTS = {0,4,5};
		public static final int LEFT_ENCODER_FORWARD_CHANNEL = 6;
		public static final int LEFT_ENCODER_REVERSE_CHANNEL = 7;
		public static final int RIGHT_ENCODER_FORWARD_CHANNEL = 8;
		public static final int RIGHT_ENCODER_REVERSE_CHANNEL = 9;
	}

	public static class Intake {
		public static final int[] MOTOR_PORTS = {0,9,1};
		public static final int[] RIGHT_SOLENOID_PORTS = {0,0,1};//{0,1,1,1};
		//not used on pbot
		public static final int[] LEFT_SOLENOID_PORTS = {1,6,7};//{0,2,1,2};
	}

	public static class ShooterPivot {
		// adjust all with actual values
		//TODO break down by side
		public static final int[] MOTOR_PORTS = { 3, 6 };
		
		public static final int[] RIGHT_ENCODER = { 4, 5 };
		public static final int[] LEFT_ENCODER = { 2, 3 };
		public static final int HALL_EFFECT_LOW_SENSOR = 14;
		public static final int RESET_BUMPER_LEFT = 12;
		public static final int RESET_BUMPER_RIGHT = 13;
		public static final int [] LEFT_SOLENOID_PORTS = {0,6,7};
		//not used on pbot
		public static final int [] RIGHT_SOLENOID_PORTS = {1,2,3};
		public static final int LEFT_PDP_PORT = 14;
		public static final int RIGHT_PDP_PORT = 0;
	}
	public static class ShooterSubsystem
	{
		public static final int[] MOTOR_PORTS = {7,2};
		public static final int LEFT_EINSTEIN = 10;
		public static final int RIGHT_EINSTEIN = 11;
		public static final int[] PUNCH_SOLENOID_PORTS = {0,2,3};
		public static final int IR_GATE_PORT = 1;
	
	} */
	
	/****FINAL BOT****/

	public static class Drivetrain {
		// FR,BR,BL,BR
		public static final int[] MOTOR_PORTS = {9,8,7,6};//{ 15, 16, 17, 18 }; //{ 9, 8, 7, 6 }; //practice bot
		public static final int[] DRIVE_SOLENOID_PORTS = {0,0,7};
		public static final int LEFT_ENCODER_FORWARD_CHANNEL = 6;
		public static final int LEFT_ENCODER_REVERSE_CHANNEL = 7;
		public static final int RIGHT_ENCODER_FORWARD_CHANNEL = 8;
		public static final int RIGHT_ENCODER_REVERSE_CHANNEL = 9;
		
		public static final int CAM_SERVO = 18;
		public static final int[] SOLENOID_PORTS = {1,3,4};
		
		public static final int[] LED_PORTS = {24,25};  //left, right
		public static final int AUTO_DEFENSE_SELECTOR = 2;
		public static final int AUTO_POSITION_SELECTOR = 3;
		
	}

	
	public static class ShooterPivot {
		// adjust all with actual values
		//TODO break down by side
		public static final int[] MOTOR_PORTS = { 3, 6 }; //TODO flip them bc should be 6,3 but i too lazy
		
		public static final int[] RIGHT_ENCODER = { 2, 3 };
		public static final int[] LEFT_ENCODER = { 4, 5 };
		
		public static final int RESET_BUMPER_LEFT = 10;
		public static final int RESET_BUMPER_RIGHT = 11;
		
		public static final int RESET_HAL_EFFECT_RIGHT = 23;
		public static final int RESET_HAL_EFFECT_LEFT = 21;
		
		public static final int [] LEFT_SOLENOID_PORTS = {1,5,2};
		//not used on pbot
		public static final int [] RIGHT_SOLENOID_PORTS = {1,5,2};
		public static final int LEFT_PDP_PORT = 15;
		public static final int RIGHT_PDP_PORT = 0;
		
		public static final int POT_POSITION_PORT = 2;
		public static final int POT_DEFENSE_PORT = 3;
	}
	public static class Shooter
	{
//		public static final int[] MOTOR_PORTS = {7,2};
//		public static final int LEFT_EINSTEIN = 17;
//		public static final int RIGHT_EINSTEIN = 16;
//		public static final int[] PUNCH_SOLENOID_PORTS = {1,1,6};
//		public static final int IR_GATE_PORT = 1;
		public static final int LEFT_SHOOTER_FLYWHEEL_PORT = 9;
		public static final int RIGHT_SHOOTER_FLYWHEEL_PORT = 8;
	}
	public static class Gear {
		public static final int GEAR_ROLLER_PORT = 11;
		public static final int GEAR_FUNNEL_SERVO_PORT = 1;
		public static final int GEAR_IR_PORT = 11;
		public static final int GEAR_SOL_PORT = 10;
	}
	public static class Intake{
//		public static final int INTAKE_MOTOR_PORT = 5;
//		public static final int HOOPER_FEEDER_PORT = 6;
//		public static final int LEFT_INTAKE_SOL = 4;//Last number made up need to add on port map
//		public static final int RIGHT_INTAKE_SOL = 5;//Last number made up need to add on port map
		public static final int RIGHT_INTAKE_PORT = 6;
		public static final int LEFT_INTAKE_PORT = 7;

	}


}
