package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class TeleopDrive extends CommandBase {
    @SuppressWarnings( { "PMD.UnusedPrivateField", "PMD.SingularField" } )
    private final Drivetrain mDrivetrain;
    private final XboxController mDriverController;

    @Override
    public void initialize () {}

    @Override
    public void execute() {
        // Drive with split arcade drive.
        // That means that the Y axis of the left stick moves forward
        // and backward, and the X of the right stick turns left and right.
        mDrivetrain.mDifferentialDrive.arcadeDrive( -mDriverController.getLeftY(), mDriverController.getRightX() );
    }

    @Override
    public void end ( boolean interrupted ) {}

    @Override
    public boolean isFinished () {
      return false;
    }

    public TeleopDrive ( Drivetrain drivetrain, XboxController driverController ) {
        mDrivetrain = drivetrain;
        mDriverController = driverController;
        addRequirements( mDrivetrain );
    }

}
