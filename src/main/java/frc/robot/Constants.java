
package frc.robot;


public final class Constants {

    /**
    * These are the constants which are used to map the hardware and define the
    * working bahavior of the driver and operator controls.
    * @see {@link frc.robot.RobotContainer#ConfigureButtonBindings}
    */      
    public static final class DRIVER {
        public static final int DRIVER_PORT_NUM = 0;                            // Driver controller port number

    }

    /**
     * These are the constants which are used to map the hardware and define the
     * working bahavior of the the drivetrain subsystem.
     * @see {@link frc.robot.subsystems.Drivetrain}
     * @see {@link https://phoenix-documentation.readthedocs.io/en/latest/ch16_ClosedLoop.html#}
     */
    public final class DRIVETRAIN {
        public static final int RIGHT_LEADER_ID = 1;                            // Motor controller CAN ID AND PDP Port number
        public static final int RIGHT_FOLLOWER_ID = 2;                          // Motor controller CAN ID AND PDP Port number
        public static final int LEFT_LEADER_ID = 11;                            // Motor controller CAN ID AND PDP Port number
        public static final int LEFT_FOLLOWER_ID = 12;                          // Motor controller CAN ID AND PDP Port number
    }

    /**
     * These are the constants which are used to map the hardware and define the
     * working bahavior of the the shooter subsystem.
     * @see {@link frc.robot.subsystems.Shooer}
     */
    public final class SHOOTER {
        public static final int FRONT_MOTOR_ID = 1;                             // Motor controller CAN ID AND PDP Port number
        public static final int REAR_MOTOR_ID = 2;                              // Motor controller CAN ID AND PDP Port number
    }


}
