/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class DeliverIntakeCommand extends CommandBase {
  private final Intake m_intake;
  /**
   * Creates a new DeliverIntakeCommand.
   */
  public DeliverIntakeCommand(Intake subsystem) {
    m_intake = subsystem;
    addRequirements(m_intake);
    // Use addRequirements() here to declare subsystem dependencies.
  } 

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() { 
    if (m_intake.getIntakeIsDown()) { //if the intake is down/delivered
      m_intake.changeMotorState(); //turn the motors off
      m_intake.deliverIntake(); //bring the intake up
      m_intake.setIntakeIsDown(false); //set the variable to indicate that the intake is up
    } else{ // else if the intake is not down/ it is up
      m_intake.deliverIntake(); // bring the intake down
      m_intake.changeMotorState(); //turn the motors on 
      m_intake.setIntakeIsDown(true); // set the variable to indicate that the intake is down/delivered
    } 
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
