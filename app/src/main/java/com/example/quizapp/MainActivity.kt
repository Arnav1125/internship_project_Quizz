package com.example.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var quizzModList: MutableList<QuizzMod>
    private lateinit var adapter: QuizListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        quizzModList= mutableListOf()
        getDataFromfirebase()
    }
    private fun setupRecyclerView(){
        adapter= QuizListAdapter(quizzModList)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=adapter

    }
private fun getDataFromfirebase(){

    val listQuestionModel= mutableListOf<QuestionModel>()
    listQuestionModel.add(QuestionModel("What is Katlin?", mutableListOf("A new version of Java.","A JavaScript framework.","A statically-typed programming language for the JVM, Android, and browse","A database management system"),"A statically-typed programming language for the JVM, Android, and browse"))
    listQuestionModel.add(QuestionModel("Which platform does Kotlin primarily target?", mutableListOf("Python Bytecode","JavaScript","JVM","PHP")," JVM"))
    listQuestionModel.add(QuestionModel(" Are semicolons (;) mandatory at the end of code statements in Kotlin?", mutableListOf("False","True")," false"))



    setupRecyclerView()
}


}