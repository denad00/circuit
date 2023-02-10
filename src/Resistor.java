
class Resistor extends Circuit {
	private double resistance;

	public Resistor(double r) {
		
		this.resistance = r;
	}
	

	/**
	 * Overrides resistance
	 * @return the new resistance
	 */
	public double getResistance() {
		return resistance;
	}


}
