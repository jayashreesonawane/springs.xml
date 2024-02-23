package springs.xml;

public class Mobile {

	Sim sim;

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void use() {
		sim.serviceProvide();
	}
}
