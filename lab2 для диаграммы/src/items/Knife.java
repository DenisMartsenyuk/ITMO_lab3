package items;

import interfaces.*;

public class Knife extends Item implements Interactable {
	public Knife() {
		super("Нож");
	}

	@Override
	public String getName() {
		return name;
	}

	public void interact(Interactable object) {
		System.out.println(object.getName() + " взял " + this.getName() + " и начал рыть им землю");
	}
}