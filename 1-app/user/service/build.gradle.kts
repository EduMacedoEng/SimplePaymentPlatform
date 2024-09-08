import java.io.ByteArrayOutputStream

plugins {
    java
    jacoco
    alias(libs.plugins.springboot)
    alias(libs.plugins.springDependencyManagement)
    alias(libs.plugins.jib)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

group = "com.bank.user.service"

configurations
    .testImplementation.get()
    .extendsFrom(configurations.implementation.get())

configurations
    .testCompileOnly.get()
    .extendsFrom(configurations.compileOnly.get())

configurations
    .testAnnotationProcessor.get()
    .extendsFrom(configurations.annotationProcessor.get())

repositories {
    mavenCentral()
}


dependencies {

    // awaitility
    testImplementation(libs.awaitility)

    // axonframework

    // instancio
    testImplementation(libs.instancio)

    // lombok
    annotationProcessor(libs.lombok)
    compileOnly(libs.lombok)

    // mapstruct
    annotationProcessor(libs.mapstruct.processor)
    annotationProcessor(libs.mapstruct.lombok.binding)
    implementation(libs.mapstruct.core)

    // spring
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    implementation(libs.spring.retry)
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-aop")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    //implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
    implementation("org.springframework.security:spring-security-oauth2-jose")
    implementation("org.springframework.security:spring-security-oauth2-resource-server")
    testImplementation("org.apache.httpcomponents.client5:httpclient5")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")

    // springdoc
    implementation(libs.springdoc.openapi.common)
    implementation(libs.springdoc.openapi.webmvc.ui)

    // wiremock
    testImplementation(libs.wiremock)
}

tasks.withType<JacocoReport> {
    dependsOn(tasks.test)
    reports {
        xml.required = true
        html.required = true
    }
}