package projects

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Project(
    val title: String,
    val description: String,
    val technologies: List<String>,
    val type: ProjectType,
    val releaseLink: String? = null,
    val githubLink: String? = null,
    val images: List<String> // Updated to support multiple images
){
    companion object{
        val projects = listOf(
            Project(
                title = "Lineage note: Cherry tree notes",
                description = "A note-taking app with a focus on streamlined navigation and modern design.",
                technologies = listOf(
                    "androidx navigation", "jetpack compose", "admob", "Material 3",
                    "room database", "shared preference", "multi-module",
                    "scoped storage", "GSON", "MVVM architecture"
                ),
                type = ProjectType.PRODUCTION,
                releaseLink = "https://play.google.com/store/apps/details?id=com.blogspot.lineagenote",
                githubLink = null,
                images = listOf()
            ),
            Project(
                title = "PDF Tools: Web2PDF, Merge, Split",
                description = "A comprehensive PDF utility app for creating and managing PDF files.",
                technologies = listOf(
                    "androidx", "jetpack compose", "Material 3", "shared preference",
                    "multi-module", "MVVM architecture", "web view", "PDF Box"
                ),
                type = ProjectType.PRODUCTION,
                releaseLink = "https://play.google.com/store/apps/details?id=com.blogspot.web2pdf",
                githubLink = null,
                images = listOf() // Add image URLs here if available
            ),    Project(
                title = "KMP Note Pad app with YouTube playlist",
                description = "An Kotlin Multiplatform app with a complete development tutorial available on YouTube.",
                technologies = listOf(
                    "kotlin", "swift", "xcode", "android studio", "kotlin multiplatform",
                    "sqlDelight", "decompose", "RxKotlin", "coroutine", "MviKotlin",
                    "swift UI", "multiplatform setting"
                ),
                type = ProjectType.YOUTUBE,
                releaseLink = "https://www.youtube.com/playlist?list=PLXzlJ385171s7A9iEngwx3b2RlCRAbqqy",
                githubLink = null,
                images = listOf()
            ),
            Project(
                "Ktor Backend Chat server for youtube video ,",
                "A ktor backend server created to demonstrate how it work in my youtube video ,",
                listOf("Kotlin", "Ktor", "SQLDelight", "kotlinX serialization","web socket"),
                ProjectType.YOUTUBE,
                releaseLink = "https://www.youtube.com/playlist?list=PLXzlJ385171vyDDz2eliB1CWp-FMFX06x",
                githubLink = "https://github.com/naser09/chat_server_yt.git",
                images = listOf(
                    "projects/kmpcommerce1.png",
                    "projects/kmpcommerce2.png",
                    "projects/kmpcommerce3.png"
                )
            ),
            Project(
                "Kotlin multiplatform MCQ Apps",
                "A kotlin multiplatform mcq app that uses ktor backend and authenticate users .",
                listOf("Ktor", "PostgreSQL", "Redis", "Docker"),
                ProjectType.PET_PROJECT,
                githubLink = "https://github.com/naser09/MCQ_KMP.git",
                images = listOf(
                    "projects/ktor1.png",
                    "projects/ktor2.png"
                )
            ),
            Project(
                "Laravel 10 with multiple authentication & authorization .",
                "A kotlin multiplatform mcq app that uses ktor backend and authenticate users .",
                listOf("Laravel 10", "PostgreSQL", "Blade Template", "PHP" , "Tailwind Css" ,"npm"),
                ProjectType.PET_PROJECT,
                githubLink = "https://github.com/naser09/laravel10_multi_auth.git",
                images = listOf(
                    "projects/ktor1.png",
                    "projects/ktor2.png"
                )
            ),
        )
        fun createJsonFile(){
            val json = Json {
                encodeDefaults = true
                ignoreUnknownKeys = true
            }
            val data = json.encodeToString(projects)
            val file = File("projects.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}

@Serializable
enum class ProjectType {
    PRODUCTION, OPEN_SOURCE, PET_PROJECT, FREELANCE , YOUTUBE ,IN_PROGRESS
}
