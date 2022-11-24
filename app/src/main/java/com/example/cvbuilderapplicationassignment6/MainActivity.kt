package com.example.cvbuilderapplicationassignment6

import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.Manifest.permission.CAMERA
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun onTelegramMenuSelected() {
        Toast.makeText(this, "Telegram Clicked!", Toast.LENGTH_LONG).show()
    }

    private fun onLinkedInMenuSelected() {
        Toast.makeText(this, "LinkedIn Clicked!", Toast.LENGTH_LONG).show()
    }

    private fun onWhatsAppMenuSelected() {
        Toast.makeText(this, "WhatsApp Clicked!", Toast.LENGTH_LONG).show()
    }

    private fun onGmailMenuSelected() {
        Toast.makeText(this, "Gmail Clicked!", Toast.LENGTH_LONG).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.telegram_menu -> {
                onTelegramMenuSelected()
                true
            }

            R.id.linked_in_menu -> {
                onLinkedInMenuSelected()
                true
            }

            R.id.whats_app_menu -> {
                onWhatsAppMenuSelected()
                true
            }

            R.id.gmail_menu -> {
                onGmailMenuSelected()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    
}