/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ControlPanelConstants;


public class ControlPanel extends SubsystemBase {
  WPI_TalonSRX controlPanelMotor;
  /**
   * Creates a new ExampleSubsystem.
   */
   public ControlPanel(){
     controlPanelMotor = new WPI_TalonSRX(ControlPanelConstants.CONTROL_PANEL_MOTOR);
   }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

}
