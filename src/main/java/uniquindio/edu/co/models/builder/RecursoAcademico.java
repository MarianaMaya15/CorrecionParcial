package uniquindio.edu.co.models.builder;

import uniquindio.edu.co.models.composite.ComponenteBiblioteca;

public class RecursoAcademico implements ComponenteBiblioteca {

    private final String titulo;
    private final String autor;
    private final String editorial;
    private final int anio;
    private final String isbn;
    private final String palabrasClave;
    private final String formato;
    private final String tamano;

    public RecursoAcademico(Builder builder) {
        this.titulo = builder.titulo;
        this.autor = builder.autor;
        this.editorial = builder.editorial;
        this.anio = builder.anio;
        this.isbn = builder.isbn;
        this.palabrasClave = builder.palabrasClave;
        this.formato = builder.formato;
        this.tamano = builder.tamano;
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
        return "- Recurso academico: " + titulo + "\n"
                + "  Autor: " + autor + "\n"
                + "  Editorial: " + editorial + "\n"
                + "  Anio: " + anio + "\n"
                + "  ISBN: " + isbn + "\n"
                + "  Palabras clave: " + palabrasClave + "\n"
                + "  Formato: " + formato + "\n"
                + "  Tamano: " + tamano;
    }

    // Builder interno estatico: obligatorios + opcionales con valores por defecto.
    public static class Builder {
        private final String titulo;
        private final String autor;
        private String editorial = "Sin editorial";
        private int anio = 2026;
        private String isbn = "Sin ISBN";
        private String palabrasClave = "Sin palabras clave";
        private String formato = "PDF";
        private String tamano = "0 MB";

        public Builder(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public Builder builderEditorial(String editorial) {
            this.editorial = editorial;
            return this;
        }

        public Builder builderAnio(int anio) {
            this.anio = anio;
            return this;
        }

        public Builder builderIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder builderPalabrasClave(String palabrasClave) {
            this.palabrasClave = palabrasClave;
            return this;
        }

        public Builder builderFormato(String formato) {
            this.formato = formato;
            return this;
        }

        public Builder builderTamano(String tamano) {
            this.tamano = tamano;
            return this;
        }

        public RecursoAcademico build() {
            return new RecursoAcademico(this);
        }
    }
}
