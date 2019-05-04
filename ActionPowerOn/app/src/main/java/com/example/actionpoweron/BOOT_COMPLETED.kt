package com.example.actionpoweron

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class BOOT_COMPLETED : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED){
            Toast.makeText(context, "eita! ligoou!", Toast.LENGTH_SHORT).show()
            val uri = Uri.parse("http://www.ifpb.edu.br")
            val it = Intent(Intent.ACTION_VIEW, uri)
            context.startActivity(it)

        }
    }

}
