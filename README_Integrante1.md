# Taller03-SOLIDvet
Integrante1: Justin Soto

Checklist de validación:

| Criterio | Sí/No |
| --- | --- |
| El proyecto compila | Si |
| `Veterinario` ya no reserva, diagnostica, factura ni reporta |No|
| La funcionalidad del `Main` se mantiene |Si|
| Los nombres de servicios son claros |Si|

Preguntas de discusión:

- ¿Cuántas razones para cambiar tenía `Veterinario` antes del refactoring?

    Tenia 4 que le pedian hacer 4 responsabilidades completamente diferente
- ¿Qué ganamos al separar modelo y servicios?

    Separar las clases nos permite tener un orden y nos permite que podamos extender el codigo sin necesidad de modificarlo
- ¿Qué clase debería cambiar si mañana cambia el formato del reporte?