package items;

import interfaces.*;

public class Wall extends Item implements NonInteractable {
	public Wall() {
		super("Стена");
	}

	@Override
	public String getName() {
		return name;
	}

	public void interact(Interactable object) {
		System.out.println(object.getName() + " видит: " + this.getName());
		System.out.println("Оба злоумышленника подошли к ней и присели.");
	}
}