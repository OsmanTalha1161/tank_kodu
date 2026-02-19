package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
;

public class Pnomatik 

{


private final DoubleSolenoid pnomatik = new DoubleSolenoid(null, 0, 0);
    
public void extend(){
    pnomatik.set(DoubleSolenoid.Value.kForward);
}

public void retract(){
    pnomatik.set(DoubleSolenoid.Value.kReverse);
}
}


