plugins {
    kotlin("jvm") version "1.3.0-rc-116"
    application
    greetings.generator
}

greetings {
    greeting.set("Hello, KotlinConf!")
    resourcePath.set("greeting.txt")
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

application {
    mainClassName = "greetings.GreetingsKt"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation("junit:junit:4.12") // TODO use kotlin-test instead
}

repositories {
    jcenter()
}
