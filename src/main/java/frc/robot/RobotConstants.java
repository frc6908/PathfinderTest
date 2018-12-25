package frc.robot;

public class RobotConstants {
    
    //Drivetrain Constants
    public static final int
        kFrontLeftMotor = 1,
        kBackLeftMotor = 0,
        kFrontRightMotor = 2,
        kBackRightMotor = 3,
        kLeftDriveEncoderA = 0,
        kLeftDriveEncoderB = 1,
        kRightDriveEncoderA = 12,
        kRightDriveEncoderB = 13,
        kEncoderTicksPerRev = 255;

    //Joystick Constants
    public static final int
        kLeftStickPort = 0,
        kRightStickPort = 1;

    //Pathfinder Constants
    public static final double
        kWheelDiameter = 0.5,
        kP = 1.5,
        kI = 0.0,
        kD = 0.0,
        kVMax = 9.86, // ft/s - verify this
        kA = 0.0,
        kdt = 0.02;
}