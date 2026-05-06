package uniquindio.edu.co.models.estructura;

public interface ElementoBiblioteca {

    String nombreElemento();

    void mostrar(String sangria);

    default void mostrar() {
        mostrar("");
    }
}
