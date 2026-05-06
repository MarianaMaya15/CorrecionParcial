package uniquindio.edu.co;

import uniquindio.edu.co.models.adaptador.AdaptadorMaterial;
import uniquindio.edu.co.models.adaptador.MaterialDigital;
import uniquindio.edu.co.models.adaptador.MaterialExterno;
import uniquindio.edu.co.models.constructor.MaterialAcademico;
import uniquindio.edu.co.models.controlacceso.AccesoMaterialProxy;
import uniquindio.edu.co.models.estructura.ArchivoDigital;
import uniquindio.edu.co.models.estructura.CarpetaBiblioteca;
import uniquindio.edu.co.models.extensiones.DecoradorMarcaAgua;
import uniquindio.edu.co.models.extensiones.DecoradorProteccion;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SMARTLIBRARY ===\n");

        // Builder: creacion flexible de un material academico.
        MaterialAcademico materialBase = new MaterialAcademico.Builder("Arquitectura de Software", "Laura Mendez")
                .conEditorial("Editorial UniQ")
                .conAnio(2026)
                .conIsbn("978-111-222")
                .conPalabrasClave("patrones, java, biblioteca digital")
                .conFormato("PDF")
                .conTamano("18 MB")
                .build();

        System.out.println("1) MATERIAL CREADO CON BUILDER");
        materialBase.mostrar("");
        System.out.println();

        // Adapter: convierte paginas String del externo a int interno.
        MaterialExterno datoExterno = new MaterialExterno(
                "Guia de Metodologia",
                "Consorcio de Bibliotecas",
                "250"
        );
        AdaptadorMaterial adaptador = new AdaptadorMaterial(datoExterno);
        MaterialDigital materialAdaptado = adaptador.adaptar();

        System.out.println("2) MATERIAL ADAPTADO CON ADAPTER");
        materialAdaptado.mostrar("");
        System.out.println();

        // Composite: carpetas que contienen archivos y subcarpetas.
        ArchivoDigital archivoSimple = new ArchivoDigital(
                "Manual de Plataforma",
                "Manual tecnico",
                "Pasos basicos para usar SmartLibrary"
        );
        CarpetaBiblioteca carpetaPrincipal = new CarpetaBiblioteca("Biblioteca Central");
        CarpetaBiblioteca subcarpetaInvestigacion = new CarpetaBiblioteca("Investigacion 2026");

        subcarpetaInvestigacion.agregar(materialBase);
        subcarpetaInvestigacion.agregar(materialAdaptado);
        carpetaPrincipal.agregar(archivoSimple);
        carpetaPrincipal.agregar(subcarpetaInvestigacion);

        System.out.println("3) ESTRUCTURA ARMADA CON COMPOSITE");
        carpetaPrincipal.mostrar("");
        System.out.println();

        // Proxy: validacion de acceso por usuario.
        AccesoMaterialProxy accesoPermitido = new AccesoMaterialProxy("sara.estudiante", true, materialBase);
        AccesoMaterialProxy accesoDenegado = new AccesoMaterialProxy("visitante", false, materialBase);

        System.out.println("4) ACCESO CONTROLADO CON PROXY");
        accesoPermitido.mostrar("");
        accesoDenegado.mostrar("");
        System.out.println();

        // Decorator: extensiones opcionales sin cambiar la clase base.
        DecoradorMarcaAgua conMarca = new DecoradorMarcaAgua(
                materialBase,
                "Uso academico interno"
        );
        DecoradorProteccion protegido = new DecoradorProteccion(
                conMarca,
                "Bloqueo de copia/descarga"
        );

        System.out.println("5) MATERIAL EXTENDIDO CON DECORATOR");
        protegido.mostrar("");
        System.out.println();

        System.out.println("=== FIN DE LA DEMOSTRACION ===");
    }
}
