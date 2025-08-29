package com.example.myapplication

import android.app.Activity
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

object NavHelper {

    fun handleBottomNav(activity: Activity, bottomNav: BottomNavigationView, currentId: Int) {
        bottomNav.selectedItemId = currentId

        bottomNav.setOnItemSelectedListener { item ->
            if (item.itemId == currentId) return@setOnItemSelectedListener true

            val intent = when (item.itemId) {
                R.id.homeBtn10 -> Intent(activity, Home::class.java)
                R.id.productBtn10 -> Intent(activity, Leaderboard::class.java)
                R.id.expertsBtn10 -> Intent(activity, Challenges::class.java)
                R.id.profileBtn10 -> Intent(activity, Profile2::class.java)
                else -> null
            } ?: return@setOnItemSelectedListener false

            // Bring existing instance to front, no flicker
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            activity.startActivity(intent)
            true
        }
    }
}
