package eu.kenway.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      supportFragmentManager.beginTransaction().replace(R.id.fragemnet,frag1()).commit()


    }


}