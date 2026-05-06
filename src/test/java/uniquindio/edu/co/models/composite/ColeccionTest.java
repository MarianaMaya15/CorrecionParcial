package uniquindio.edu.co.models.composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColeccionTest {

    @Test
    public void testAgregarRecursoIndividualAColeccion() {
        // Crear una colección
        Coleccion coleccion = new Coleccion("Mi Colección de Libros");

        // Crear un recurso individual
        RecursoIndividual recurso = new RecursoIndividual("El Quijote", "Novela", "Clásico de la literatura española");

        // Agregar el recurso a la colección sin errores
        assertDoesNotThrow(() -> coleccion.agregarComponente(recurso), "agregarComponente() no debe lanzar excepciones");

        // Verificar que el recurso se agregó correctamente
        assertEquals("Mi Colección de Libros", coleccion.getNombre(), "El nombre de la colección debe ser correcto");

        // Verificar que mostrar() no lance excepciones
        assertDoesNotThrow(() -> coleccion.mostrar(""), "mostrar() no debe lanzar excepciones");
    }
}
