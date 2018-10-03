package greetings

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

import org.gradle.kotlin.dsl.*

open class GenerateGreetingsResource : DefaultTask() {

    @Input
    val greeting = project.objects.property<String>()

    @OutputFile
    val outputFile = project.objects.fileProperty()

    @TaskAction
    fun generateGreetingsResource() =
            outputFile.asFile.get().apply {
                parentFile.mkdirs()
                writeText(greeting.get())
            }
}