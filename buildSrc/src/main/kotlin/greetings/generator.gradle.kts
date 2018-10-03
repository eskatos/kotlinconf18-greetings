package greetings

val greetings = extensions.create<GreetingsExtension>("greetings", project)

tasks.register<GenerateGreetingsResource>("generateGreetings") {
    greeting.set(greetings.greeting)
    val generatedResourcesDir = layout.buildDirectory.dir("generated-resources/main/greetings")
    outputFile.set(generatedResourcesDir.map { it.file(greetings.resourcePath.get()) })
    project.the<SourceSetContainer>()["main"].output.dir(generatedResourcesDir, "builtBy" to this)
}
