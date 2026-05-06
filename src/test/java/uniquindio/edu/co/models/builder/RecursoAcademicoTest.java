package uniquindio.edu.co.models.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursoAcademicoTest {

    @Test
    public void testCrearRecursoAcademicoConBuilder() {
        // Crear un RecursoAcademico usando el Builder
        RecursoAcademico recurso = new RecursoAcademico.Builder("Clean Code", "Robert Martin")
                .builderEditorial("Prentice Hall")
                .builderAnio(2008)
                .builderIsbn("0132350882")
                .build();

        // Verificar que no sea null
        assertNotNull(recurso, "El recurso no debe ser null");

        // Verificar que el nombre sea correcto
        assertEquals("Clean Code", recurso.getNombre(), "El nombre debe ser 'Clean Code'");
    }
}
