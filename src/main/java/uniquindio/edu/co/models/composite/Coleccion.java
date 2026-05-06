package uniquindio.edu.co.models.composite;

import java.util.ArrayList;
import java.util.List;

public class Coleccion implements ComponenteBiblioteca {

    private final String nombre;
    private final List<ComponenteBiblioteca> componentes;

    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(ComponenteBiblioteca componente) {
        componentes.add(componente);
    }

    public void eliminarComponente(ComponenteBiblioteca componente) {
        componentes.remove(componente);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrar(String prefijo) {
        System.out.println(prefijo + "+ Coleccion: " + nombre);
        for (ComponenteBiblioteca componente : componentes) {
            componente.mostrar(prefijo + "  ");
        }
    }
}
