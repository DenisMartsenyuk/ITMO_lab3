import citizens.*;
import items.*;

public class Main {
	public static void main(String[] args) {

		Scenario.printWarning();

		Pupsen pupsen = new Pupsen();
		SecretLight secretLight= new SecretLight();
		secretLight.interact(pupsen);

		Vupsen vupsen = new Vupsen();
		Wall wall = new Wall();
		wall.interact(vupsen);

		Knife knife = new Knife();
		knife.interact(pupsen);
		knife.interact(vupsen);

		Scenario.firstReplica();

		Ilya ilya = new Ilya();
		ilya.process();

		Denis denis = new Denis();
		denis.process();

		Semen semen = new Semen();
		semen.process();

		Scenario.secondReplica();

		Znajka znajka = new Znajka();
		Notebook notebook = new Notebook();
		notebook.interact(znajka);

		ProfessorZvezdochkin professor = new ProfessorZvezdochkin();
		Moon moon = new Moon();
		moon.interact(professor);

		Scenario.thirdReplica();
	}
}