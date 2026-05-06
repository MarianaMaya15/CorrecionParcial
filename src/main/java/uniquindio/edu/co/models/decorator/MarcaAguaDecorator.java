package uniquindio.edu.co.models.decorator;

import uniquindio.edu.co.models.composite.ComponenteBiblioteca;

public class MarcaAguaDecorator extends RecursoDecorator {

    private final String marcaAgua;

    public MarcaAguaDecorator(ComponenteBiblioteca recursoDecorado, String marcaAgua) {
        super(recursoDecorado);
        this.marcaAgua = marcaAgua;
    }

    @Override
    public void mostrar(String prefijo) {
        recursoDecorado.mostrar(prefijo);
        System.out.println(prefijo + "  Marca de agua: " + marcaAgua);
    }
}
