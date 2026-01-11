package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Drivetrain;

public class RobotContainer {

  // Joystick
  private final Joystick driver = new Joystick(0);

  // Drivetrain subsystem
  private final Drivetrain drivetrain = new Drivetrain();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

    //tuş bağlamaları
    JoystickButton button1 = new JoystickButton(driver, 1);
    JoystickButton button2 = new JoystickButton(driver, 2);
    JoystickButton button3 = new JoystickButton(driver, 3);
    JoystickButton button4 = new JoystickButton(driver, 4);

  }

  public Command getAutonomousCommand() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAutonomousCommand'");
  }
}