package com.example.randomjokeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.randomjokeapp.Rest.serviceApi
import com.example.randomjokeapp.databinding.ActivityMainBinding
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bottomNavigation =binding.bottomNavigationView
        val navController = findNavController(R.id.nav_container)
        val toolbarNav = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController,toolbarNav)
        bottomNavigation.setupWithNavController(navController)
    }
}