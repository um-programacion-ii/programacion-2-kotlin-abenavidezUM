# Proyecto de Figuras Geométricas en Kotlin

## Autor
**Agustín Benavidez**  
Legajo: 62344  
Proyecto educativo para Programación II

## Descripción
Este proyecto implementa conceptos fundamentales de Programación Orientada a Objetos (POO) en Kotlin, incluyendo interfaces, polimorfismo, encapsulación y herencia.

## Características Implementadas

### 🚗 Clase Coche
- Propiedades básicas: marca y modelo
- Valores por defecto

### 📐 Interface Perimetrable
- Define el contrato para objetos que pueden calcular su perímetro
- Método: `calcularPerimetro()`

### 🔺 Figuras Geométricas
- **Rectangulo**: Implementa cálculo de perímetro y área
- **Circulo**: Implementa cálculo de perímetro usando π
- Ambas implementan la interface `Perimetrable`

### ✅ Funcionalidades
- Demostración de polimorfismo con lista de figuras
- Formateo de salida con precisión decimal
- Inicialización con mensajes informativos
- Métodos descriptivos

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

## Conceptos de POO Demostrados
1. **Encapsulación**: Propiedades con acceso controlado
2. **Interfaces**: Contrato común para diferentes implementaciones
3. **Polimorfismo**: Tratamiento uniforme de objetos de diferentes clases
4. **Herencia de comportamiento**: Implementación de interfaces
5. **Inicialización**: Bloques init con mensajes informativos

---
*Proyecto desarrollado como parte del curso de Programación II*