package com.example.myapplication

import android.app.Activity
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

object NavHelper {

    fun handleBottomNav(activity: Activity, bottomNav: BottomNavigationView, currentId: Int) {
        // Highlight the current tab
        bottomNav.selectedItemId = currentId

        bottomNav.setOnItemSelectedListener { item ->
            // Do nothing if user clicks the current tab
            if (item.itemId == currentId) return@setOnItemSelectedListener true

            val intent = when (item.itemId) {
                R.id.navigation_home -> Intent(activity, Home::class.java)
                R.id.leaderboard -> Intent(activity, Leaderboard::class.java)
                R.id.challenges -> Intent(activity, Challenges::class.java)
                R.id.profile -> Intent(activity, Profile2::class.java)
                else -> null
            } ?: return@setOnItemSelectedListener false

            // Bring existing instance to front, no flicker
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            activity.startActivity(intent)
            true
        }
    }
}
