package about

import academic.Academic.Companion.academics
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Skill(
    val name: String,
    val proficiency: Int, // 0-100
    val description: String
) {
    companion object {
        val skills = listOf(
            Skill("Kotlin", 90, "Expert in Kotlin development with focus on multiplatform projects"),
            Skill("Android", 90, "Professional Android app development experience"),
            Skill("Compose", 80, "Strong expertise in Jetpack Compose and Compose Multiplatform"),
            Skill("Web Development", 75, "Full-stack development using Kotlin/JS and KobWeb")
        )

        fun createJsonFile(){
            val data = Json.encodeToString(skills)
            val file = File("about_skill.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}