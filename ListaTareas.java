import java.util.ArrayList;

public class ListaTareas {
    // Atributo - ArrayList de la foto
    private ArrayList tareas;

    public ListaTareas() {
        this.tareas = new ArrayList();
    }

    // + agregar
    public void agregar(Tarea tarea) {
        tareas.add(tarea);
    }

    // + eliminar
    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            return true;
        }
        return false;
    }

    // + obtener
    public ArrayList obtener() {
        return tareas;
    }

    // + completar
    public boolean completar(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            // Convertimos el objeto genérico a Tarea para poder usar setCompletada
            Tarea t = (Tarea) tareas.get(indice);
            t.setCompletada(true);
            return true;
        }
        return false;
    }
}