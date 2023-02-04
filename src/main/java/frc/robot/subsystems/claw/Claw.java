package frc.robot.subsystems.claw;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Claw extends SubsystemBase{

    private final Spark mLeftClaw;
    private final Spark mRightClaw;

    public Claw() {
        
        mLeftClaw = new Spark(Constants.CAN.kLeftClaw);
        mRightClaw = new Spark(Constants.CAN.kRightClaw);


    }

    public void foward() {
        mLeftClaw.set(-0.7);
        mRightClaw.set(0.7);
    }

    public void reverse() {
        mLeftClaw.set(0.7);
        mRightClaw.set(-0.7);
    }

    public void stop() {
        mLeftClaw.set(0);
        mRightClaw.set(0);
    }
    
}
