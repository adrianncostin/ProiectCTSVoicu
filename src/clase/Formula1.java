package clase;

import intefete.IStrategy;

public class Formula1 implements IStrategy
{
	public void piloteaza(String nume) {
		System.out.println(nume +"piloteaza masina de formula 1");
	}
}
