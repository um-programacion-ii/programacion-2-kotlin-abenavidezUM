/**
 * Proyecto de Figuras Geométricas y Vehículos
 * Autor: Agustín Benavidez - Legajo: 62344
 * Implementación de conceptos de POO en Kotlin
 */
package org.example

// Clase para representar vehículos con propiedades personalizadas
data class Vehiculo(
    private var fabricante: String = "Toyota", 
    private var year: Int = 2023
) {
    // Propiedad para el fabricante con validación
    var marca: String
        get() = fabricante
        set(nuevoValor) { 
            fabricante = if (nuevoValor.isNotBlank()) nuevoValor else "Desconocido"
        }

    // Propiedad para el año con validación
    var modelo: Int
        get() = year
        set(nuevoValor) { 
            year = if (nuevoValor > 1900) nuevoValor else 2023
        }
    
    override fun toString(): String = "Vehículo: $fabricante ($year)"
}

// Interfaz para objetos que pueden calcular su perímetro
interface CalculadorPerimetro {
    fun obtenerPerimetro(): Double
    fun mostrarInfo(): String
}

// Implementación para figuras circulares
class FiguraCircular(private val radioCirculo: Double) : CalculadorPerimetro {
    
    override fun obtenerPerimetro(): Double {
        return 2.0 * kotlin.math.PI * radioCirculo
    }
    
    override fun mostrarInfo(): String {
        return "Círculo con radio $radioCirculo"
    }
}

// Implementación para figuras rectangulares
class FiguraRectangular(
    private val anchura: Double, 
    private val altura: Double
) : CalculadorPerimetro {
    
    override fun obtenerPerimetro(): Double {
        return 2.0 * (anchura + altura)
    }
    
    override fun mostrarInfo(): String {
        return "Rectángulo de ${anchura}x${altura}"
    }
}

// Función para demostrar polimorfismo con figuras geométricas
fun ejecutarCalculosGeometricos() {
    println("=== Cálculo de Perímetros ===")
    
    val formasGeometricas = mutableListOf<CalculadorPerimetro>()
    
    // Agregar diferentes figuras
    formasGeometricas.add(FiguraCircular(7.5))
    formasGeometricas.add(FiguraRectangular(3.0, 8.0))
    formasGeometricas.add(FiguraCircular(2.0))
    
    // Mostrar información de cada figura
    formasGeometricas.forEachIndexed { indice, forma ->
        println("${indice + 1}. ${forma.mostrarInfo()}")
        println("   Perímetro: %.2f".format(forma.obtenerPerimetro()))
        println()
    }
}

// Función principal del programa
fun main() {
    println("Programa de Demostración - POO en Kotlin")
    println("========================================")
    
    // Demostración con vehículos
    val miVehiculo = Vehiculo("Honda", 2024)
    println("Información del vehículo:")
    println("Fabricante: ${miVehiculo.marca}")
    println("Año: ${miVehiculo.modelo}")
    println("Representación: $miVehiculo")
    println()
    
    // Demostración con figuras geométricas
    ejecutarCalculosGeometricos()
    
    println("Fin del programa.")
}

/* 
 * Requisitos implementados:
 * ✓ Interface CalculadorPerimetro con método obtenerPerimetro()
 * ✓ Clase FiguraRectangular que implementa la interface
 * ✓ Clase FiguraCircular que implementa la interface  
 * ✓ Lista con objetos de cada clase mostrando sus perímetros
 * ✓ Funcionalidad adicional con validación y formateo
 */