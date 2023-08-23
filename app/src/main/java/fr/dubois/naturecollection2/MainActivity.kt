package fr.dubois.naturecollection2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.dubois.naturecollection2.fragments.HomeFragement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injecter fragment dans la boite
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragement())
        transaction.commit()
    }
}