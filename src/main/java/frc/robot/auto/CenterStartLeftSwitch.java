/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import java.io.File;

import edu.wpi.first.wpilibj.command.CommandGroup;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;

public class CenterStartLeftSwitch extends CommandGroup {
    /**
     * Robot starts from center.
     * Drive to left switch.
     * Drop cube in left switch.
     */
    public CenterStartLeftSwitch() {
        Trajectory l = Pathfinder.readFromCSV(new File("/CenterStartLeftSwitch/CenterStartLeftSwitch_left.csv"));
        Trajectory r = Pathfinder.readFromCSV(new File("/CenterStartLeftSwitch/CenterStartLeftSwitch_right.csv"));

        addSequential(new AutoDrive(l, r)); //Drive to Switch
        //Raise elevator (while driving) & drop cube (after driving/raising elevator)
            //Raise elevator (parallel)
            //Drop cube (sequential)
    }
}
