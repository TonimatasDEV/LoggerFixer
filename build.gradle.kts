plugins {
    `java-library`
    idea
    id("net.neoforged.moddev") version "2.0.105"
}

val modVersion: String by extra
val neoVersion: String by extra
val parchmentMappingsVersion: String by extra
val parchmentMinecraftVersion: String by extra
val loaderVersionRange: String by extra
val neoVersionRange: String by extra
val minecraftVersionRange: String by extra

version = modVersion
group = "dev.tonimatas.loggerfixer"

repositories {
    mavenLocal()
}

base {
    archivesName = "loggerfixer"
}

java.toolchain.languageVersion = JavaLanguageVersion.of(21)

neoForge {
    version = neoVersion

    parchment {
        mappingsVersion = parchmentMappingsVersion
        minecraftVersion = parchmentMinecraftVersion
    }

    runs {
        create("client") {
            client()
            systemProperty("neoforge.enabledGameTestNamespaces", "loggerfixer")
        }
        
        create("server") {
            server()
            programArgument("--nogui")
            systemProperty("neoforge.enabledGameTestNamespaces", "loggerfixer")
        }
        
        create("gameTestServer") {
            type = "gameTestServer"
            systemProperty("neoforge.enabledGameTestNamespaces", "loggerfixer")
        }
        
        create("data") {
            data()
            programArguments.addAll( "--mod", "loggerfixer", "--all",
                    "--output", file("src/generated/resources/").absolutePath,
                    "--existing", file("src/main/resources/").absolutePath
            )
        }

        configureEach {
            systemProperty("forge.logging.markers", "REGISTRIES")
            logLevel = org.slf4j.event.Level.DEBUG
        }
    }

    mods {
        create("loggerfixer") {
            sourceSet(sourceSets.main.get())
        }
    }
}

sourceSets.main.get().resources {
    srcDir("src/generated/resources")
}

tasks.processResources {
    var replaceProperties = mapOf("minecraftVersionRange" to minecraftVersionRange, "neoVersionRange" to neoVersionRange,
        "loaderVersionRange" to loaderVersionRange, "modVersion" to modVersion)

    inputs.properties(replaceProperties)
    
    filesMatching(listOf("META-INF/neoforge.mods.toml")) {
        expand(replaceProperties)
    }
}

idea {
    module {
        isDownloadSources = true
        isDownloadJavadoc = true
    }
}
