package uniquindio.edu.co.models.estructura;

public class ArchivoDigital implements ElementoBiblioteca {

    private final String titulo;
    private final String categoria;
    private final String resumen;

    public ArchivoDigital(String titulo, String categoria, String resumen) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.resumen = resumen;
    }

    @Override
    public String nombreElemento() {
        return titulo;
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "- Archivo: " + titulo);
        System.out.println(sangria + "  Categoria: " + categoria);
        System.out.println(sangria + "  Resumen: " + resumen);
    }
}
