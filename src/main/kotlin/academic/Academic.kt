package academic

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Academic(
    val years: String,
    val name: String,
    val institute: String,
    val instituteLocation: String,
    val subjects: List<String>,
    val cgpa: String,
    val description: String,
    val roleNumber: String,
    val verifyResultLink: String
){
    companion object{
        val academics = listOf(
                Academic(
                    years = "2018-2021",
                    name = "Diploma in Computer Technology",
                    institute = "Cumilla Polytechnic Institute",
                    instituteLocation = "Cumilla, Bangladesh",
                    subjects = listOf("Programming", "Database Management", "Web Development", "Computer Networks"),
                    cgpa = "3.56 out of 4.0",
                    description = "Specialized in software development with focus on modern programming languages and web technologies.",
                    roleNumber = "role: 937535 year: 2021 Exam-Type: Diploma in Engineering",
                    verifyResultLink = "http://180.211.162.102:8444/result_arch/"
                ),
                Academic(
                    years = "2017-2018",
                    name = "Higher Secondary Certificate/HSC/Alim",
                    institute = "Sadipur Islamia Senior Alim Madrasah",
                    instituteLocation = "Sonargoan,Narayanganj,Dhaka",
                    subjects = listOf("Arabic", "Bangla", "History", "Mathematics","General Study"),
                    cgpa = "4.65 out of 5.0",
                    description = "Completed HSC with distinction in Science group, focusing on computer science and mathematics.",
                    roleNumber = "HSC14-456",
                    verifyResultLink = "http://www.educationboardresults.gov.bd"
                ),
                Academic(
                    years = "2015-2016",
                    name = "SSC/Dhakil Examination",
                    institute = "Sadipur Islamia Senior Alim Madrasah",
                    instituteLocation = "Sonargoan,Narayanganj,Dhaka",
                    subjects = listOf("Arabic", "Bangla", "History", "Mathematics","General Study"),
                    cgpa = "4.45 out of 5.0",
                    description = "Completed Dhakil Examination in 2015-16 sessions .",
                    roleNumber = "role:104025",
                    verifyResultLink = "http://www.educationboardresults.gov.bd"
                )
            )
        fun createJsonFile(){
            val data = Json.encodeToString(academics)
            val file = File("academic.json")
            if (file.exists()){
                file.delete()
            }
            file.writeText(data)
        }
    }
}