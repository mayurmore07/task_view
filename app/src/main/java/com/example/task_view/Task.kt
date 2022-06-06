package com.example.task_view

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import java.util.*
import java.util.jar.Attributes

@SuppressLint("AppCompatCustomView")
class Task(context: Context, attributes: AttributeSet?):TextView(context,attributes){

    private var paint=Paint()
    var taskstatus=false

    set(value){
        field=value
        if (field){
            setTextColor(Color.RED)
        }
        else{
            setTextColor(Color.GREEN)
        }
    }



    init {
        setTextColor(Color.GREEN)


        setOnClickListener{
            taskstatus=!taskstatus
        }
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.strokeWidth=10f
        canvas?.drawLine(90f,0f,90f,90f,paint)
        canvas?.drawLine(110f,0f,110f,110f,paint)

    }
}
