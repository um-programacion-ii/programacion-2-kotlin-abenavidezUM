/**
 * Proyecto de Figuras Geométricas y Vehículos
 * Autor: Agustín Benavidez - Legajo: 62344
 * Implementación de conceptos de POO en Kotlin
 */
package org.example

import kotlin.math.PI

// Clase para representar vehículos
class Vehiculo {
    var marca: String = "Toyota"
    var modelo: Int = 2023
    
    override fun toString(): String = "Vehículo: $marca ($modelo)"
}

// Interface para objetos que pueden calcular su perímetro
interface CalculadorPerimetro {
    fun obtenerPerimetro(): Double
}

// Implementación para figuras rectangulares
class FiguraRectangular(val anchura: Double, val altura: Double) : CalculadorPerimetro {
    // Área calculada una sola vez
    val superficie: Double = anchura * altura

    override fun obtenerPerimetro(): Double = 2 * (anchura + altura)
    
    override fun toString(): String = "Rectángulo(${anchura} x ${altura})"

    init {
        println("Creado rectángulo de $anchura x $altura con superficie de $superficie")
    }

    fun mostrarInfo() {
        println("Esta es una figura rectangular.")
    }
}

// Implementación para figuras circulares
class FiguraCircular(val radioCirculo: Double) : CalculadorPerimetro {
    override fun obtenerPerimetro(): Double = 2 * PI * radioCirculo
    
    override fun toString(): String = "Círculo(radio=$radioCirculo)"
}

fun main() {
    println("=== Proyecto de POO - Agustín Benavidez ===")
    
    println("\n--- 1. Demostración con Vehículo ---")
    val miVehiculo = Vehiculo()
    println("Marca: ${miVehiculo.marca}")
    println("Modelo: ${miVehiculo.modelo}")
    println("Representación: $miVehiculo")

    println("\n--- 2. Creación de Figura Rectangular ---")
    val rectangulo = FiguraRectangular(12.0, 8.0)
    println("La superficie del rectángulo es: ${rectangulo.superficie}")
    rectangulo.mostrarInfo()
    val perimetroRect = rectangulo.obtenerPerimetro()
    println("El perímetro del rectángulo es: $perimetroRect")

    println("\n--- 3. Demostración de Polimorfismo ---")
    val formasGeometricas: List<CalculadorPerimetro> = listOf(
        FiguraRectangular(15.0, 7.0),
        FiguraCircular(4.5),
        FiguraRectangular(6.0, 6.0),
        FiguraCircular(2.8)
    )

    formasGeometricas.forEachIndexed { indice, forma ->
        println("${indice + 1}. $forma → perímetro = ${"%.2f".format(forma.obtenerPerimetro())}")
    }
    
    println("\n=== Fin del programa ===")
}

/* 
 * Requisitos implementados:
 * ✓ Interface CalculadorPerimetro con método obtenerPerimetro()
 * ✓ Clase FiguraRectangular que implementa la interface
 * ✓ Clase FiguraCircular que implementa la interface  
 * ✓ Lista con objetos de cada clase mostrando sus perímetros
 * ✓ Funcionalidad adicional con vehículos y formateo
 */