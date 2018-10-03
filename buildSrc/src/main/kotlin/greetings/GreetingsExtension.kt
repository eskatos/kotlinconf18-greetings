package greetings

import org.gradle.api.Project
import org.gradle.kotlin.dsl.*


open class GreetingsExtension(val project: Project) {

    val greeting = project.objects.property<String>()

    val resourcePath = project.objects.property<String>()
}
