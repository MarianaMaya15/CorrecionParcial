package uniquindio.edu.co.models.controlacceso;

import uniquindio.edu.co.models.estructura.ElementoBiblioteca;

public class AccesoMaterialProxy implements ElementoBiblioteca {

    private final String usuario;
    private final boolean permitido;
    private final ElementoBiblioteca materialReal;

    public AccesoMaterialProxy(String usuario, boolean permitido, ElementoBiblioteca materialReal) {
        this.usuario = usuario;
        this.permitido = permitido;
        this.materialReal = materialReal;
    }

    @Override
    public String nombreElemento() {
        return materialReal.nombreElemento();
    }

    @Override
    public void mostrar(String sangria) {
        System.out.println(sangria + "Solicitud de usuario: " + usuario);
        if (permitido) {
            System.out.println(sangria + "Acceso aprobado a: " + materialReal.nombreElemento());
            materialReal.mostrar(sangria + "  ");
        } else {
            System.out.println(sangria + "Acceso denegado a: " + materialReal.nombreElemento());
        }
    }
}
