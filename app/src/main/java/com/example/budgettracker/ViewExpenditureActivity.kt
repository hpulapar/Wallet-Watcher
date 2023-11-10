package com.example.budgettracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.expense_layout_page.*


class ViewExpenditureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expense_layout_page)

        val enteredValue = intent.getStringExtra("enteredValue")
        budget_view.text = enteredValue
    }

}