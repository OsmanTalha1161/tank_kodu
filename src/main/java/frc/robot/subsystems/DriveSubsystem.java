package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{
    private final VictorSPX left1 = new VictorSPX(49);
    private final VictorSPX right1 = new VictorSPX(48);


    private final DifferentialDrive drive;

    public DriveSubsystem() {   

        right1.setInverted(true);

        drive = new DifferentialDrive(left1::set, right1::set);

    
    }

    public void arcadeDrive(double xSpeed, double ySpeed){
        drive.arcadeDrive(xSpeed, ySpeed);
    }

    

}
