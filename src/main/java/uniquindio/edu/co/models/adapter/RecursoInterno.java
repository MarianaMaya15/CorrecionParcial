package uniquindio.edu.co.models.adapter;

import uniquindio.edu.co.models.composite.ComponenteBiblioteca;

public class RecursoInterno implements ComponenteBiblioteca {

    private final String titulo;
    private final String autor;
    private final int numeroPaginas;

    public RecursoInterno(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String getNombre() {
        return titulo;
    }

    @Override
    public void mostrar(String prefijo) {
        System.out.println(prefijo + toString().replace("\n", "\n" + prefijo));
    }

    @Override
    public String toString() {
        return "- Recurso interno: " + titulo + "\n"
                + "  Autor: " + autor + "\n"
                + "  Numero de paginas: " + numeroPaginas;
    }
}
