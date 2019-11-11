package citizens;

import enums.*;

public final class Denis extends Korotyshka {
	public Denis() {
		super("Денис", LifeStyle.KIND);
	}

	@Override
	public void process() {
		System.out.println(getName() + " дрыхнет без задних ног, ведь он опять знатно перебрал сегодняшним вечером.");
	}
}