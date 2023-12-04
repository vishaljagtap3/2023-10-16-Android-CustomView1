package com.bitcodetech.customview1

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.Button

@SuppressLint("AppCompatCustomView")
class ExitButton(context: Context, attributes: AttributeSet?) : Button(context, attributes) {

    var exitable : Boolean = true

    init {
        this.setOnClickListener {
            if(exitable) {
                System.exit(0)
            }
        }
    }

    constructor(context: Context) : this(context, null)


}

