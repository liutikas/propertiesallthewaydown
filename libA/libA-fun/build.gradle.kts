plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit)
    api(libs.commons.math3)
    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

println(
    """
        $path - ${providers.gradleProperty("com.myproperty").getOrElse("NOT FOUND")}
    """.trimIndent()
)
