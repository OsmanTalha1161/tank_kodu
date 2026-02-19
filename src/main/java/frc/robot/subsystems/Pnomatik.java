package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pnomatik extends SubsystemBase {

    private final DoubleSolenoid piston =
        new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);

    private final Compressor compressor =
        new Compressor(PneumaticsModuleType.CTREPCM);

    public Pnomatik(){
        compressor.enableDigital();
    }

    public void extend(){
        piston.set(DoubleSolenoid.Value.kForward);
    }

    public void retract(){
        piston.set(DoubleSolenoid.Value.kReverse);
    }
}