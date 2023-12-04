package com.bitcodetech.customview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioGroup


class MainActivity : AppCompatActivity() {

    private lateinit var exitButton: ExitButton
    private lateinit var chkExit: CheckBox
    private lateinit var taskView : TaskView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkExit = findViewById(R.id.chkExit)
        exitButton = findViewById(R.id.btnExit)
        taskView = findViewById(R.id.taskView)

        taskView.title = "Finish the assignments!"

        //chkExit.setOnCheckedChangeListener(MyOnChkExitCheckChangeListener())
        /*chkExit.setOnCheckedChangeListener(
            object : CompoundButton.OnCheckedChangeListener {
                override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                    exitButton.exitable = isChecked
                }
            }
        )*/

        chkExit.setOnCheckedChangeListener {
                _, isChecked -> exitButton.exitable = isChecked

        }


        /*exitButton = ExitButton(this);
        exitButton.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        setContentView(exitButton)*/

    }

    private inner class MyOnChkExitCheckChangeListener : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
            exitButton.exitable = isChecked
        }

    }
}
