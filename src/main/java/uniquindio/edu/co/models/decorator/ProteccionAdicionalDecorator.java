package uniquindio.edu.co.models.decorator;

import uniquindio.edu.co.models.composite.ComponenteBiblioteca;

public class ProteccionAdicionalDecorator extends RecursoDecorator {

    private final String proteccion;

    public ProteccionAdicionalDecorator(ComponenteBiblioteca recursoDecorado, String proteccion) {
        super(recursoDecorado);
        this.proteccion = proteccion;
    }

    @Override
    public void mostrar(String prefijo) {
        recursoDecorado.mostrar(prefijo);
        System.out.println(prefijo + "  Proteccion adicional: " + proteccion);
    }
}
