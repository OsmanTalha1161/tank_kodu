package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.PinSubsystem;
import frc.robot.subsystems.Pnomatik;


public class RobotContainer {

  private final DriveSubsystem driveSubsystem = new DriveSubsystem();
  private final PinSubsystem pinSubsystem = new PinSubsystem();
  private final Pnomatik pnomatik = new Pnomatik();

  public static final CommandXboxController primary = new CommandXboxController(0);

  public RobotContainer() {
    configureBindings();

    driveSubsystem.setDefaultCommand(
      new RunCommand(() -> {
        double left = -primary.getRawAxis(5);
        double right = -primary.getRawAxis(1);
        driveSubsystem.arcadeDrive(left, right);
      }, driveSubsystem)
    );
  }

  private void configureBindings() {

    primary.y().onTrue(new RunCommand(() -> pnomatik.extend(), pnomatik));
    primary.b().onTrue(new RunCommand(() -> pnomatik.retract(), pnomatik));

    
    primary.x().whileTrue(new RunCommand(() -> pinSubsystem.setButtonPins(true), pinSubsystem));
    primary.a().whileTrue(new RunCommand(() -> pinSubsystem.setButtonPins(true), pinSubsystem));
    
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
