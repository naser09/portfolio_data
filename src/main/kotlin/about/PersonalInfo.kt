package about

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class PersonalInfo(
    val label: String,
    val value: String
) {
    companion object {
        val personalInfo = listOf(
                PersonalInfo("Name", "Abu Naser"),
                PersonalInfo("Location", "1440,Sonargoan,Narayanganj"),
                PersonalInfo("Country", "Bangladesh"),
                PersonalInfo("Email", "naser09@gmail.com"),
                PersonalInfo("Languages", "English, Bengali"),
                PersonalInfo("Experience", "5+ years in Kotlin Development (self-taught)")
            )

        fun createJsonFile(){
            val data = Json.encodeToString(personalInfo)
            val file = File("about_info.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}

