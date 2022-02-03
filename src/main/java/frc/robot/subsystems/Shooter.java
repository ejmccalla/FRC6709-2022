package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants.SHOOTER;

public class Shooter extends SubsystemBase {

    private final WPI_TalonFX mFrontMotor = new WPI_TalonFX( SHOOTER.FRONT_MOTOR_ID );
    private final WPI_TalonFX mRearMotor = new WPI_TalonFX( SHOOTER.REAR_MOTOR_ID );


    //-----------------------------------------------------------------------------------------------------------------
    /*                                                PUBLIC METHODS                                                 */
    //-----------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------
    /*                                                PRIVATE METHODS                                                */
    //-----------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------
    /*                                        CLASS CONSTRUCTOR AND OVERRIDES                                        */
    //-----------------------------------------------------------------------------------------------------------------

    public Shooter() {
        // Return the motor controllers to their factory defaults
        mFrontMotor.configFactoryDefault();
        mRearMotor.configFactoryDefault();
    
        // TODO: verify the motor inversion
        mFrontMotor.setInverted( false );
        mRearMotor.setInverted( false );

        // TODO: verify the sensor phase, internal TalonFX's are always correct
        // mFrontMotor.setSensorPhase( true );
        // mRearMotor.setSensorPhase( true );


    }

    @Override
    public void periodic() {}

}
