package view;
import java.util.Scanner;
import presentator.PresentatorSem;

public class VistaSem {
	private PresentatorSem presentator;
	private Scanner sc= new Scanner(System.in);
	
	public VistaSem() {
		presentator= new PresentatorSem(this);
	}

	public static void main(String[] args) {
		VistaSem vista= new VistaSem();
		vista.datoscliente();
		vista.mostrarmenu();
	}
	
	public void mostrarmenu() {
		int opc=0;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("MENU DEL SEMAFORO");
			System.out.println("");
			System.out.println("Bienvenido oficial " + presentator.getPol().getNombre()+ " , Bienvenido al Sistema de Trafico colombiano(SFC)");
			System.out.println("Como desea manejar el sistema de trafico?"
					+ "(1)Manualmente\n"
					+ "(2)Encender el modo automatico\n"
					);
			System.out.println("");
			int modo= sc.nextInt();
			
		}while(opc!=3);
	}
	
	public void datoscliente() {
		System.out.println("Digite su nombre: ");
		String nombre= sc.next();
		
		System.out.println("Digite su rango:" 
							+ "(1)Cadete\n"
							+ "(2)Subteniente\n"
							+ "(3)Teniente\n"
							+ "(4)Capitan\n"
				);
		int rango= sc.nextInt();
		
		if(rango<= 2) {
			System.out.println("No tienes el permiso para ingresar a este sistema, por favor retirese o comuniquese con un superior.");
		}
		
		System.out.println("Digite su turno: ");
		String turno= sc.next();
		
		System.out.println("Digite su número de placa: ");
		double numeroPlaca= sc.nextDouble();
		presentator.llenarcliente(nombre, rango, turno, numeroPlaca);
	}
}
