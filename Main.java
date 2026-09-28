public class Main {
    public static void main(String[] args) {
        ListaTareas modelo = new ListaTareas();
        TareaVista vista = new TareaVista();
        TareaControlador controlador = new TareaControlador(modelo, vista);

        // Inicia el menú interactivo por consola
        controlador.iniciar();
    }
}