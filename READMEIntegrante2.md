# Taller03-SOLIDvet
Checklist de validación:

Criterio	Sí/No
El proyecto compila: Si
No hay condicional gigante por tipo en la lógica nueva: Si	
Cada tratamiento conoce su propio costo e indicaciones: Si	
Agregar un nuevo tratamiento requiere crear una clase, no editar todas: Si	

Preguntas de discusión:
¿Por qué los condicionales repetidos hacen más caro el cambio?
Porque hay que modificar varias clases a la vez, eso aumenta el riesgo de errores.

¿Qué pasaría si agregamos Odontologia como tratamiento?
Solo hay que crear la clase OdontologiaTratamiento implementando la interfaz ITratamiento y sin tocar otra clase.

¿Cuándo una interfaz ayuda a extender el sistema?
Cuando entre objetos se comparten lo que hacen pero hay una diferencia en el como lo hacen.
