/**
 * Pruebas unitarias para el proyecto de figuras geométricas
 * Autor: Agustín Benavidez - Legajo: 62344
 */
package org.example

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertNotNull

class AppTest {
    
    @Test 
    fun vehiculoTieneValoresDefault() {
        val vehiculo = Vehiculo()
        assertNotNull(vehiculo.marca, "El vehículo debería tener una marca")
        assertTrue(vehiculo.modelo > 0, "El modelo debería ser un año válido")
    }
    
    @Test
    fun figuraCircularCalculaPerimetroCorrectamente() {
        val circulo = FiguraCircular(5.0)
        val perimetroEsperado = 2 * kotlin.math.PI * 5.0
        assertEquals(perimetroEsperado, circulo.obtenerPerimetro(), 0.001, 
                    "El perímetro del círculo no es correcto")
    }
    
    @Test
    fun figuraRectangularCalculaPerimetroCorrectamente() {
        val rectangulo = FiguraRectangular(4.0, 6.0)
        val perimetroEsperado = 2.0 * (4.0 + 6.0)
        assertEquals(perimetroEsperado, rectangulo.obtenerPerimetro(), 0.001,
                    "El perímetro del rectángulo no es correcto")
    }
    
    @Test
    fun figuraRectangularCalculaSuperficieCorrectamente() {
        val rectangulo = FiguraRectangular(3.0, 7.0)
        val superficieEsperada = 3.0 * 7.0
        assertEquals(superficieEsperada, rectangulo.superficie, 0.001,
                    "La superficie del rectángulo no es correcta")
    }
    
    @Test
    fun figurasImplementanInterfazCorrectamente() {
        val figuras: List<CalculadorPerimetro> = listOf(
            FiguraCircular(3.0),
            FiguraRectangular(2.0, 4.0)
        )
        
        assertTrue(figuras.isNotEmpty(), "La lista de figuras no debería estar vacía")
        figuras.forEach { figura ->
            assertNotNull(figura.obtenerPerimetro(), "Cada figura debería poder calcular su perímetro")
            assertTrue(figura.obtenerPerimetro() > 0, "El perímetro debería ser positivo")
        }
    }
}