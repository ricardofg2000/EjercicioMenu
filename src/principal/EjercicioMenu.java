package principal;

public class EjercicioMenu {

	public static void main(String[] args) {

		int opc;
		int opcSub;
		boolean salir = false;
		String auxText;

		do {
			Util.subrayar("LISTADO DE EJERCICIOS PROGRAMACIÓN", "=");
			Util.escribir("");
			mostrarMenu();
			opc = Util.leerInt("Introduzca una opción: ");
			switch (opc) {
			case 1:
				mostrarMenuCond();
				menuCond();
			case 2:
				mostrarMenuIter();
				menuIter();
				break;
			case 3:
				mostrarMenuMod();
				menuMod();
				break;
			case 0:
				salir = ConfirmarSalir();

				break;
			}
		} while (!salir);
		salir();
	}

	private static void mostrarMenu() {
		final String OPC1 = "1.- Condicionales";
		final String OPC2 = "2.- Iterativos";
		final String OPC3 = "3.- Modular";
		final String OPCS = "0.- Salir ";

		Util.escribir(OPC1);
		Util.escribir(OPC2);
		Util.escribir(OPC3);
		Util.escribir("");
		Util.escribir(OPCS);

	}

	private static void mostrarMenuCond() {
		final String MENU = "CONDICIONALES";
		final String OPC1 = "1.- Si";
		final String OPC2 = "2.- Según";
		final String OPCS = "0.- Volver ";

		Util.subrayar("\n\n\n\n\n\n\n\n"+MENU, "=");
		Util.escribir("");
		Util.escribir(OPC1);
		Util.escribir(OPC2);
		Util.escribir("");
		Util.escribir(OPCS);
	}

	private static void menuCond() {
		int opc;
		opc = Util.leerInt("Introduzca una opción: ");
		switch (opc) {
		case 1:
			mostrarListaSi();
			break;
		case 2:
			mostrarListaSegun();
			break;
		case 0:
			;
			break;
		}
	}

	private static void mostrarListaSi() {

	}

	private static void mostrarListaSegun() {

	}

	private static void mostrarMenuIter() {
		final String MENU = "ITERACIONALES";
		final String OPC1 = "1.- Finitas (para) ";
		final String OPC2 = "2.- No finitas";
		final String OPCS = "0.- Volver ";

		Util.subrayar("\n\n\n\n\n\n\n\n"+MENU, "=");
		Util.escribir("\n" + OPC1);
		Util.escribir(OPC2);
		Util.escribir("\n" + OPCS);
	}

	private static void menuIter() {
		int opc;
		opc = Util.leerInt("Introduzca una opción: ");
		switch (opc) {
		case 1:
			mostraListaFinitas();
			break;
		case 2:
			mostrarMenuNoFinitas();
			menuNoFinitas();
			break;
		case 0:
			;
			break;
		}

	}
	private static void mostraListaFinitas() {

	}
	private static void mostrarMenuNoFinitas() {
		final String MENU = "NO FINITAS";
		final String OPC1 = "1.- Mientras ";
		final String OPC2 = "2.- Repetir";
		final String OPCS = "0.- Volver ";

		Util.subrayar("\n\n\n\n\n\n\n\n"+MENU, "=");
		Util.escribir("\n" + OPC1);
		Util.escribir(OPC2);
		Util.escribir("\n" + OPCS);
	}
	private static void menuNoFinitas() {
		int opc;
		opc = Util.leerInt("Introduzca una opción: ");
		switch (opc) {
		case 1:
			mostraListaMientras();
			break;
		case 2:
			mostrarListaRepetir();
			break;
		case 0:
			;
			break;
		}
	}
	
	private static void mostraListaMientras() {
		
	}
	private static void mostrarListaRepetir() {
		
	}
	private static void mostrarMenuMod() {
		final String MENU = "MODULAR";
		final String OPC1 = "1.- Lineal";
		final String OPC2 = "2.- Recursividad";
		final String OPCS = "0.- Volver ";

		Util.subrayar("\n\n\n\n\n\n\n\n"+MENU, "=");
		Util.escribir("\n" + OPC1);
		Util.escribir(OPC2);
		Util.escribir("\n" + OPCS);
	}

	private static void menuMod() {
		int opc;
		opc = Util.leerInt("Introduzca una opción: ");
		switch (opc) {
		case 1:
			mostraListaLineal();
			break;
		case 2:
			mostrarListaRecursividad();
			break;
		case 0:
			;
			break;
		}
	}

	private static void mostraListaLineal() {

	}

	private static void mostrarListaRecursividad() {

	}

	private static boolean ConfirmarSalir() {

		final String SALIR = "¿Esta usted seguro que quiere salir?";
		final String OPCS = "	 SI		NO	";
		String respuesta;
		boolean salida;

		Util.subrayar("\n\n\n\n\n\n\n\n\n"+SALIR, "=");
		Util.escribir("\n" + OPCS);
		Util.escribirL("\nRespuesta: ");

		respuesta = Util.leerString("");

		salida = (respuesta.equalsIgnoreCase("si")) ? true : false;

		return salida;

	}

	private static void salir() {
		Util.escribir("Fin de programa");
	}

}
