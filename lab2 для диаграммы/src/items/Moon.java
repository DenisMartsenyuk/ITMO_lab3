package items;

import interfaces.*;

public class Moon extends Item implements NonInteractable {
	public Moon() {
		super("Луна");
	}

	@Override
	public String getName() {
		return name;
	}

	public void interact(Interactable object) {
		System.out.println("А " + object.getName() + " рассматривает на небо, на котором ярко была видна " + this.getName());
	}
}