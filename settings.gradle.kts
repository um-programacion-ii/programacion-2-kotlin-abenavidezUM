/**
 * Configuración del proyecto: Figuras Geométricas
 * Configuración de módulos y plugins necesarios
 * Autor: Agustín Benavidez - Legajo: 62344
 */

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "proyecto-figuras-geometricas"
include("app")
