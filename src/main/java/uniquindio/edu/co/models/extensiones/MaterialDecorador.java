package uniquindio.edu.co.models.extensiones;

import uniquindio.edu.co.models.estructura.ElementoBiblioteca;

public abstract class MaterialDecorador implements ElementoBiblioteca {

    protected final ElementoBiblioteca base;

    public MaterialDecorador(ElementoBiblioteca base) {
        this.base = base;
    }

    @Override
    public String nombreElemento() {
        return base.nombreElemento();
    }
}
