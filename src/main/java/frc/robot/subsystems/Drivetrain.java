package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.InvertType;
import frc.robot.Constants.DRIVETRAIN;



public class Drivetrain extends SubsystemBase {
    
    private final WPI_TalonFX mRightLeader = new WPI_TalonFX( DRIVETRAIN.RIGHT_LEADER_ID );
    private final WPI_TalonFX mRightFollower = new WPI_TalonFX( DRIVETRAIN.RIGHT_FOLLOWER_ID );
    private final WPI_TalonFX mLeftLeader = new WPI_TalonFX( DRIVETRAIN.LEFT_LEADER_ID );
    private final WPI_TalonFX mLeftFollower = new WPI_TalonFX( DRIVETRAIN.LEFT_FOLLOWER_ID );
    public final DifferentialDrive mDifferentialDrive = new DifferentialDrive( mLeftLeader, mRightLeader );

    //-----------------------------------------------------------------------------------------------------------------
    /*                                                PUBLIC METHODS                                                 */
    //-----------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------
    /*                                                PRIVATE METHODS                                                */
    //-----------------------------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------------------------
    /*                                        CLASS CONSTRUCTOR AND OVERRIDES                                        */
    //-----------------------------------------------------------------------------------------------------------------

    public Drivetrain() {
        
        // Return the motor controllers to their factory defaults
        mRightLeader.configFactoryDefault();
        mRightFollower.configFactoryDefault();
        mLeftLeader.configFactoryDefault();
        mLeftFollower.configFactoryDefault();
    
        // Setup the followers
        mRightFollower.follow( mRightLeader );
        mLeftFollower.follow( mLeftLeader );

        // TODO: verify the motor inversion
        mRightLeader.setInverted( false );
        mLeftLeader.setInverted( false );
        mRightFollower.setInverted( InvertType.FollowMaster );
        mLeftFollower.setInverted( InvertType.FollowMaster );

        // TODO: verify the sensor phase, internal TalonFX's are always correct
        // mRightLeader.setSensorPhase( true );
        // mLeftLeader.setSensorPhase( true );

    }

    @Override
    public void periodic() {}

}
