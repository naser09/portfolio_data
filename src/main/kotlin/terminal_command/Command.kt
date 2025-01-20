package terminal_command

import academic.Academic.Companion.academics
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Command(
    val command: String,
    val description: String,
    val category: String = "general",
    val arguments: List<String> = emptyList(),
    val examples: List<String> = emptyList(),
    val response: String = "",
    val errorResponse: String = "Command failed"
){
    companion object{
        val commandsLists = listOf(
            Command(
                command = "help",
                description = "Display help information for commands",
                category = "system",
                arguments = listOf("[command]"),
                examples = listOf(
                    "help",
                    "help ls"
                )
            ),
            Command(
                command = "history",
                description = "Display previous commands",
                category = "system",
                arguments = listOf(),
                examples = listOf(
                    "history"
                )
            ),
            Command(
                command = "echo",
                description = "Display text",
                category = "system",
                arguments = listOf(
                    "text",
                    "-n (no newline)"
                ),
                examples = listOf(
                    "echo Hello World",
                    "echo -n \"No newline\""
                )
            ),
            Command(
                command = "about",
                description = "Get information about abu naser.",
                category = "data",
                arguments = listOf(
                    "info      :(default)",
                    "skill     : show skills ",
                    "-n or n   : (Numeric list style). ",
                    "-k or key : Show json key behind data .",
                    "-i [number]     : Print item per line ."
                ),
                examples = listOf(
                    "about -n -i 3 key",
                    "about key n -i 3",
                )
            ),
            Command(
                command = "projects",
                description = "Get my project list from backend",
                category = "data",
                arguments = listOf(
                    "-n or n   : (Numeric list style). ",
                    "-k or key : Show json key behind data .",
                    "-i [number]     : Print item per line ."
                ),
                examples = listOf(
                    "project -n -i 3 key",
                    "project key n -i 3",
                )
            ),
            Command(
                command = "videos",
                description = "Get my video json from backend",
                category = "data",
                arguments = listOf(
                    "-n or n   : (Numeric list style). ",
                    "-k or key : Show json key behind data .",
                    "-i [number]     : Print item per line ."
                ),
                examples = listOf(
                    "video -n -i 3 key",
                    "video key n -i 3",
                )
            ),
            Command(
                command = "academic",
                description = "Get my academic information from backend.",
                category = "data",
                arguments = listOf(
                    "-n or n   : (Numeric list style). ",
                    "-k or key : Show json key behind data .",
                    "-i [number]     : Print item per line ."
                ),
                examples = listOf(
                    "academic -n -i 3 key",
                    "academic key n -i 3",
                )
            ),
            Command(
                command = "stacks",
                description = "Get teh tech stacks list that i use from backend.",
                category = "data",
                arguments = listOf(
                    "-n or n   : (Numeric list style). ",
                    "-k or key : Show json key behind data .",
                    "-i [number]     : Print item per line ."
                ),
                examples = listOf(
                    "stacks -n -i 3 key",
                    "stacks key n -i 3",
                )
            ),
            Command(
                command = "clear",
                description = "Clear terminal screen",
                category = "system",
                examples = listOf("clear")
            ),
            Command(
                command = "hi",
                description = "Show the welcome text",
                category = "system",
                examples = listOf("hi")
            ),
            Command(
                command = "hello",
                description = "Show the welcome text",
                category = "system",
                examples = listOf("hi")
            )
        )
        fun createJsonFile(){
            val data = Json.encodeToString(commandsLists)
            val file = File("commands.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}

class TerminalSimulator {
    private val commands = mutableMapOf<String, Command>()
    init {
        initializeCommands()
    }

    private fun initializeCommands() {
        val commandsLists = listOf(
            Command(
                command = "help",
                description = "Display help information for commands",
                category = "system",
                arguments = listOf("[command]"),
                examples = listOf(
                    "help",
                    "help ls"
                )
            ),
            Command(
                command = "echo",
                description = "Display text",
                category = "system",
                arguments = listOf(
                    "text",
                    "-n (no newline)"
                ),
                examples = listOf(
                    "echo Hello World",
                    "echo -n \"No newline\""
                )
            ),
            Command(
                command = "clear",
                description = "Clear terminal screen",
                category = "system",
                examples = listOf("clear")
            )
        )
        commandsLists.forEach { commands[it.command] = it }
    }


    fun executeCommand(input: String): String {
        val parts = input.trim().split("\\s+".toRegex())
        val commandName = parts[0].lowercase()
        val args = if (parts.size > 1) parts.subList(1, parts.size) else emptyList()

        return when (commandName) {
            "help" -> handleHelp(args)
            else -> {
                val command = commands[commandName] ?: return "Command not found: $commandName"
                when (commandName) {
                    "echo" -> args.joinToString(" ")
                    else -> command.response
                }
            }
        }
    }
    private fun handleHelp(args: List<String>): String {
        if (args.isEmpty()) {
            return generateGeneralHelp()
        }
        val commandName = args[0]
        val command = commands[commandName] ?: return "No help available for: $commandName"
        return generateCommandHelp(command)
    }
    private fun generateGeneralHelp(): String {
        return buildString {
            appendLine("╔════ Terminal Command Help ════╗")
            appendLine("║                              ║")

            // Group commands by category
            val categorizedCommands = commands.values.groupBy { it.category }

            categorizedCommands.forEach { (category, cmds) ->
                appendLine("║ ${category.uppercase()}:")
                cmds.forEach { cmd ->
                    appendLine("║  ${cmd.command.padEnd(10)} │ ${cmd.description}")
                }
                appendLine("║")
            }

            appendLine("║ For detailed help on any command:")
            appendLine("║  help <command>")
            appendLine("║")
            appendLine("║ To see commands by category:")
            appendLine("║  help --category <category>")
            appendLine("╚══════════════════════════════╝")
        }
    }


    private fun generateCommandHelp(command: Command): String {
        return buildString {
            appendLine("╔════ Command: ${command.command.uppercase()} ════╗")
            appendLine("║")
            appendLine("║ Description:")
            appendLine("║   ${command.description}")
            appendLine("║")
            if (command.arguments.isNotEmpty()) {
                appendLine("║ Arguments:")
                command.arguments.forEach { arg ->
                    appendLine("║   $arg")
                }
                appendLine("║")
            }
            if (command.examples.isNotEmpty()) {
                appendLine("║ Examples:")
                command.examples.forEach { example ->
                    appendLine("║   $ $example")
                }
                appendLine("║")
            }
            appendLine("║ Category: ${command.category}")
            appendLine("╚══════════════════════════════╝")
        }
    }
}
// Example usage:
fun main() {
    val terminal = TerminalSimulator()

    println("=== General Help ===")
    println(terminal.executeCommand("help"))

    println("\n=== Category Help ===")
    println(terminal.executeCommand("help --category files"))

    println("\n=== Command Help ===")
    println(terminal.executeCommand("help ls"))

    println(terminal.executeCommand("echo my name is abu naser"))
}