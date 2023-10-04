public class CarroCompra {

	private int[][] productos = new int[][];

	public CarroCompra() {

		for (int i=0; i<5; i++){
			productos[0][i]=1;
			productos[1][i]=1000;

		}
	}

	private int calcularTotal() {

		for (int i=0; i<5; i++) {
			total += subTotal(productos[0][1], productos[1][i]);

		}
		return total;
	}

	/**
	 * 
	 * @param cant
	 * @param precio
	 */
	private int subTotal(int cant, int precio) {

		Calculadora calc = new Calculadora(cant, precio);
		return calc.Multiplicar();

	}

	public void mostrarTotal() {
		System.out.println("El total de la comopra es: "+this.calcularTotal());
	}

}