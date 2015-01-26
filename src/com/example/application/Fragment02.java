package com.example.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment02 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_02, container,false);
	}
	
	/*
	 * Esta parte es el mismo codigo que en la carpeta Prueba la parte de MainActivity que
	 * es el login del programa.
	 * 
	 * Me da error estos codigo al ponerlo aqui por eso
	 * lo pongo como comentario, supongo que sera por utilizar fragment y no activity
	 * pero no estoy muy seguro.
	 * 
	 * 
	 * 
		inputName = (EditText) findViewById(R.id.username);
        inputPassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.Login);
        
         btnLogin.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View view) {
                String username = inputName.getText().toString();
                String password = inputPassword.getText().toString();
                
                Usuario usuario = new Usuario();
                
                class FileScanner {
                	public void main(String[] args) {
                		File f = new File("datos.in");
                		Scanner s;
                		try {
                			s = new Scanner(f);
                			while (s.hasNextLine()) {
                				String linea = s.nextLine();
                				Scanner sl = new Scanner(linea);
                				sl.useDelimiter("\\s*,\\s*");
                				System.out.println(sl.next());
                				System.out.println(sl.next());
                				System.out.println(sl.next());
                			}
                			Toast.makeText(getBaseContext(), "Conectado", Toast.LENGTH_SHORT).show();
                			s.close();
                			
                		} catch (FileNotFoundException e) {
                			e.printStackTrace();
                			Toast.makeText(getBaseContext(), "No se pudo conectar", Toast.LENGTH_SHORT).show();
                		}
                	}
                }
                
                lblGotoRegister = (TextView) findViewById(R.id.link_to_register);
                lblGotoRegister.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {Intent itemintent = new Intent(MainActivity.this, Register.class);
          MainActivity.this.startActivity(itemintent);}
          });
         }
      }); 
    }
}             
	
	*/
}
