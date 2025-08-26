# Proyecto de Figuras Geométricas en Kotlin

## Descripción
Este proyecto implementa conceptos fundamentales de Programación Orientada a Objetos (POO) en Kotlin, incluyendo interfaces, polimorfismo, encapsulación y herencia.

## Autor
**Agustín Benavidez**  
Legajo: 62344  
Proyecto educativo para Programación II

## Características Implementadas

### 🚗 Clase Vehiculo
- Propiedades con getters y setters personalizados
- Validación de datos de entrada
- Valores por defecto
- Representación mediante `toString()`

### 🔺 Interface CalculadorPerimetro
- Define el contrato para objetos que pueden calcular su perímetro
- Métodos: `obtenerPerimetro()` y `mostrarInfo()`

### 📐 Figuras Geométricas
- **FiguraCircular**: Implementa cálculo de perímetro para círculos
- **FiguraRectangular**: Implementa cálculo de perímetro para rectángulos
- Ambas implementan la interface `CalculadorPerimetro`

### ✅ Funcionalidades
- Demostración de polimorfismo con lista de figuras
- Formateo de salida con precisión decimal
- Validación de datos de entrada
- Pruebas unitarias comprehensivas

## Ejecución

### Compilar
```bash
./gradlew build
```

### Ejecutar
```bash
./gradlew run
```

### Ejecutar pruebas
```bash
./gradlew test
```

## Requisitos Técnicos
- Kotlin 2.2.0
- Java 21
- Gradle 9.0.0

## Estructura del Proyecto
```
proyecto-figuras-geometricas/
├── app/
│   ├── src/
│   │   ├── main/kotlin/org/example/
│   │   │   └── App.kt
│   │   └── test/kotlin/org/example/
│   │       └── AppTest.kt
│   └── build.gradle.kts
├── gradle/
└── settings.gradle.kts
```

## Conceptos de POO Demostrados
1. **Encapsulación**: Propiedades privadas con acceso controlado
2. **Interfaces**: Contrato común para diferentes implementaciones
3. **Polimorfismo**: Tratamiento uniforme de objetos de diferentes clases
4. **Herencia de comportamiento**: Implementación de interfaces
5. **Validación**: Control de datos de entrada
6. **Testing**: Pruebas unitarias para verificar funcionalidad

---
*Proyecto desarrollado como parte del curso de Programación II*
