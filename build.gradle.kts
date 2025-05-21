plugins {
    java
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.29.0")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.9.3")
}

tasks.test {
    useJUnitPlatform()
    systemProperty("chromeoptions.prefs", System.getProperty("chromeoptions.prefs", "profile.password_manager_leak_detection=false"))
}
