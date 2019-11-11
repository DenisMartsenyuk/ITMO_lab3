package citizens;

import enums.*;

public final class Vupsen extends Korotyshka {
	public Vupsen() {
		super("Злоумышленник  Вупсень", LifeStyle.EVIL);
	}

	@Override
	public void process() {
		System.out.println("Создает водородную бомбу с функцией жопа");
	}
}