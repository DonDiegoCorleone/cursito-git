public class Main {

    public static void main(String[] args) {
        saludoBucle();
        despedida();
    }


    /**
     * Muestra "Hola mundo." 5 veces
     * de una forma bastante ineficiente.
     */
    public static void saludoBucle() {
        int i=0;
        while(i<5){
			System.out.println("Hola mundo.");
			i++;
		}
    }

    /**
     * Muestra un mensaje que indica el
     * final de la ejecución del programa.
     */
    private static void despedida() {
        System.out.println("\nFin del programa.");
    }
}