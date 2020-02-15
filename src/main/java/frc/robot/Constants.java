/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
	public static final class ControlPanelConstants{
		public static final int CONTROL_PANEL_MOTOR = 4;
	}
	public static final class DriveConstants{
		public static final int LEFT_FRONT_MOTOR = 0;
		public static final int LEFT_BACK_MOTOR = 1;
		public static final int RIGHT_FRONT_MOTOR = 2;
		public static final int RIGHT_BACK_MOTOR = 3;

		public static final int GEAR_SHIFT_DEPLOY = 0;
		public static final int GEAR_SHIFT_RETRACT = 1;

		public static final double TURN_P = 0;
		public static final double TURN_I = 0;
		public static final double TURN_D = 0;

		public static final double TURN_RATE_TOLERANCE = 5; // degrees
		public static final double TURN_TO_TOLERANCE = 10; // degrees per sec

		public static final boolean GYRO_REVERSED = false;

		public static final double MAX_TURN_RATE = 100; //degrees per sec
		public static final double MAX_TURN_ACCELERATION = 300;//degrees per sec squared
	
	}
	
	public static final class IntakeConstants{
		public static final int INTAKE_SOLENOID_DEPLOY = 2;
		public static final int INTAKE_SOLENOID_RETRACT = 3;
		public static final int LEFT_INTAKE_MOTOR = 5;
		public static final int RIGHT_INTAKE_MOTOR = 6;
		public static final double INTAKE_SPEED_FORWARD = .1;
		public static final double INTAKE_SPEED_REVERSE = -.1;
	}

	public static final class LauncherConstants{
		public static final int LAUNCHER_MOTOR_1 = 7;
		public static final int LAUNCHER_MOTOR_2 = 8;
	}

	public static final class LiftConstants{

	}

	public static final class NavigationConstants{

	}

	public static final class SerializerConstants{
		public static final int SERIALIZER_SENSOR_1 = 0;
		public static final int SERIALIZER_SENSOR_2 = 0;
		public static final int SERIALIZER_SENSOR_3 = 0;
		public static final int SERIALIZER_MOTOR = 0;
		public static final double SERIALIZER_SPEED = 0;
	}

	public static final class VisionConstants{

	}

	public static final class OIConstants{

	}





}
