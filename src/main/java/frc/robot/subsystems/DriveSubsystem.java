package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase{
    private final VictorSP left1 = new VictorSP(0);
    private final VictorSP left2 = new VictorSP(0);
    private final VictorSP right1 = new VictorSP(0);
    private final VictorSP right2 = new VictorSP(0);

    private final DifferentialDrive drive;



    public DriveSubsystem() {
        left1.addFollower(left2);
        right1.addFollower(right2);

        right1.setInverted(false);

        drive = new DifferentialDrive(left1::set, right1::set);  
    }

    public void arcadeDrive(double xSpeed, double ySpeed){
        drive.arcadeDrive(xSpeed, ySpeed);
    }

    public void driveCommmand(double left, double right) {
    
        throw new UnsupportedOperationException("Unimplemented method 'driveCommmand'");
    }

    public void tankDrive(double left, double right) {
     
        throw new UnsupportedOperationException("Unimplemented method 'tankDrive'");
    }

}