plugins {
  java // Carica il necessario per la compilazione di Java
  application // Carica il necessario per l'esecuzione di classi con la JVM
  checkstyle
}
repositories { mavenCentral() } // Configura Gradle per cercare e scaricare da Maven Central

application { // Configurazione dell'esecuzione, la main class è sufficiente
    mainClass.set("it.unibo.qa.Cat")
}
