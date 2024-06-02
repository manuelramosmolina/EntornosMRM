public class CostePersonal {
 
	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeFinal = 0;
		Trabajador trabajador;
		float precioHoraExtra = 20;
		for (int i = 0; i < trabajadores.length; i++) {
			trabajador = trabajadores[i];
			if (puestoTrabajador (trabajador)) {
					costeFinal += trabajador.getNomina();
			}
			else
			{
				costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * precioHoraExtra);
			}
		}
		return costeFinal;
	}
	static boolean puestoTrabajador (Trabajador trabajador) {

		if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR)
			return true;
		else
			return false;
	}
}
