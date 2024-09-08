plugins {
    base
}

tasks.build {
    dependsOn(subprojects.map { it.path + ":build" })
}

tasks.clean {
    dependsOn(subprojects.map { it.path + ":clean" })
}

tasks.check {
    dependsOn(subprojects.map { it.path + ":check" })
}

tasks.register("test") {
    dependsOn(subprojects.map { it.path + ":test" })
}