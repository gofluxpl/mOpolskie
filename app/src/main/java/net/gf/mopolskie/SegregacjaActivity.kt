package net.gf.mopolskie

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class SegregacjaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segregacja)

        window.statusBarColor = resources.getColor(R.color.status_bar_color, theme)
        window.decorView.systemUiVisibility = 0

        val HelpButton = findViewById<LinearLayout>(R.id.help)
        HelpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val MainButton = findViewById<LinearLayout>(R.id.pulpit)
        MainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val ServicesButton = findViewById<LinearLayout>(R.id.services)
        ServicesButton.setOnClickListener {
            val intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val MoreButton = findViewById<LinearLayout>(R.id.more)
        MoreButton.setOnClickListener {
            val intent = Intent(this, MoreActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val BlackButton = findViewById<LinearLayout>(R.id.black)
        BlackButton.setOnClickListener {
            val intent = Intent(this, SegregacjaBlackActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val BrownButton = findViewById<LinearLayout>(R.id.brown)
        BrownButton.setOnClickListener {
            val intent = Intent(this, SegregacjaBrownActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val BlueButton = findViewById<LinearLayout>(R.id.blue)
        BlueButton.setOnClickListener {
            val intent = Intent(this, SegregacjaBlueActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val YellowButton = findViewById<LinearLayout>(R.id.yellow)
        YellowButton.setOnClickListener {
            val intent = Intent(this, SegregacjaYellowActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val GreenButton = findViewById<LinearLayout>(R.id.green)
        GreenButton.setOnClickListener {
            val intent = Intent(this, SegregacjaGreenActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val PurpleButton = findViewById<LinearLayout>(R.id.purple)
        PurpleButton.setOnClickListener {
            val intent = Intent(this, SegregacjaPurpleActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val PinkButton = findViewById<LinearLayout>(R.id.pink)
        PinkButton.setOnClickListener {
            val intent = Intent(this, SegregacjaPinkActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }
    }
}
