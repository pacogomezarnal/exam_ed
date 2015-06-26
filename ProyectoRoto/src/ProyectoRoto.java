
public class ProyectoRoto {

	public static void main(String[] args) {
		String colores[]={"ROJO","AMARILLO","VERDE","AZUL","NEGRO","BLANCO","NARANJA"};

		//Mostramos por pantalla todos los colores
		System.out.println("----------------- COLORES ORDEN ASCENDENTE ---------------------");
		for(int i=1;i<=colores.length;i++){
			System.out.println("El color es "+colores[i]);
		}
		
		//Mostramos por pantalla los colores de forma inversa
		System.out.println("----------------- COLORES ORDEN INVERSO ---------------------");
		int j=colores.length-1;
		while(j<0){
			j--;
			System.out.println("El color es "+colores[j]);
		}
	}

}
