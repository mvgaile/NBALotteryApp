package com.example.nbalottery


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("START", "START")
        Log.d("START", "START")
        Log.d("START", "START")
        Log.d("START", "START")
        Log.d("START", "START")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simButton: Button = findViewById<Button>(R.id.sim)
        var winnerText: TextView = findViewById(R.id.winner)
        var restText: TextView = findViewById(R.id.rest)
        simButton.setOnClickListener {
            getLottery() {myLot ->

                var lines = ""
                lines += "02. ${myLot.p2}\n"
                lines += "03. ${myLot.p3}\n"
                lines += "04. ${myLot.p4}\n"
                lines += "05. ${myLot.p5}\n"
                lines += "06. ${myLot.p6}\n"
                lines += "07. ${myLot.p7}\n"
                lines += "08. ${myLot.p8}\n"
                lines += "09. ${myLot.p9}\n"
                lines += "10. ${myLot.p10}\n"
                lines += "11. ${myLot.p11}\n"
                lines += "12. ${myLot.p12}\n"
                lines += "13. ${myLot.p13}\n"
                lines += "14. ${myLot.p14}\n"
                lines += "15. ${myLot.p15}\n"
                lines += "16. ${myLot.p16}\n"
                lines += "17. ${myLot.p17}\n"
                lines += "18. ${myLot.p18}\n"
                lines += "19. ${myLot.p19}\n"
                lines += "20. ${myLot.p20}\n"
                lines += "21. ${myLot.p21}\n"
                lines += "22. ${myLot.p22}\n"
                lines += "23. ${myLot.p23}\n"
                lines += "24. ${myLot.p24}\n"
                lines += "25. ${myLot.p25}\n"
                lines += "26. ${myLot.p26}\n"
                lines += "27. ${myLot.p27}\n"
                lines += "28. ${myLot.p28}\n"
                lines += "29. ${myLot.p29}\n"
                lines += "30. ${myLot.p30}\n"
                Log.d("lines", lines)
                runOnUiThread {
                    winnerText.text = myLot.p1
                    restText.text = lines
                }
            }
        }
    }
}