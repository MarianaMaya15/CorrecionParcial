package uniquindio.edu.co.models.builder;

import org.junit.jupiter.api.Test;
import uniquindio.edu.co.models.adapter.RecursoAdapter;
import uniquindio.edu.co.models.adapter.RecursoExterno;
import uniquindio.edu.co.models.adapter.RecursoInterno;

import static org.junit.jupiter.api.Assertions.*;

public class RecursoAdapterTest {

    @Test
    public void testAdaptarRecursoExternoAInterno() {
        // Crear un RecursoExterno con páginas como String "100"
        RecursoExterno recursoExterno = new RecursoExterno("Java Basics", "Joshua Bloch", "100");

        // Usar el adapter para convertirlo
        RecursoAdapter adapter = new RecursoAdapter(recursoExterno);
        RecursoInterno recursoInterno = adapter.adaptar();

        // Verificar que la conversión sea correcta
        assertNotNull(recursoInterno, "El recurso interno no debe ser null");
        assertEquals(100, recursoInterno.getNumeroPaginas(), "Las páginas deben ser 100");
        assertEquals("Java Basics", recursoInterno.getNombre(), "El nombre debe ser 'Java Basics'");
    }
}
