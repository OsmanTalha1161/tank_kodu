package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {

  private final Joystick driver = new Joystick(0);
  private final DriveSubsystem driveSubsystem = new DriveSubsystem();

  public RobotContainer() {
    configureBindings();
    driveSubsystem.setDefaultCommand(
      new RunCommand(() -> {
        double left = -driver.getRawAxis(1);
        double right = -driver.getRawAxis(5);
        driveSubsystem.tankDrive(left, right);
      }, driveSubsystem)
    );
  }

  

  private void configureBindings() {
    JoystickButton button1 = new JoystickButton(driver, 1);
    JoystickButton button2 = new JoystickButton(driver, 2);
    JoystickButton button3 = new JoystickButton(driver, 3);
    JoystickButton button4 = new JoystickButton(driver, 4);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
