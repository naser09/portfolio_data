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
    val iconUrl:String?=null,
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
                svg = Svg(
                    fill = "#e76f00",
                    viewBox = "-118.513 4.399 540.906 540.906",
                    d = "M285.104 430.945h-2.037v-1.14h5.486v1.14h-2.025v5.688h-1.424v-5.688zm10.942.297h-.032l-2.02 5.393h-.924l-2.006-5.393h-.024v5.393h-1.343v-6.828h1.976l1.86 4.835 1.854-4.835h1.969v6.828h-1.311l.001-5.393z\" fill=\"#e76f00\"/><path d=\"M102.681 291.324s-14.178 8.245 10.09 11.035c29.4 3.354 44.426 2.873 76.825-3.259 0 0 8.518 5.341 20.414 9.967-72.63 31.128-164.376-1.803-107.329-17.743M93.806 250.704s-15.902 11.771 8.384 14.283c31.406 3.24 56.208 3.505 99.125-4.759 0 0 5.937 6.018 15.271 9.309-87.815 25.678-185.624 2.025-122.78-18.833\" fill=\"#5382a1\"/><path d=\"M168.625 181.799c17.896 20.604-4.701 39.146-4.701 39.146s45.439-23.458 24.571-52.833c-19.491-27.395-34.438-41.005 46.479-87.934.001-.001-127.013 31.721-66.349 101.621\" fill=\"#e76f00\"/><path d=\"M264.684 321.369s10.492 8.646-11.555 15.333c-41.923 12.7-174.488 16.535-211.314.507-13.238-5.76 11.587-13.752 19.396-15.429 8.144-1.766 12.798-1.437 12.798-1.437-14.722-10.371-95.157 20.363-40.857 29.166 148.084 24.015 269.944-10.814 231.532-28.14M109.499 208.617s-67.431 16.016-23.879 21.832c18.389 2.462 55.047 1.905 89.192-.956 27.906-2.354 55.928-7.358 55.928-7.358s-9.84 4.214-16.959 9.074c-68.475 18.01-200.756 9.631-162.674-8.79 32.206-15.568 58.392-13.802 58.392-13.802M230.462 276.231c69.608-36.171 37.425-70.932 14.96-66.248-5.506 1.146-7.961 2.139-7.961 2.139s2.045-3.202 5.947-4.588c44.441-15.624 78.619 46.081-14.346 70.521 0 0 1.079-.962 1.4-1.824\" fill=\"#5382a1\"/><path d=\"M188.495 4.399s38.55 38.562-36.563 97.862c-60.233 47.567-13.735 74.689-.025 105.678-35.158-31.723-60.96-59.647-43.65-85.637 25.406-38.151 95.792-56.648 80.238-117.903\" fill=\"#e76f00\"/><path d=\"M116.339 374.246c66.815 4.277 169.417-2.373 171.846-33.987 0 0-4.67 11.984-55.219 21.503-57.027 10.731-127.364 9.479-169.081 2.601.002-.002 8.541 7.067 52.454 9.883\" fill=\"#5382a1\"/><path d=\"M105.389 495.049c-6.303 5.467-12.96 8.536-18.934 8.536-8.527 0-13.134-5.113-13.134-13.314 0-8.871 4.937-15.357 24.739-15.357h7.328l.001 20.135m17.392 19.623V453.93c0-15.518-8.85-25.756-30.188-25.756-12.457 0-23.369 3.076-32.238 6.999l2.56 10.752c6.983-2.563 16.022-4.949 24.894-4.949 12.292 0 17.58 4.949 17.58 15.181v7.678h-6.135c-29.865 0-43.337 11.593-43.337 28.993 0 15.018 8.878 23.554 25.594 23.554 10.745 0 18.766-4.437 26.264-10.929l1.361 9.221 13.645-.002zM180.824 514.672h-21.691l-26.106-84.96h18.944l16.198 52.199 3.601 15.699c8.195-22.698 13.992-45.726 16.891-67.898h18.427c-4.938 27.976-13.822 58.684-26.264 84.96M264.038 495.049c-6.315 5.467-12.983 8.536-18.958 8.536-8.512 0-13.131-5.113-13.131-13.314 0-8.871 4.947-15.357 24.748-15.357h7.341v20.135m17.39 19.623V453.93c0-15.518-8.871-25.756-30.186-25.756-12.465 0-23.381 3.076-32.246 6.999l2.557 10.752c6.985-2.563 16.041-4.949 24.906-4.949 12.283 0 17.579 4.949 17.579 15.181v7.678h-6.146c-29.873 0-43.34 11.593-43.34 28.993 0 15.018 8.871 23.554 25.584 23.554 10.752 0 18.77-4.437 26.28-10.929l1.366 9.221 13.646-.002zM36.847 529.099c-4.958 7.239-12.966 12.966-21.733 16.206L6.527 535.2c6.673-3.424 12.396-8.954 15.055-14.104 2.3-4.581 3.252-10.485 3.252-24.604v-96.995h18.478v95.666c-.001 18.875-1.51 26.5-6.465 33.936"
                )
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


