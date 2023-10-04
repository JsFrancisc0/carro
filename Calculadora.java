public class Calculadora {

	private int n1;
	private int n2;

	/**
	 * 
	 * @param n1
	 */
	public void setN1(int n1) {
		this.n1 = num1;
	}

	/**
	 * 
	 * @param n2
	 */
	public void setN2(int n2) {
		this.n2 = num2;
	}

	public Calculadora() {

		this.n1=0;
		this.n2=0;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	public Calculadora(int num1, int num2) {
		this.n1=num1;
		this.n2=num1;
	}

	public int sumar() {
		return this.n1+this.n2;
	}

	public int multiplicar() {
		return this.n1*this.n2;
	}

}