package uniquindio.edu.co.models.estructura;

import java.util.ArrayList;
import java.util.List;

public class CarpetaBiblioteca implements ElementoBiblioteca {

    private final String nombre;
    private final List<ElementoBiblioteca> contenidos;

    public CarpetaBiblioteca(String nombre) {
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public void agregar(ElementoBiblioteca elemento) {
        contenidos.add(elemento);
    }

    public void quitar(ElementoBiblioteca elemento) {
        contenidos.remove(elemento);
    }

    @Override
    public String nombreElemento() {
        return nombre;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "+ Carpeta: " + nombre);
        for (ElementoBiblioteca elemento : contenidos) {
            elemento.mostrar(sangria + "  ");
        }
    }
}
