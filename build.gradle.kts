plugins {
    id("java")
    id("java-toolchain")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}