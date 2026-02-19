package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PinSubsystem extends SubsystemBase{

    private final DigitalOutput pin1 = new DigitalOutput(1);
    private final DigitalOutput pin2 = new DigitalOutput(2);
    private final DigitalOutput pin3 = new DigitalOutput(3);
    private final DigitalOutput pin4 = new DigitalOutput(4);

    public PinSubsystem() {
        pin2.set(true);
        pin4.set(true);
    }

    public void setButtonPins(boolean state) {
        pin1.set(state);
        pin3.set(state);
    }

    @Override
    public void periodic(){
        SmartDashboard.getBoolean("state1", pin1.get());
        SmartDashboard.getBoolean("state2", pin2.get());
    }
}