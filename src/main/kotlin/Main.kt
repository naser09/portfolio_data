import about.PersonalInfo
import about.Skill
import academic.Academic
import projects.Project
import tech_stack.Technology
import terminal_command.Command
import youtube.VideoItem

fun main() {
//    Command.createJsonFile()
    Command.createJsonFile()
    VideoItem.createJsonFile()
    Project.createJsonFile()
    Technology.createJsonFile()
    PersonalInfo.createJsonFile()
    Academic.createJsonFile()
    Skill.createJsonFile()
    println("Completed")
    println("new line")
}