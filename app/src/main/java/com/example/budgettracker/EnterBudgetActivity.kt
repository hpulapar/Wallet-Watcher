package com.example.budgettracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.budget_layout_page.*

class EnterBudgetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.budget_layout_page)


        budget_submit_button.setOnClickListener{

            val enteredValue = view_entering_budget.text.toString()
            val intent =  Intent(this, ViewExpenditureActivity::class.java)
            intent.putExtra("enteredValue", enteredValue)
            startActivity(intent)
        }


    }
}