package presentator;
import model.policia;
import model.semaforo;
import view.VistaSem;

public class PresentatorSem {
	private policia pol;
	private semaforo sem;
	private VistaSem vistasem;
	
	public PresentatorSem(VistaSem v) {
	sem= new semaforo();
	vistasem= v;
	}

	public semaforo getSem() {
		return sem;
	}

	public void setSem(semaforo sem) {
		this.sem = sem;
	}

	public VistaSem getVistasem() {
		return vistasem;
	}

	public void setVistasem(VistaSem vistasem) {
		this.vistasem = vistasem;
	}
	
	public void opciones() {
		
	}

	public policia getPol() {
		return pol;
	}

	public void setPol(policia pol) {
		this.pol = pol;
	}
	
	public void llenarcliente(String nombre,int rango, String turno, double numeroPlaca ) {
		pol.setNombre(nombre);
		pol.setRango(rango);
		pol.setTurno(turno);
		pol.setNumeroPlaca(numeroPlaca);
	}
}
