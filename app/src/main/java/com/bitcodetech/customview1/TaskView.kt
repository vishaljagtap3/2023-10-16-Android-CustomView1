package com.bitcodetech.customview1

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.textservice.TextInfo
import android.widget.TextView

class TaskView(
    context: Context,
    attributeSet: AttributeSet?
) : androidx.appcompat.widget.AppCompatTextView(context, attributeSet) {

    constructor(context: Context) : this(context, null)

    init {
        setPadding(120, 0, 0, 0)

        setOnClickListener {
            isDone = !isDone
        }
    }

    var title : String = ""
        set(value) {
            field = value
            text = field
        }

    var isDone : Boolean = false
        set(value) {
            field = value
            if(field) {
                setBackgroundColor(Color.GREEN)
            }
            else {
                setBackgroundColor(Color.LTGRAY)
            }
        }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        Log.e("tag", "onDraw: TaskView")
        val paint = Paint()
        paint.strokeWidth = 6F
        paint.color = Color.RED
        canvas.drawLine(100F, 0F, 100F, height.toFloat(), paint)
        canvas.drawLine(120F, 0F, 120F, height.toFloat(), paint)

        paint.color = Color.BLACK
        canvas.drawLine(0F, height.toFloat(), width.toFloat(), height.toFloat(), paint)
    }
}









