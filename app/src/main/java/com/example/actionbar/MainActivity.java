package com.example.actionbar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.google.com/");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }
    //gère le click sur une action de l'ActionBar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nouveau:
                nouveau();
                return true;
            case R.id.sauvegarder:
                sauvegarder();
                return true;
            case R.id.quitter:
                quitter();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
    public void nouveau(){
        Toast.makeText(this, "Créer une nouvelle Tâche ", Toast.LENGTH_LONG).show();
    }

    public void quitter(){
        Toast.makeText(this, "Arrêt en cours ", Toast.LENGTH_LONG).show();
        finish();
    }

    public void sauvegarder(){
        Toast.makeText(this, "Tache bien sauvegardée !! ", Toast.LENGTH_LONG).show();
    }



}
