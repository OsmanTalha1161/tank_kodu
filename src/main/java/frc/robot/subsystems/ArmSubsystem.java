package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Encoder;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class ArmSubsystem extends SubsystemBase {

    private VictorSPX armMotor = new VictorSPX(3);
    private VictorSPX intakeMotor = new VictorSPX(4);
    private final Encoder encoder = new Encoder(1, 2);
    private PIDController pid = new PIDController(0.02, 0, 0);
    private final double MIN_ANGLE = 0;
    private final double MAX_ANGLE = 180;


    public ArmSubsystem() {
        armMotor.setInverted(false);
        encoder.setDistancePerPulse(360.0 / 1024.0); 
        pid.setTolerance(1.0);
    }

    public double getAngle() {
        return encoder.getDistance();
    }

    public void moveTo(double targetAngle) {

        if (targetAngle < MIN_ANGLE) targetAngle = MIN_ANGLE;
        if (targetAngle > MAX_ANGLE) targetAngle = MAX_ANGLE;

        double currentAngle = getAngle();
        double output = pid.calculate(currentAngle, targetAngle);

        armMotor.set(ControlMode.PercentOutput, output);

    }

    public void stop() {
        armMotor.set(ControlMode.PercentOutput, 0);
    } 
    public void intakeIn() {
        intakeMotor.set(ControlMode.PercentOutput, 0.8);
    }
    public void intakeOut() {
        intakeMotor.set(ControlMode.PercentOutput, -0.8);
    }
}    