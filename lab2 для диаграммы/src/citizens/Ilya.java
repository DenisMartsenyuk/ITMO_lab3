package citizens;

import enums.*;

public final class Ilya extends Korotyshka {
	public Ilya() {
		super("Илья", LifeStyle.KIND);
	}

	@Override
	public void process() {
		System.out.println("Коротышка " + getName() + " сладко спит в кроватке. Видимо на пары он завтра не пойдет.");
	}
}