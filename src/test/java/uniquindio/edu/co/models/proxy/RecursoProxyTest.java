package uniquindio.edu.co.models.proxy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uniquindio.edu.co.models.composite.RecursoIndividual;

public class RecursoProxyTest {

    @Test
    public void testCrearYUsarRecursoProxy() {
        // Crear un recurso real
        RecursoIndividual recursoReal = new RecursoIndividual("Libro de Python", "Libro", "Tutorial básico de Python");

        // Crear un proxy con acceso autorizado
        RecursoProxy proxy = new RecursoProxy("Juan", true, recursoReal);

        // Verificar que el proxy no sea null
        assertNotNull(proxy, "El proxy no debe ser null");

        // Verificar que el nombre se obtenga correctamente
        assertEquals("Libro de Python", proxy.getNombre(), "El nombre debe ser 'Libro de Python'");

        // Verificar que mostrar() no lance excepciones
        assertDoesNotThrow(() -> proxy.mostrar(""), "mostrar() no debe lanzar excepciones");
    }
}
