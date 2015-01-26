package com.example.application;

import com.example.application.Fragment01;
import com.example.application.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentManager fm =getSupportFragmentManager();
		FragmentTransaction transaction= fm.beginTransaction();
        StartFragment startFrag =new StartFragment();
        
         transaction.replace(R.id.fragment_placeholder, startFrag);
        transaction.commit();
        
	}
	
	
	public void onSelectFragment(View view){
		
		Fragment newFragment;
		
		if (view ==findViewById(R.id.fragm02)){
			newFragment= new Fragment02();
		}else if (view ==findViewById(R.id.fragm01)){
			newFragment= new Fragment01();
		}else{
			newFragment= new StartFragment();
		}


		FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.fragment_placeholder, newFragment);
		transaction.addToBackStack(null);
		transaction.commit();
	}
	

	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
