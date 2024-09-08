plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

group = "com.bank.user.api"
base.archivesName = "user-api"

repositories {
    mavenCentral()
}

dependencies {
    // axonframework
    implementation(platform(libs.axonframework.bom))
    compileOnly("org.axonframework:axon-modelling")

    // lombok
    annotationProcessor(libs.lombok)
    compileOnly(libs.lombok)

    // spring
    implementation(platform(libs.springboot.bom))
    compileOnly("org.springframework.boot:spring-boot-starter-validation")

    // swagger
    compileOnly(libs.springdoc.openapi.common)
}