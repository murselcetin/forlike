package com.example.forlike

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.forlike.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView, navHostFragment.navController)



        val toogle = ActionBarDrawerToggle(this, binding.drawer, binding.toolbar, 0, 0)
        binding.drawer.addDrawerListener(toogle)
        toogle.syncState()

        val header = binding.navigationView.inflateHeaderView(R.layout.drawer_header)
    }
}