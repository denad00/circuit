import java.util.ArrayList;


class Parallel extends Circuit {
	
	ArrayList<Circuit> parallel;
	
	public Parallel() {
		parallel = new ArrayList<Circuit>();
	}

	public void add(Circuit r) {
		parallel.add(r);
	}
	
	/**
	 * Overrides resistance
	 * @return the final resistance
	 */
	public double getResistance() {
		double r = 0;
		for(Circuit x:parallel) 
		r += 1/x.getResistance();
		return 1/r;
	}
	

}
