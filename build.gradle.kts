import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    `maven-publish`
}

group = "dev.mr3n.romajikt"
version = "1.0"

repositories {
    mavenCentral()
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["kotlin"])
                groupId = "dev.mr3n"
                artifactId = "romajikt"
                version = "1.0"
            }
        }
    }
}