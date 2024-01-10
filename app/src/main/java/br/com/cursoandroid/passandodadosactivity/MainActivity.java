package br.com.cursoandroid.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        // dentro do onCLickListener é possivel definir as açoes que serão executadas quando o usuario pressionar o botao
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);

                //Instanciar um objeto
                Usuario usuario = new Usuario("Anna","anna@gmail.com");
                //Passar dados de uma activity para outra
                intent.putExtra("nome","Anna");
                intent.putExtra("idade",30);
                intent.putExtra("objeto", usuario );

                startActivity(intent); //  iniciar uma activity

            }
        });
    }
}