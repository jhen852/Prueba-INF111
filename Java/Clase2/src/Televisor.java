
public class Televisor {
		private String marca, tama�o, tipo;
		private int precio;
		
		public void Leer() {
			System.out.println("Ingrese la Marca : ");
			marca = Leer.dato();
			System.out.println("Ingrese el Tama�o : ");
			tama�o = Leer.dato();
			System.out.println("Ingrese el tipo : ");
			tipo = Leer.dato();
			System.out.println("Ingrese el Precio :");
			precio = Leer.datoInt();
		}
		public void mostrar () {
			System.out.println("\nMarca : "+marca+
					"\nTama�o : "+tama�o+
					"\nTipo : "+tipo+
					"\nPrecio : "+precio);
		}
}
