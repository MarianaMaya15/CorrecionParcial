package uniquindio.edu.co.models.adaptador;

import uniquindio.edu.co.models.estructura.ElementoBiblioteca;

public class MaterialDigital implements ElementoBiblioteca {

    private final String titulo;
    private final String autor;
    private final int numeroPaginas;

    public MaterialDigital(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String nombreElemento() {
        return titulo;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "- Material digital: " + titulo);
        System.out.println(sangria + "  Autor: " + autor);
        System.out.println(sangria + "  Numero de paginas: " + numeroPaginas);
    }
}
