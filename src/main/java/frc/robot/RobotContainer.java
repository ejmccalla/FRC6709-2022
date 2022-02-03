
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.TeleopDrive;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Shooter;
import frc.robot.Constants.DRIVER;;

public class RobotContainer {

    // Hardware
    private final XboxController mDriverController = new XboxController( DRIVER.DRIVER_PORT_NUM );

    // Subsystems
    private final Drivetrain mDrivetrain = new Drivetrain();
    private final Shooter mShooter = new Shooter();


    //-----------------------------------------------------------------------------------------------------------------
    /*                                                PUBLIC METHODS                                                 */
    //-----------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------
    /*                                                PRIVATE METHODS                                                */
    //-----------------------------------------------------------------------------------------------------------------

    private void configureButtonBindings() {}



    //-----------------------------------------------------------------------------------------------------------------
    /*                                        CLASS CONSTRUCTOR AND OVERRIDES                                        */
    //-----------------------------------------------------------------------------------------------------------------

    public RobotContainer() {
        configureButtonBindings();
        mDrivetrain.setDefaultCommand( new TeleopDrive( mDrivetrain, mDriverController ) );
    }

}
