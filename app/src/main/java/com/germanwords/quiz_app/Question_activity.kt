 package com.germanwords.quiz_app

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.view.View
import android.widget.Chronometer
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_question_activity.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.timer

class Question_activity : AppCompatActivity() {
    private var Name:String?=null
    private var scores:Int=0
    private  var currentPosition:Int=1
    private var questionlist:ArrayList<Questiondata>?=null
    private var selectedOption:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_activity)
        Name=intent.getStringExtra(setdata.name)
        questionlist=setdata.getquestion()



        setQuestion()

       val time=object : CountDownTimer(60000,1000){
           override fun onTick(p0: Long) {
               timer.setText(":${p0/1000}")

           }

           override fun onFinish() {
               var intent = Intent(applicationContext,ResultActivity::class.java)
               intent.putExtra(setdata.score, scores.toString())
               startActivity(intent)
               finish()

           }



       }
        time.start()
        exit.setOnClickListener{
            var intent=Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            timer.isActivated=false
            finish()
        }
        option1.setOnClickListener{
            selectedoptionstyle(option1,1)
        }
        option2.setOnClickListener{
            selectedoptionstyle(option2,2)
        }
        option3.setOnClickListener{
            selectedoptionstyle(option3,3)
        }
        option4.setOnClickListener{
            selectedoptionstyle(option4,4)
        }
        nexte.setOnClickListener {
            if (nexte.text.equals("Vorlegen")) {
                if (selectedOption != 0) {
                    val question = questionlist!![currentPosition - 1]
                    if (selectedOption != question.correct_ans) {
                        setColor(selectedOption, R.drawable.wrong_option)
                        setColor(question.correct_ans, R.drawable.correct_answer)


                    } else if (selectedOption == question.correct_ans) {
                        setColor(question.correct_ans, R.drawable.correct_answer)
                        scores++

                    }






                    selectedOption = 0

                }
                nexte.setText("Gehe zum Nächste")
            }
            else {
                val question = questionlist!![currentPosition - 1]
                setColor(question.correct_ans, R.drawable.correct_answer)
                currentPosition++
                when {
                    currentPosition <= 10 -> {
                        setQuestion()

                    }
                    else -> {
                        var intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(setdata.name, Name.toString())
                        intent.putExtra(setdata.score, scores.toString())
                        startActivity(intent)
                        finish()
                    }
                }
                selectedOption = 0
                nexte.setText("Vorlegen")
            }
        }

    }

    fun setColor(opt:Int,color:Int){
        when(opt){
            1->{
                option1.background=ContextCompat.getDrawable(this,color)

            }
            2->{
                option2.background=ContextCompat.getDrawable(this,color)

            }
            3->{
                option3.background=ContextCompat.getDrawable(this,color)

            }
            4->{
                option4.background=ContextCompat.getDrawable(this,color)

            }

        }
    }

     fun setQuestion() {
         val question=questionlist!!.random()
         setOptionStyle()
         progress.progress=currentPosition
         progress.max=10

         frage.text="Frage ${currentPosition}"+"/"+"${10}"
         option1.text=question.option_one
         option2.text=question.option_two
         option3.text=question.option_three
         option4.text=question.option_four
         Glide.with(this).load(question.question).into(question_)
         questionlist!!.remove(question)

    }
    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,option1)
        optionList.add(1,option2)
        optionList.add(2,option3)
        optionList.add(3,option4)

        for (op in optionList)
        {
            op.background=ContextCompat.getDrawable(this,R.drawable.option_1)
            op.typeface= Typeface.DEFAULT
        }

    }
    fun selectedoptionstyle(view:TextView,opt:Int){
        setOptionStyle()
        selectedOption=opt
        view.background=ContextCompat.getDrawable(this,R.drawable.selected_option)
        view.typeface= Typeface.DEFAULT_BOLD
    }
}