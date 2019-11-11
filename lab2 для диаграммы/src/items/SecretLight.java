package items;

import interfaces.*;

public class SecretLight extends Item implements Interactable {
	public SecretLight() {
		super("Потайной фонарь");
	}

	@Override
	public String getName() {
		return name;
	}

	public void interact(Interactable object) {
		System.out.println(object.getName() + " включил " + this.getName());
	}
}