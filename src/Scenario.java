import java.util.ArrayList;

public class Scenario {
	private ArrayList<String> replicas = new ArrayList<String>();

	public void add(String replica) {
		replicas.add(replica);
	}

	public void get(int index) {
		System.out.println(replicas.get(index));
	}
}