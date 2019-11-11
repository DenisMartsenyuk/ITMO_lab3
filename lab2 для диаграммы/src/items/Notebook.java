package items;

import interfaces.*;

public class Notebook extends Item implements Interactable {
	public Notebook() {
		super("Тетрадь");
	}

	@Override
	public String getName() {
		return name;
	}

	public void interact(Interactable object) {
		System.out.println(object.getName() + " писал что-то в свою " + this.getName());
	}
}