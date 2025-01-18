package model
import kotlinx.serialization.Serializable

@Serializable
data class Svg(
    val viewBox:String,
    val d:String
)
