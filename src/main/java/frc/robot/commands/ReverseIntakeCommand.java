/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Intake;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class ReverseIntakeCommand extends InstantCommand {
  private final Intake m_intake;
  public ReverseIntakeCommand(Intake subsystem) {
    m_intake = subsystem;
    addRequirements(m_intake);
    
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  
  /*this command is used to reverse the motors of the intake in case a ball gets stuck. When this button is pressed, 
  the metheod reverseMotors() is called and then the command immediately ends. */
  @Override
  public void initialize() {
    m_intake.reverseMotors(); 
  }
}
