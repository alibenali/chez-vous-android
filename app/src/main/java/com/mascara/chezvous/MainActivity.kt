package com.mascara.chezvous

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var url = "https://folooss.com/modesy/ar/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        web_view.getSettings().setDomStorageEnabled(true);
        web_view.getSettings().setAppCacheEnabled(true);
        web_view.getSettings().setLoadsImagesAutomatically(true);
        web_view.getSettings().setUseWideViewPort(true);
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setUseWideViewPort(true)
        web_view.getSettings().setLoadWithOverviewMode(true)
        web_view.settings.domStorageEnabled = true
        

        web_view.loadUrl(url)
        web_view.webViewClient = object : WebViewClient(){


            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                web_view.alpha = 0.2f

            }
            override fun onPageFinished(view: WebView?, url: String?) {
                theLogo.visibility = INVISIBLE
                web_view.visibility = View.VISIBLE
                web_view.alpha = 1f
            }

            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

                view?.loadUrl(url)
                return true
            }
        }

    }
}
