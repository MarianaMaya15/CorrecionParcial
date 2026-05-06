package uniquindio.edu.co.models.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uniquindio.edu.co.models.composite.RecursoIndividual;

public class RecursoDecoratorTest {

    @Test
    public void testEnvolverRecursoConDecorador() {
        // Crear un recurso individual
        RecursoIndividual recurso = new RecursoIndividual("Tesis de grado", "Documento", "Mi proyecto final");

        // Envolverlo con un decorador de marca de agua
        MarcaAguaDecorator recursoDecorado = new MarcaAguaDecorator(recurso, "CONFIDENCIAL");

        // Verificar que el recurso decorado no sea null
        assertNotNull(recursoDecorado, "El recurso decorado no debe ser null");

        // Verificar que el nombre se obtenga correctamente
        assertEquals("Tesis de grado", recursoDecorado.getNombre(), "El nombre debe ser 'Tesis de grado'");

        // Verificar que mostrar() no lance excepciones
        assertDoesNotThrow(() -> recursoDecorado.mostrar(""), "mostrar() no debe lanzar excepciones");
    }
}
