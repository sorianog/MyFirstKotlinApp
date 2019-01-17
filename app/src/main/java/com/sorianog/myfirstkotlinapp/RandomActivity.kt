package com.sorianog.myfirstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0

        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        random_num_label.text = Integer.toString(randomInt)
        title_label.text= getString(R.string.random_heading, count)
    }
}
