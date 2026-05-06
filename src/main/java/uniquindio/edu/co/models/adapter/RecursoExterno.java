package uniquindio.edu.co.models.adapter;

public class RecursoExterno {

    private final String titulo;
    private final String autor;
    private final String numeroPaginas;

    public RecursoExterno(String titulo, String autor, String numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }
}
