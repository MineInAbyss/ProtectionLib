plugins {
    alias(idofrontLibs.plugins.mia.kotlin.jvm)
    alias(idofrontLibs.plugins.mia.papermc)
    alias(idofrontLibs.plugins.mia.publication)
    alias(idofrontLibs.plugins.mia.autoversion)
}

repositories {
    mavenCentral()
    //mavenLocal()
    maven("https://repo.codemc.org/repository/maven-public/")
    maven("https://repo.nexomc.com/releases")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://ci.ender.zone/plugin/repository/everything/")
    maven("https://repo.glaremasters.me/repository/towny/")
    maven("https://maven.enginehub.org/repo/")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://jitpack.io")
    maven("https://repo.william278.net/releases")
}

val cartridgeStub: SourceSet by sourceSets.creating

dependencies {
    "cartridgeStubCompileOnly"(libs.paper.api)
    compileOnly(cartridgeStub.output)
    compileOnly(libs.factions) {
        exclude("org.kitteh:paste-gg-api")
        exclude("com.darkblade12:particleeffect")
        exclude("org.spongepowered:configurate-hocon")
        exclude("com.mojang:brigadier")
    }
    implementation(platform("com.intellectualsites.bom:bom-1.18.x:1.20"))
    compileOnly("com.plotsquared:PlotSquared-Core")
    compileOnly("com.plotsquared:PlotSquared-Bukkit")
    compileOnly(files("libs/GriefPrevention-16.18.jar"))
    compileOnly(files("libs/NoBuildPlus-1.4.9.jar"))
    compileOnly(files("libs/Residence5.1.7.2.jar"))
    compileOnly(libs.crashclaim)
    compileOnly(libs.huskclaims)
    compileOnly(libs.husktowns)
    compileOnly(libs.lands)
    compileOnly(libs.bentobox)
    compileOnly(libs.towny)
    compileOnly(libs.worldguard)
}
