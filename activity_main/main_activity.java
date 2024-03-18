package com.example.gsbrv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton se_connecter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Matricule = findViewById(R.id.matricule);
        TextView Mot_de_passe = findViewById(R.id.mdp);

        MaterialButton Se_connecter = findViewById(R.id.btn_connecter);
        Se_connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = Matricule.getText().toString();
                String motDePasse = Mot_de_passe.getText().toString();

                if (matricule.equals("a131") && motDePasse.equals("azerty")) {
                    // Affichage d'un message de connexion réussie
                    Toast.makeText(MainActivity.this, "Connexion réussie", Toast.LENGTH_SHORT).show();

                    // Création d'une intention pour démarrer menuActivity
                    Intent intent = new Intent(MainActivity.this, menuActivity.class);
                    // Démarrage de menuActivity
                    startActivity(intent);
                } else if (matricule.equals("b13") && motDePasse.equals("azerty")) {
                    // Affichage d'un message de connexion réussie
                    Toast.makeText(MainActivity.this, "Connexion réussie", Toast.LENGTH_SHORT).show();

                    // Création d'une intention pour démarrer menuActivity
                    Intent intent = new Intent(MainActivity.this, menuActivity.class);
                    // Démarrage de menuActivity
                    startActivity(intent);
                } else if (matricule.equals("b17") && motDePasse.equals("azerty")) {
                    // Affichage d'un message de connexion réussie
                    Toast.makeText(MainActivity.this, "Connexion réussie", Toast.LENGTH_SHORT).show();

                    // Création d'une intention pour démarrer menuActivity
                    Intent intent = new Intent(MainActivity.this, menuActivity.class);
                    // Démarrage de menuActivity
                    startActivity(intent);
                } else if (matricule.equals("a17") && motDePasse.equals("azerty")) {
                    // Affichage d'un message de connexion réussie
                    Toast.makeText(MainActivity.this, "Connexion réussie", Toast.LENGTH_SHORT).show();

                    // Création d'une intention pour démarrer menuActivity
                    Intent intent = new Intent(MainActivity.this, menuActivity.class);
                    // Démarrage de menuActivity
                    startActivity(intent);
                } else {
                    // Affichage d'un message de connexion échouée
                    Toast.makeText(MainActivity.this, "Connexion échouée", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
