package uniquindio.edu.co.models.decorator;

import uniquindio.edu.co.models.composite.ComponenteBiblioteca;

public abstract class RecursoDecorator implements ComponenteBiblioteca {

    protected final ComponenteBiblioteca recursoDecorado;

    public RecursoDecorator(ComponenteBiblioteca recursoDecorado) {
        this.recursoDecorado = recursoDecorado;
    }

    @Override
    public String getNombre() {
        return recursoDecorado.getNombre();
    }
}
