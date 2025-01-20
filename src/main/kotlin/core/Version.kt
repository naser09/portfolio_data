package core

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Version(
    val version:Long,
    val notificationVersion:Long,
){
    companion object{
        fun createJsonFile(){
            val json = Json {
                encodeDefaults = true
                ignoreUnknownKeys = true
            }
            val data = json.encodeToString(Version(2,0))
            val file = File("versions.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}
