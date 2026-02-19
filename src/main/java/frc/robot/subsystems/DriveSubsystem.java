package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {

    private final WPI_VictorSPX left1 = new WPI_VictorSPX(48);
    private final WPI_VictorSPX right1 = new WPI_VictorSPX(49);

    private final DifferentialDrive drive;

    public DriveSubsystem() {

        right1.setInverted(true);

        drive = new DifferentialDrive(left1, right1);
    }

    public void arcadeDrive(double xSpeed, double ySpeed) {
        drive.arcadeDrive(xSpeed, ySpeed);
    }
}