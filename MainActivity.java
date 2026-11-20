package com.example.carnetderoute;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings;
public class MainActivity extends Activity { @Override public void onCreate(Bundle savedInstanceState){super.onCreate(savedInstanceState); WebView w=new WebView(this); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); w.setWebChromeClient(new android.webkit.WebChromeClient()); w.loadUrl("file:///android_asset/index.html"); setContentView(w); } }
