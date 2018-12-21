/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.auto.GameData.Side;

public class SwitchAuto extends CommandGroup {
    /**
    * Home for all Switch Autonomous routines.
    * Selects correct side switch autonomous based on game specific data.
    */
    public SwitchAuto() {
        if(Robot.gameData.mySwitch == Side.LEFT) {
            addSequential(new CenterStartLeftSwitch());
        }
        //Check mySwitch == Side.RIGHT
    }
}
