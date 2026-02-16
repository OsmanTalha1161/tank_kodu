package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

  private final XboxController driver = new XboxController(0);
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();

  public RobotContainer() {
    configureBindings();
    driveSubsystem.setDefaultCommand(
      new RunCommand(() -> {
        double left = -driver.getRawAxis(1);
        double right = -driver.getRawAxis(5);
        driveSubsystem.arcadeDrive(left, right);
      }, driveSubsystem)
    );
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return null;
  }
}
