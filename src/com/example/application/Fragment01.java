package com.example.application;


import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.zip.Inflater;




import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Fragment01 extends Fragment{
	
	EditText one,two,three;
	TextView showres;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_01, container,false);
		
	/*
	 * Este es el mismo codigo que he puesto en la carpeta prueba en la clase
	 * Register que lo tiene que hacer es abrir el fichero, escribir el fichero y luego
	 * cerrarlo. 
	 * Lo que pasa que este codigo aqui me da error, es por hacerlo en fragment y no en
	 * activity.
	 *  
	 * 
	 * 	 	        inputFullName = (EditText) findViewById(R.id.username);
	        inputEmail = (EditText) findViewById(R.id.email);
	        inputPassword = (EditText) findViewById(R.id.password);
	        btnRegister = (Button) findViewById(R.id.register);


	        btnRegister.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View view) {
	               final String name = inputFullName.getText().toString();
	               final String email = inputEmail.getText().toString();
	               final String password = inputPassword.getText().toString();
	                Usuario usuario = new Usuario();
	                
	          class EscribeFichero
	            {
	        	  Usuario datos;
	            
	              public void main(String[] args)
	                {
	                        FileWriter fichero = null;
	                        PrintWriter pw = null;
	                        try
	                        {
	                           fichero = new FileWriter("c:/Usuarios/Chiri/Escritorio/workspace/Application_1");
	                            pw = new PrintWriter(fichero);
	                         datos.nombreusuario=name;
	                         datos.contraseña=password;
	                         datos.email=email;
	                         
	                         pw.println(name);
	                         pw.println(password);
	                         pw.println(email);
	                         
	                        
	               
	                        } catch (Exception e) {
	                            e.printStackTrace();
	                        } finally {
	                           try {
	                           // Nuevamente aprovechamos el finally para 
	                           // asegurarnos que se cierra el fichero.
	                           if (null != fichero)
	                           {
	                           	//TEXTO EN PANTALLA
	                           	 
	                        	   Toast.makeText(getBaseContext(), "usuario guardado", Toast.LENGTH_SHORT).show();
	       
	                              fichero.close();
	                           }
	                           else
	                           
	                        	   Toast.makeText(getBaseContext(), "No guardado", Toast.LENGTH_SHORT).show();
	                        	   
	                           } catch (Exception e2) {
	                              e2.printStackTrace();
	                           }
	                        }
	                    }
	                }
	            }
	        });

		*/
	}
	
	
	
}


