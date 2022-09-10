plugins {
    id("java")
}

group = "org.memes"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    implementation("io.cucumber:cucumber-java:7.7.0")
    testImplementation("io.cucumber:cucumber-junit:7.7.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.9.0")



}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}