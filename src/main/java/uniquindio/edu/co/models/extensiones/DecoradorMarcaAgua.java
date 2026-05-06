package uniquindio.edu.co.models.extensiones;

import uniquindio.edu.co.models.estructura.ElementoBiblioteca;

public class DecoradorMarcaAgua extends MaterialDecorador {

    private final String marca;

    public DecoradorMarcaAgua(ElementoBiblioteca base, String marca) {
        super(base);
        this.marca = marca;
    }

    @Override
    public void mostrar(String sangria) {
        base.mostrar(sangria);
        System.out.println(sangria + "  Marca de agua: " + marca);
    }
}
