package frc.utils;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.utils.GameData.Side;

public class AutoModeChooser {
    /**
     * Chooses correct autonomous submode to run based on game data (Robot.gameData) and target balance ("SWITCH"/"SCALE")
     */
    private GameData
        data;
    
    private String
        targetBalance;

    public AutoModeChooser(String s) {
        data = Robot.gameData;
        targetBalance = s;
        targetBalance = targetBalance.toUpperCase(); //Handles any case differences
    }

    public CommandGroup choose() {
        if(targetBalance.equals("SWITCH")) {
            if(data.myStartSide == Side.CENTER) {
                if(data.mySwitch == Side.LEFT) {
                    // Center Start Left Switch
                }
                else if(data.mySwitch == Side.RIGHT) {
                    // Center Start Right Switch
                }
                else {
                    // Null
                }
            }
            else {
                // Baseline, if switch auto is called from left/right start
            }
        }
        else if(targetBalance.equals("SCALE")) {
            if(data.myStartSide == data.myScale) {
                if(data.myScale == Side.LEFT) {
                    // Left Start Left Scale
                }
                else if(data.myScale == Side.RIGHT) {
                    // Right Start Right Scale
                }
                else {
                    // Null
                }
            }
            else {
                if(data.myScale == Side.LEFT) {
                    // Right Start Left Scale
                }
                else if(data.myScale == Side.RIGHT) {
                    // Left Start Right Scale
                }
                else {
                    // Null
                }
            }
        }
        else {
            // Null
        }
    }
}