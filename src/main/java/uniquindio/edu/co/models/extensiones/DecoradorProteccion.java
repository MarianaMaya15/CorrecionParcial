package uniquindio.edu.co.models.extensiones;

import uniquindio.edu.co.models.estructura.ElementoBiblioteca;

public class DecoradorProteccion extends MaterialDecorador {

    private final String nivelProteccion;

    public DecoradorProteccion(ElementoBiblioteca base, String nivelProteccion) {
        super(base);
        this.nivelProteccion = nivelProteccion;
    }

    @Override
    public void mostrar(String sangria) {
        base.mostrar(sangria);
        System.out.println(sangria + "  Proteccion adicional: " + nivelProteccion);
    }
}
