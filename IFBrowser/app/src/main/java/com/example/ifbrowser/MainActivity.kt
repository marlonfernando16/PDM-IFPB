package com.example.ifbrowser

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var btGo: Button
    private lateinit var btRefresh: Button
    private lateinit var etSearch: EditText
    private lateinit var wbContent: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btGo = findViewById(R.id.btGo)
        this.btRefresh = findViewById(R.id.btRefresh)
        this.etSearch = findViewById(R.id.etSearch)
        this.wbContent = findViewById(R.id.wbContent)
        wbContent.webViewClient = WebViewClient()


        this.btGo.setOnClickListener({ getPage(it) })
    }

    fun getPage(view: View) {
        this.wbContent.loadUrl(this.etSearch.text.toString())
    }

}
