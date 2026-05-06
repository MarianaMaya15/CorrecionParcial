package uniquindio.edu.co.models.composite;

public class RecursoIndividual implements ComponenteBiblioteca {

    private final String nombre;
    private final String tipo;
    private final String descripcion;

    public RecursoIndividual(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar(String prefijo) {
        System.out.println(prefijo + "- Recurso individual: " + nombre);
        System.out.println(prefijo + "  Tipo: " + tipo);
        System.out.println(prefijo + "  Descripcion: " + descripcion);
    }
}
