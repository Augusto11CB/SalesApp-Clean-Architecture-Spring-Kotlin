import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    kotlin("jvm") version "1.3.71" apply false
    kotlin("plugin.spring") version "1.3.71"
    kotlin("plugin.jpa") version "1.3.71"
    kotlin("plugin.allopen") version "1.3.71"
    kotlin("plugin.noarg") version "1.3.71"
}






allprojects {

    /*
    In a multi-project you can use the top-level build script (also known as the root project) to configure as much commonality as possible, leaving sub-projects to customize only what is necessary for that subproject.

    The allprojects block is used to add configuration items that will apply to all sub-projects as well as the root project.
    */


    repositories {
        jcenter()
        mavenCentral()
    }


}


subprojects {

    /*
	the subprojects block can be used to add configurations items for all sub-projects only.

	*/

    group = "clean.archt.spring.studies.sales.app"
    version = "0.0.1-SNAPSHOT"


    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "kotlin-allopen")
    apply(plugin = "kotlin-jpa")
    apply(plugin = "kotlin-noarg")
    apply(plugin = "kotlin")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    java.sourceCompatibility = JavaVersion.VERSION_11

    val developmentOnly by configurations.creating
    configurations {
        runtimeClasspath {
            extendsFrom(developmentOnly)
        }
    }

    dependencies {
        developmentOnly("org.springframework.boot:spring-boot-devtools")

        implementation("org.springframework.boot:spring-boot-starter-actuator")
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//        implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
//        implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
//        implementation("org.springframework.boot:spring-boot-starter-security")
        implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("org.springframework.cloud:spring-cloud-starter-openfeign")

        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

        runtimeOnly("com.h2database:h2")
//        runtimeOnly("mysql:mysql-connector-java")


        testImplementation("org.springframework.boot:spring-boot-starter-test") {
            exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        }
        testImplementation("org.springframework.security:spring-security-test")
    }



    extra["springCloudVersion"] = "Hoxton.SR3"

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }


}