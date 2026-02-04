package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CANFuelSubsystem;
import frc.robot.subsystems.ClimberSubsystem;

import static frc.robot.Constants.ClimbConstatns.*;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class ClimbDown extends Command {
  /** Creates a new Climber. */

  ClimberSubsystem climberSubsystem;

  public ClimbDown(ClimberSubsystem climberSubsystem) {
    addRequirements(climberSubsystem);
    this.climberSubsystem = climberSubsystem;
  }

  // Called when the command is initially scheduled. Set the climber to the
  // appropriate values for unclimbing
  @Override
  public void initialize() {
    climberSubsystem
        .setClimber(CLIMBER_MOTOR_DOWN_PERCENT);
  }

  // Called every time the scheduler runs while the command is scheduled. This
  // command doesn't require updating any values while running
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted. Stop the climber
  @Override
  public void end(boolean interrupted) {
    climberSubsystem.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
