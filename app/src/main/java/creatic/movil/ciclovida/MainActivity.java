package creatic.movil.ciclovida;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CicloVida","Entro al OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CicloVida", "Entro al OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CicloVida", "Entro al OnResume");
    }

    @Override
    protected void onPause() {
        Log.i("CicloVida", "Entro al OnPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("CicloVida", "Entro al OnStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CicloVida", "Entro al onRestart");
    }

    @Override
    protected void onDestroy() {
        Log.i("CicloVida", "Entro al OnDestroy");
        super.onDestroy();
    }
}
