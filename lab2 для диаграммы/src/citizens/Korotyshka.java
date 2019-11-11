package citizens;

import interfaces.*;
import enums.*;

public abstract class Korotyshka implements Interactable, NonInteractable {
	private String name;
	private LifeStyle style;

	Korotyshka(String name, LifeStyle style) {
		this.name = name;
		this.style = style;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setStyle(LifeStyle style) {
		this.style = style;
	}

	public LifeStyle getStyle() {
		return style;
	}

	public abstract void process();

	@Override
	public String toString() {
		return this.getClass().getName() + "[name=" + name + ", style=" + style +"]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || obj.getClass() != this.getClass()) {
            return false;
		}

		Korotyshka person = (Korotyshka) obj;
		return (name == person.getName() || (name != null && name.equals(person.getName())))
		     &&(style == person.getStyle() || (style != null && style.equals(person.getStyle())));
    }

    @Override
    public int hashCode() {
    	final int PRIME = 17;
    	int hash = 37;
    	hash = hash * PRIME + ((name == null) ? 0 : name.hashCode());
    	hash = hash * PRIME + ((style == null) ? 0 : style.hashCode());
    	return hash;
    }
}