package com.example.gyvunaipaskaita;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gyvunai);

        List<Gyvunas> gyvunai = new ArrayList<>();

        Button submitButton = findViewById(R.id.submit);
        Button printButton = findViewById(R.id.print);

        EditText vardas = findViewById(R.id.vardas);
        EditText amzius = findViewById(R.id.amzius);
        EditText rusis = findViewById(R.id.rusis);

        TextView viewSarasas = findViewById(R.id.gSarasas);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vardas1 = String.valueOf(vardas.getText());
                int amzius1 = Integer.parseInt(amzius.getText().toString());
                String rusis1 = String.valueOf(rusis.getText());
                Gyvunas gyvunas = new Gyvunas(vardas1, amzius1, rusis1);
                gyvunai.add(gyvunas);
                vardas.getText().clear();
                amzius.getText().clear();
                rusis.getText().clear();
            }
        });
        printButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sarasas = "";
                for(Gyvunas g : gyvunai){
                    sarasas += g.toString();
                }
                viewSarasas.setText(sarasas);
            }
        });

    }
}