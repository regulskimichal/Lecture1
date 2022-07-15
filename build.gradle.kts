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

val ENABLE_PREVIEW = "--enable-preview"

tasks.withType<JavaCompile> {
    options.compilerArgs.add(ENABLE_PREVIEW)
}

tasks.withType<Test> {
    jvmArgs(ENABLE_PREVIEW)
}

tasks.withType<JavaExec> {
    jvmArgs(ENABLE_PREVIEW)
}
