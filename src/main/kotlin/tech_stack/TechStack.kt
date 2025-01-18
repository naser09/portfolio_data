package tech_stack

import academic.Academic.Companion.academics
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import model.Svg
import java.io.File

@Serializable
 data class Technology(
    val name: String,
    val proficiency: Proficiency,
    val category: TechCategory,
    val description: String,
    val experienceYears: Float,
    val iconPath: String? = null,
    val svg: Svg?=null
){
    companion object{
        val technologies = listOf(
            // Languages
            Technology(
                "Kotlin",
                Proficiency.EXPERT,
                TechCategory.LANGUAGES,
                "Primary language for Android, KMP, and backend development. Extensive experience in coroutines and flow.",
                5.5f
            ),
            Technology(
                "Java",
                Proficiency.ADVANCED,
                TechCategory.LANGUAGES,
                "Used for Android development and backend services. Strong knowledge of Java 8+ features.",
                2.0f,
            ),
            Technology(
                "Python",
                Proficiency.INTERMEDIATE,
                TechCategory.LANGUAGES,
                "Basic problem solving and a single django project",
                0.6f,
            ),
            Technology(
                "Swift",
                Proficiency.BEGINNER,
                TechCategory.LANGUAGES,
                "Basic problem solving and some api that required in KMP projects",
                0.6f,
            ),
            Technology(
                "PHP",
                Proficiency.INTERMEDIATE,
                TechCategory.LANGUAGES,
                "Basic knowledge about PHP",
                0.8f,
            ),

            // Mobile Development
            Technology(
                "Jetpack Compose",
                Proficiency.EXPERT,
                TechCategory.MOBILE,
                "Modern Android UI development with declarative paradigm. Built multiple production apps.",
                3.0f,
                iconPath = "icons/compose.webp"
            ),
            Technology(
                "Swift UI",
                Proficiency.BEGINNER,
                TechCategory.MOBILE,
                "Modern iOS UI development with declarative paradigm. Built basic apps with it.",
                3.0f,
            ),
            Technology(
                "Android SDK",
                Proficiency.EXPERT,
                TechCategory.MOBILE,
                "Comprehensive knowledge of Android framework, lifecycle, and architecture components.",
                5.5f,
            ),
            Technology(
                "KMP",
                Proficiency.EXPERT,
                TechCategory.MOBILE,
                "Kotlin Multiplatform for shared logic between Android and iOS applications.",
                2.5f,
                iconPath = "icons/kotlin.svg"
            ),

            // Backend
            Technology(
                "Ktor",
                Proficiency.EXPERT,
                TechCategory.BACKEND,
                "Building scalable backend services and RESTful APIs with Kotlin.",
                3.5f,
            ),
            Technology(
                "Laravel",
                Proficiency.INTERMEDIATE,
                TechCategory.BACKEND,
                "Java-based framework for creating microservices and web applications.",
                3.0f,
            ),
            Technology(
                "GraphQL",
                Proficiency.INTERMEDIATE,
                TechCategory.BACKEND,
                "API development with GraphQL for flexible data querying.",
                1.5f
            ),

            // Database
            Technology(
                "PostgreSQL",
                Proficiency.INTERMEDIATE,
                TechCategory.DATABASE,
                "Primary database for production applications. Experience with performance optimization.",
                4.0f,
                iconPath = "icons/sql.svg"
            ),
            Technology(
                "MySQL",
                Proficiency.ADVANCED,
                TechCategory.DATABASE,
                "Primary database for production applications. Experience with performance optimization.",
                4.0f,
                iconPath = "icons/sql.svg"
            ),
            Technology(
                "MongoDB",
                Proficiency.INTERMEDIATE,
                TechCategory.DATABASE,
                "NoSQL database for flexible data storage needs.",
                2.0f,
                iconPath = "icons/db.svg"
            ),
            Technology(
                "Redis",
                Proficiency.ADVANCED,
                TechCategory.DATABASE,
                "In-memory data structure store used for caching and real-time data.",
                3.0f,
                iconPath = "icons/db.svg"
            ),

            // Cloud & DevOps
            Technology(
                "Docker",
                Proficiency.BEGINNER,
                TechCategory.CLOUD,
                "Containerization for microservices and application deployment.",
                3.0f,
            ),
            Technology(
                "Github Actions",
                Proficiency.BEGINNER,
                TechCategory.CLOUD,
                "Understand and to the bare minimum about GitHub Actions. check this website repo > kobweb_latest branch .",
                2.0f,
            ),
            Technology(
                "VPS Server",
                Proficiency.ADVANCED,
                TechCategory.CLOUD,
                "Have Experience on running a vps server with Debian and ubuntu.",
                3.5f,
            ),

            // Frontend
            Technology(
                "HTML/CSS",
                Proficiency.ADVANCED,
                TechCategory.FRONTEND,
                "Web development fundamentals with modern CSS features.",
                4.0f,
            ),

            // Tools
            Technology(
                "Git",
                Proficiency.INTERMEDIATE,
                TechCategory.TOOLS,
                "Version control and collaboration with Git and GitHub.",
                5.0f,
            ),
            Technology(
                "CI/CD",
                Proficiency.BEGINNER,
                TechCategory.TOOLS,
                "Automated testing and deployment pipelines with Jenkins and GitHub Actions.",
                3.5f,
            ),
            Technology(
                "Gradle",
                Proficiency.EXPERT,
                TechCategory.TOOLS,
                "Build automation and dependency management for JVM projects.",
                4.0f
            )
        )

        fun createJsonFile(){
            val data = Json.encodeToString(technologies)
            val file = File("technologies.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}

@Serializable
 enum class TechCategory(val displayName: String) {
    LANGUAGES("Languages"),
    MOBILE("Mobile"),
    BACKEND("Backend"),
    DATABASE("Database"),
    CLOUD("Cloud & DevOps"),
    FRONTEND("Frontend"),
    TOOLS("Tools")
}
@Serializable
data class Color(
    val red:Int,
    val green:Int,
    val blue:Int,
    val alpha:Float
)
@Serializable
 enum class Proficiency(val displayName: String, val darkColor: Color, val lightColor: Color) {
    EXPERT("Expert",
        darkColor = Color(22, 163, 74, 0.3f),
        lightColor = Color(22, 163, 74, 0.2f)
    ),
    ADVANCED("Advanced",
        darkColor = Color(234, 88, 12, 0.3f),
        lightColor = Color(234, 88, 12, 0.2f)
    ),
    INTERMEDIATE("Intermediate",
        darkColor = Color(234, 179, 8, 0.3f),
        lightColor = Color(234, 179, 8, 0.2f)
    ),
    BEGINNER("Learning",
        darkColor = Color(59, 130, 246, 0.3f),
        lightColor = Color(59, 130, 246, 0.2f)
    )
}


