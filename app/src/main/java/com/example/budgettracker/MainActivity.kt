package com.example.budgettracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enter_budget_button.setOnClickListener{
            val intent = Intent(this, EnterBudgetActivity::class.java)
            startActivity(intent)
        }

        view_expenditure_button.setOnClickListener{
            val intent = Intent(this, ViewExpenditureActivity::class.java)
            startActivity(intent)
        }
    }
}