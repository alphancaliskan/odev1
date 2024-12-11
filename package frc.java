package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class Robot extends TimedRobot {
    private final PWMVictorSPX motor = new PWMVictorSPX(0); 
    private final Joystick joystick = new Joystick(0); 

    @Override
    public void teleopPeriodic() {
        if (joystick.getRawButton(1)) {
            motor.set(1.0); 
        } else if (joystick.getRawButton(2)) {
            motor.set(-1.0); 
        } else {
            motor.set(0); 
    }
}