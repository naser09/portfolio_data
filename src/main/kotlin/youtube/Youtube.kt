package youtube

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class VideoItem(
    val srcId:String,
    val title: String,
    val category:String, //or playlist name .
    val fullSrcUrl:String?=null,
    val width: String?=null,
    val height: String? = null
){
    companion object{
        fun createJsonFile(){
            val youtube = Json.encodeToString(videoItems)
            val videoFile = File("videos.json")
            if (videoFile.exists()){
                videoFile.delete()
            }
            videoFile.writeText(youtube)
        }
        val videoItems = listOf(
            // Playlist: Kotlin Fundamental Tutorial
            VideoItem("YZcnl3OMgZQ", "[Bangla] Kotlin Fundamentals for Beginners - Part 1: Getting Started by running kotlin in everywhere", "kotlin fundamental tutorial"),
            VideoItem("56Tv3fZ83y0", "[Bangla] Kotlin Fundamentals for Beginners - Part 2: Variable ,Data Types ,Null,Conditions in kotlin", "kotlin fundamental tutorial"),
            VideoItem("BOeC9QZFmUQ", "[Bangla] Kotlin Fundamentals for Beginners - Part 3: Collections ,Functions and Class in kotlin.", "kotlin fundamental tutorial"),
            VideoItem("DMxNXOEmeLI", "[Bangla] Kotlin Fundamentals for Beginners - Part 4 : Interface,sealed class,extension func, generic", "kotlin fundamental tutorial"),

            // Playlist: Complete Note App with Kotlin Multiplatform (completed)
            VideoItem("RJhR9oPOrj0", "[ Bangla ] Building a Complete Notepad App using Kotlin Multiplatform Mobile : Part 1 - Introduction", "Complete note app with kotlin multiplatform (completed)"),
            VideoItem("xhd3CvGx9gs", "[Bangla] Building a Complete Notepad App using Kotlin Multiplatform Mobile :Part 2 - database setup", "Complete note app with kotlin multiplatform (completed)"),
            VideoItem("XXb5hv2KL3o", "[Bangla] Building a Complete Notepad App using Kotlin Multiplatform Mobile:Part3- Decompose Library", "Complete note app with kotlin multiplatform (completed)"),
            VideoItem("8w1dw5zJyRo", "[ Bangla ] Building a Complete Notepad App using Kotlin Multiplatform Mobile : Part 4 - Revision", "Complete note app with kotlin multiplatform (completed)"),
            VideoItem("Ao1ju5pTCJE", "[ Bangla ] Building a Complete Notepad App using Kotlin Multiplatform Mobile : Part 5 - IOS Swift UI", "Complete note app with kotlin multiplatform (completed)"),
            VideoItem("qrHuSZvRNNs", "[ Bangla ] Building a Complete Notepad App using Kotlin Multiplatform Mobile : Part 6 - Android UI", "Complete note app with kotlin multiplatform (completed)"),
            VideoItem("tq9pyp5icFo", "[ Bangla ] Building a Complete Notepad App using Kotlin Multiplatform Mobile : Part 7 - MviKotlin", "Complete note app with kotlin multiplatform (completed)"),

            // Playlist: [Bangla] Coroutine Mastery
            VideoItem("RaAcF5Mn1Nk", "[Bangla] Coroutine Mastery Part 1: Introduction to Asynchronous Programming, Thread, and Coroutine", "[bangla] Coroutine Mastery"),
            VideoItem("_uOxABTOjoI", "[Bangla] Coroutine Mastery Part 2:Understanding coroutine's builder function and suspend function.", "[bangla] Coroutine Mastery"),
            VideoItem("b-LapHUPkF8", "[Bangla] Coroutine Mastery Part 3: Deep dive into suspend function", "[bangla] Coroutine Mastery"),
            VideoItem("rXkLJ21WLxk", "[Bangla] Coroutine Mastery Part 5: Introduction Coroutine channel and flow .", "[bangla] Coroutine Mastery"),
            VideoItem("m_8UuNTavA0", "[Bangla] Coroutine Mastery Part 4: Introduction to coroutine context , scope and supervisor scope", "[bangla] Coroutine Mastery"),
            VideoItem("mzsmpyJDvpM", "[Bangla] Coroutine Mastery Part 6: Deep dive into flow", "[bangla] Coroutine Mastery"),
            VideoItem("UP3d3ultEmc", "[Bangla] Complete Android File Manager App with Jetpack Compose,Coroutines,and Permissions Handling.", "[bangla] Coroutine Mastery"),

            // Playlist: Build a Chat App with Kotlin Multiplatform (incompleted)
            VideoItem("vUnwH7OoPbk", "[Bangla] Building a Multiplatform Chat App with Kotlin Ktor-1:System Design and Introduction to Ktor", "Build a chat app with kotlin multiplatform (incompleted)"),
            VideoItem("0RNTC4VkouI", "[Bangla] Building a Multiplatform Chat App with Kotlin Ktor Part-2 : ktor basic authentication", "Build a chat app with kotlin multiplatform (incompleted)"),
            VideoItem("ksgC-PXMLpM", "[Bangla] Building a Multiplatform Chat App with Kotlin Ktor Part-3 :Database table using Exposed lib", "Build a chat app with kotlin multiplatform (incompleted)"),
            VideoItem("KlGCg3cSh7Q", "[Bangla] Building a Multiplatform Chat App with Kotlin Ktor Part-4 :Group Repository And Table.", "Build a chat app with kotlin multiplatform (incompleted)"),

            // Playlist: Web Development with Kotlin
            VideoItem("8ArUQleC4pI", "[Bangla]Web Dev with Kotlin Multiplatform & Compose | Setup gradle project & GitHub Hosting Tutorial", "web development with kotlin"),
            VideoItem("w8hDnTXV6n4", "Web Development with Kotlin Multiplatform & Compose | Setup gradle project & GitHub Hosting Tutorial", "web development with kotlin")
        )
    }
}