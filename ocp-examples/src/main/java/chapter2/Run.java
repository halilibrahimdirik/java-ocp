package chapter2;

public interface Run extends Walk {
	public abstract boolean canHuntWhileRunning();

	abstract double getMaxSpeed();
}
