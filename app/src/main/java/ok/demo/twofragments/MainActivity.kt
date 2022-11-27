package ok.demo.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ok.demo.twofragments.databinding.ActivityMainBinding
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Показать первый фрагмент
        val firstFragment = FirstFragment()
        val fmManager: FragmentManager = supportFragmentManager
        fmManager.beginTransaction().add(R.id.placeHolder, FirstFragment()).commit()

    }
}