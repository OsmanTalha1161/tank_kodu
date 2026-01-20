package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import java.util.function.Supplier;
import frc.robot.subsystems.DriveSubsystem;

public class DriveCommand extends Command {

    private final DriveSubsystem drive;
    private final Supplier<Double> xSupplier;
    private final Supplier<Double> ySupplier;

    public DriveCommand(DriveSubsystem m_drive,
        Supplier<Double> xSpeed,
        Supplier<Double> ySpeed) {

        this.drive = m_drive;
        this.xSupplier = xSpeed;
        this.ySupplier = ySpeed;

        addRequirements(drive);
    }

    @Override
    public void execute() {
        double left = xSupplier.get();
        double right = ySupplier.get();

        drive.tankDrive(left, right);
    }
}
