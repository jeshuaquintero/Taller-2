public class TareaControlador {
    private ListaTareas modelo;
    private TareaVista vista;

    public TareaControlador(ListaTareas modelo, TareaVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarTarea() {
        String nombre = vista.pedirTexto("Nombre de la tarea: ");
        String descripcion = vista.pedirTexto("Descripción: ");
        Tarea nuevaTarea = new Tarea(nombre, descripcion);
        modelo.agregar(nuevaTarea);
        vista.mostrarMensaje(">> Tarea agregada con éxito.");
    }

    public void eliminarTarea() {
        vista.mostrar(modelo.obtener());
        int indice = vista.pedirNumero("Índice de la tarea a eliminar: ");
        if (modelo.eliminar(indice)) {
            vista.mostrarMensaje(">> Tarea eliminada.");
        } else {
            vista.mostrarMensaje(">> Índice no válido.");
        }
    }

    public void completarTarea() {
        vista.mostrar(modelo.obtener());
        int indice = vista.pedirNumero("Índice de la tarea a completar: ");
        if (modelo.completar(indice)) {
            vista.mostrarMensaje(">> Tarea marcada como completada.");
        } else {
            vista.mostrarMensaje(">> Índice no válido.");
        }
    }

    // Bucle para procesar las peticiones del usuario
    public void iniciar() {
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    eliminarTarea();
                    break;
                case 3:
                    completarTarea();
                    break;
                case 4:
                    vista.mostrar(modelo.obtener());
                    break;
                case 5:
                    ejecutando = false;
                    vista.mostrarMensaje("Programa finalizado.");
                    break;
                default:
                    vista.mostrarMensaje("Opción inválida.");
            }
        }
    }
}