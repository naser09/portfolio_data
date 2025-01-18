package terminal_command

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Command(
    val name: String,
    val description: String
){
    companion object{
        const val fullText ="Welcome to my portfolio! I'm a passionate self-taught Kotlin Multiplatform developer with a knack for building cross-platform apps that work seamlessly on Android, iOS, web, and desktop.\n" +
                "\n" +
                "Here, you’ll find projects that showcase my journey, skills, and dedication to creating efficient, user-friendly, and visually appealing applications. Whether it’s crafting intuitive UIs, optimizing backend logic, or exploring new technologies, I’m always eager to learn and improve.\n" +
                "\n" +
                "Feel free to explore my work and reach out if you’d like to collaborate or learn more about what I do!"

        val commandsList = listOf(
            Command("help", "Available commands: help, clear, about, projects, hi/hello"),
            Command("hi", fullText),
            Command("hello", fullText),
            Command("about", "I'm a software developer passionate about Kotlin and Android development."),
            Command("projects", "1. Project A - Android App\n2. Project B - Web Application"),
            Command("clear", "CLEAR_COMMAND")
        )

        fun createJsonFile(){
            val commands = Json.encodeToString(Command.commandsList)
            val commandsFile = File("commands.json")
            if (commandsFile.exists()){
                commandsFile.delete()
            }
            commandsFile.writeText(commands)
        }
    }
}
