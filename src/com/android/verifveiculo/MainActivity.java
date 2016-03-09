package com.android.verifveiculo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText edplaca;
	private Button btverificar, btlimpar;
	private TextView mostrarplaca;
	private ImageView imgbandeira; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getComponets();
		validarPlaca();
		limparCampos();
	}
	
	private void getComponets(){
		edplaca = (EditText) findViewById(R.id.edplaca);
		btverificar = (Button) findViewById(R.id.butverificar);
		btlimpar = (Button) findViewById(R.id.butlimpar);
		mostrarplaca = (TextView) findViewById(R.id.mostrarplaca);	
		imgbandeira = (ImageView) findViewById(R.id.imgbandeira);

	}

	private void validarPlaca(){
		btverificar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {  
				VerificarUF uf = new VerificarUF();
				if(edplaca.getText().toString().isEmpty()){
					Toast.makeText(getApplicationContext(),"Informe a placa para validar",Toast.LENGTH_LONG).show();
				}else{
					String placa = edplaca.getText().toString();
					
					if(placa.matches("[a-zA-Z]{3,3}-\\d{4,4}")){
						mostrarplaca.setText("Placa V�lida, regi�o: " + uf.getUF(placa));
						mostrarplaca.setTextColor(Color.parseColor("#00FF7F"));
					}else{
						mostrarplaca.setText("Placa Inv�lida");
						mostrarplaca.setTextColor(Color.parseColor("#FF0000"));
					}
				}	
			}
		});
	}
	private void limparCampos(){
		btlimpar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				edplaca.setText("");
				mostrarplaca.setText("");	
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}