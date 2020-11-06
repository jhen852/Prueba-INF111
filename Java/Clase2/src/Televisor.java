
public class Televisor {
		private String marca, tamaño, tipo;
		private int precio;
		
		public void Leer() {
			System.out.println("Ingrese la Marca : ");
			marca = Leer.dato();
			System.out.println("Ingrese el Tamaño : ");
			tamaño = Leer.dato();
			System.out.println("Ingrese el tipo : ");
			tipo = Leer.dato();
			System.out.println("Ingrese el Precio :");
			precio = Leer.datoInt();
		}
		public void mostrar () {
			System.out.println("\nMarca : "+marca+
					"\nTamaño : "+tamaño+
					"\nTipo : "+tipo+
					"\nPrecio : "+precio);
		}
}
