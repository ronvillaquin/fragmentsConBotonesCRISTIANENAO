package com.rrvq.practicafragmentsinnavview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // este metodo es el que nos va a permitir las transacciones de agregar a la vista el fragment
    FragmentTransaction fragmentTransaction;
    Fragment fragInicio, fragRojo, fragVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sen instancian ls fragments algo asi como casting
        fragInicio = new InicioFragment();
        fragRojo = new RojoFragment();
        fragVerde = new VerdeFragment();

        // esta linea es para que inicie en un fragment por defecto colocamos fragInicio
        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, fragInicio).commit();


    }

    public void onClick(View view){

        // ahora hacemos el getsuporfrag de arriba pero en una variable para llamar desde cada boton o donde desee
        // como se copia hasta beginn y el commt despues de swit para que lo muestre
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId()){
            case R.id.btnRojo:
                // se utiliza replace para replacar el frag de inciio
                fragmentTransaction.replace(R.id.contenedorFragment, fragRojo);
                // para que regrese entre fragment
                // en caso no desee regrese entre fragments quito el addtobac y coloco el commit en cada scuchador R.id
                fragmentTransaction.addToBackStack(null);
                break;
            case  R.id.btnVerde:
                fragmentTransaction.replace(R.id.contenedorFragment, fragVerde);
                // para que regrese entre fragment
                fragmentTransaction.addToBackStack(null);

                break;
        }
        // con el commt mostramos el fragmen que deseemos
        fragmentTransaction.commit();

    }

}