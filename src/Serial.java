import java.util.ArrayList;

class Serial extends Circuit{
	
	ArrayList<Circuit> circuit;
	
	public Serial() {
		 circuit = new ArrayList<Circuit>();
	}
	
	public void add(Circuit r) {
		circuit.add(r);
	}

	/**
	 * Overrides resistance
	 * @return the new resistance
	 */
	public double getResistance() {
		double r=0;
		for(Circuit x:circuit)
		r += x.getResistance();
		return r;
	}

}
