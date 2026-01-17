package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends SubsystemBase {

    private final VictorSP left1 = new VictorSP(0);   
    private final VictorSP left2 = new VictorSP(1);   
    private final VictorSP right1 = new VictorSP(2);  
    private final VictorSP right2 = new VictorSP(3);  

    private final DifferentialDrive drive;

    public Drivetrain() {


        left1.setInverted(false);
        left2.setInverted(false);

        right1.setInverted(true);
        right2.setInverted(true);

        
        drive = new DifferentialDrive(left1, right1);
    }

    public void tankDrive(double left, double right) {

        
        drive.tankDrive(left, right, true);


        left2.set(left);
        right2.set(right);
    }
}
