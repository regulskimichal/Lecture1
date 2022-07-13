group = "pl.michalregulski"
version = "1.0-SNAPSHOT"

plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnitPlatform()
}
