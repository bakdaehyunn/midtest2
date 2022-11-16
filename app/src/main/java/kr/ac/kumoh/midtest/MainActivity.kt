package kr.ac.kumoh.midtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.midtest.databinding.ActivityFirstBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main : ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.imgGundam.setOnClickListener{
            val second =Intent(this,SecondActivity::class.java)
            startActivity(second)
        }
    }
}