package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.PinSubsystem;


public class RobotContainer {

  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final PinSubsystem pinSubsystem = new PinSubsystem();

  public static final CommandXboxController primary = new CommandXboxController(0);

  public RobotContainer() {
    configureBindings();

    driveSubsystem.setDefaultCommand(
      new RunCommand(() -> {
        double left = -primary.getRawAxis(1);
        double right = -primary.getRawAxis(5);
        driveSubsystem.arcadeDrive(left, right);
      }, driveSubsystem)
    );
  }

  private void configureBindings() {
    primary.x().whileTrue(new RunCommand(() -> pinSubsystem.setButtonPins(true), pinSubsystem));
    
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
