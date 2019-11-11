package citizens;

import enums.*;

public final class Semen extends Korotyshka {
	public Semen() {
		super("Семён", LifeStyle.KIND);
	}

	@Override
	public void process() {
		System.out.println("И " + getName() + " спит. Ночная мозговая активность у него сегодня слабая, поэтому он не лунатит.");
	}
}