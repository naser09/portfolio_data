package model
import kotlinx.serialization.Serializable

@Serializable
data class Svg(
    val viewBox: String,
    val d: String,
    val fill: String? = null,
    val stroke: String? = null,
    val strokeWidth: Float? = null,
)