package uniquindio.edu.co.models.constructor;

import uniquindio.edu.co.models.estructura.ElementoBiblioteca;

public class MaterialAcademico implements ElementoBiblioteca {

    private final String titulo;
    private final String autor;
    private final String editorial;
    private final int anio;
    private final String isbn;
    private final String palabrasClave;
    private final String formato;
    private final String tamano;

    public MaterialAcademico(Builder builder) {
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
    public String nombreElemento() {
        return titulo;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + toString().replace("\n", "\n" + sangria));
    }

    @Override
    public String toString() {
        return "- Material academico: " + titulo + "\n"
                + "  Autor: " + autor + "\n"
                + "  Editorial: " + editorial + "\n"
                + "  Anio: " + anio + "\n"
                + "  ISBN: " + isbn + "\n"
                + "  Palabras clave: " + palabrasClave + "\n"
                + "  Formato: " + formato + "\n"
                + "  Tamano: " + tamano;
    }

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

        public Builder conEditorial(String editorial) {
            this.editorial = editorial;
            return this;
        }

        public Builder conAnio(int anio) {
            this.anio = anio;
            return this;
        }

        public Builder conIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder conPalabrasClave(String palabrasClave) {
            this.palabrasClave = palabrasClave;
            return this;
        }

        public Builder conFormato(String formato) {
            this.formato = formato;
            return this;
        }

        public Builder conTamano(String tamano) {
            this.tamano = tamano;
            return this;
        }

        public MaterialAcademico build() {
            return new MaterialAcademico(this);
        }
    }
}
