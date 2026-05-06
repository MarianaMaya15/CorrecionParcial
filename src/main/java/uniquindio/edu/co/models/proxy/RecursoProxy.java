package uniquindio.edu.co.models.proxy;

import uniquindio.edu.co.models.composite.ComponenteBiblioteca;

public class RecursoProxy implements ComponenteBiblioteca {

    private final String nombreUsuario;
    private final boolean usuarioAutorizado;
    private final ComponenteBiblioteca recursoReal;

    // Proxy: controla el acceso antes de delegar al recurso real.
    public RecursoProxy(String nombreUsuario, boolean usuarioAutorizado, ComponenteBiblioteca recursoReal) {
        this.nombreUsuario = nombreUsuario;
        this.usuarioAutorizado = usuarioAutorizado;
        this.recursoReal = recursoReal;
    }

    @Override
    public String getNombre() {
        return recursoReal.getNombre();
    }

    @Override
    public void mostrar(String prefijo) {
        System.out.println(prefijo + "Solicitud de acceso de: " + nombreUsuario);
        if (usuarioAutorizado) {
            System.out.println(prefijo + "Acceso concedido al recurso: " + recursoReal.getNombre());
            recursoReal.mostrar(prefijo + "  ");
        } else {
            System.out.println(prefijo + "Acceso denegado al recurso: " + recursoReal.getNombre());
        }
    }
}
