package com.example.quizapp

data class QuizzMod(
    val id:String,
    val title: String,
    val substitle:String,
    val time:String,
    val questionList: List<QuestionModel>

){
    constructor(): this("","","","", emptyList())
}
data class QuestionModel(
    val question:String,
    val options:List<String>,
    val correct :String,
){
    constructor():this("", emptyList(),"")
}
