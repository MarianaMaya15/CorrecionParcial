package uniquindio.edu.co.models.adapter;

public class RecursoAdapter {

    private final RecursoExterno recursoExterno;

    // Adapter: convierte un recurso externo al formato interno.
    public RecursoAdapter(RecursoExterno recursoExterno) {
        this.recursoExterno = recursoExterno;
    }

    public RecursoInterno adaptar() {
        int paginasConvertidas;
        try {
            paginasConvertidas = Integer.parseInt(recursoExterno.getNumeroPaginas());
        } catch (NumberFormatException e) {
            paginasConvertidas = 0;
            System.out.println("No se pudo convertir el número de páginas.");
        }

        return new RecursoInterno(
                recursoExterno.getTitulo(),
                recursoExterno.getAutor(),
                paginasConvertidas
        );
    }
}
