/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;


public class Intake extends SubsystemBase {
  WPI_TalonSRX leftIntakeMotor;
  WPI_TalonSRX rightIntakeMotor;

  private DoubleSolenoid intakeDelivery;
  private boolean intakeIsDown = false;

  /**
   * Creates a new ExampleSubsystem.
   */

  public Intake() {
    leftIntakeMotor = new WPI_TalonSRX(IntakeConstants.LEFT_INTAKE_MOTOR);
    rightIntakeMotor = new WPI_TalonSRX(IntakeConstants.RIGHT_INTAKE_MOTOR);

    intakeDelivery = new DoubleSolenoid(IntakeConstants.INTAKE_SOLENOID_DEPLOY,
        IntakeConstants.INTAKE_SOLENOID_RETRACT);

    rightIntakeMotor.setInverted(true);

    leftIntakeMotor.configFactoryDefault();
    rightIntakeMotor.configFactoryDefault();

    leftIntakeMotor.follow(rightIntakeMotor);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  public void deliverIntake() {
    if (intakeIsDown) { //if the intake is down
      intakeDelivery.set(DoubleSolenoid.Value.kForward); //use pneumatics to bring the intake up
    } else { //if the intake is up
      intakeDelivery.set(DoubleSolenoid.Value.kReverse); //use pneumatocs to bring the intake down
    }
  }

  public void changeMotorState(){
    if(intakeIsDown){ //if the intake is down 
      rightIntakeMotor.stopMotor(); //stop both motors
      leftIntakeMotor.stopMotor();
    } else{ //if the intake is up
      rightIntakeMotor.set(ControlMode.PercentOutput, IntakeConstants.INTAKE_SPEED_FORWARD); //start both motors going forward
      //leftIntakeMotor.set(ControlMode.PercentOutput, IntakeConstants.INTAKE_SPEED_FORWARD);
    }
  }

  public boolean getIntakeIsDown() { 
    return intakeIsDown;
  }
  
  public void setIntakeIsDown(boolean state){
    intakeIsDown = state;
  }

  public void reverseMotors(){
    rightIntakeMotor.stopMotor(); //stop the motors
    //leftIntakeMotor.stopMotor();
    Timer.delay(2); // wait two seconds to give motors time to slow down

    rightIntakeMotor.set(ControlMode.PercentOutput, IntakeConstants.INTAKE_SPEED_REVERSE); //put motors in reverse
    //leftIntakeMotor.set(ControlMode.PercentOutput, IntakeConstants.INTAKE_SPEED_REVERSE);
    Timer.delay(7); // wait 5 seconds to ensure that the stuck balls are shot out 

    rightIntakeMotor.stopMotor(); // stop the motors
    //leftIntakeMotor.stopMotor();
    Timer.delay(2); // wait to seconds again to give motors time to slow down

    rightIntakeMotor.set(ControlMode.PercentOutput, IntakeConstants.INTAKE_SPEED_FORWARD); //set the motors to go forward again
    //leftIntakeMotor.set(ControlMode.PercentOutput, IntakeConstants.INTAKE_SPEED_FORWARD);
  }



}
