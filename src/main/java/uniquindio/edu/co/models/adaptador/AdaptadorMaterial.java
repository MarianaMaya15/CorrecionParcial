package uniquindio.edu.co.models.adaptador;

public class AdaptadorMaterial {

    private final MaterialExterno materialExterno;

    public AdaptadorMaterial(MaterialExterno materialExterno) {
        this.materialExterno = materialExterno;
    }

    public MaterialDigital adaptar() {
        int paginas;
        try {
            paginas = Integer.parseInt(materialExterno.getNumeroPaginas());
        } catch (NumberFormatException e) {
            paginas = 0;
            System.out.println("No se pudo convertir el numero de paginas.");
        }

        return new MaterialDigital(
                materialExterno.getTitulo(),
                materialExterno.getAutor(),
                paginas
        );
    }
}
