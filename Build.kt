import com.beust.kobalt.*
import com.beust.kobalt.plugin.java.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.publish.*

val jcommander = javaProject {
    name = "jcommander"
    group = "com.beust"
    artifactId = name
    version = "1.52"
    directory = homeDir("java/jcommander")

    sourceDirectories {
        path("src/main/java")
    }
    sourceDirectoriesTest {
        path("src/test/java")
        path("src/test/resources")
    }
    dependenciesTest {
        compile("org.testng:testng:6.9.5")
    }
}

val pack = assemble(jcommander) {
    mavenJars {
    }
}

val jcenter = jcenter(jcommander) {
    publish = false
}