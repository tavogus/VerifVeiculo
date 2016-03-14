package com.android.verifveiculo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText edplaca, edtel;
	private Button btverificar,btenviar, btlimpar;
	private TextView mostrarplaca;
	private ImageView imgbandeira;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getComponets();
		validarPlaca();
		limparCampos();
		enviarsms();
	}

	private void getComponets() {
		edplaca = (EditText) findViewById(R.id.edplaca);
		btverificar = (Button) findViewById(R.id.butverificar);
		btlimpar = (Button) findViewById(R.id.butlimpar);
		mostrarplaca = (TextView) findViewById(R.id.mostrarplaca);
		imgbandeira = (ImageView) findViewById(R.id.imgbandeira);
		edtel = (EditText) findViewById(R.id.edtel);
		btenviar = (Button) findViewById(R.id.butenviar);
	}

	private void validarPlaca() {
		btverificar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				VerificarUF uf = new VerificarUF();
				if (edplaca.getText().toString().isEmpty()) {
					Toast.makeText(getApplicationContext(),
							"Informe a placa para validar", Toast.LENGTH_LONG)
							.show();
				} else {
					String placa = edplaca.getText().toString();

					if (placa.matches("[a-zA-Z]{3,3}-\\d{4,4}")) {
						String valor = uf.getUF(placa);
						if(valor.equals("Placa Invalida")){
							mostrarplaca.setText("Placa Inexistente");
							mostrarplaca.setTextColor(Color.parseColor("#FF0000"));
							imgbandeira.setImageResource(R.drawable.br);
							return;
						}
						mostrarplaca.setText("Placa Válida, região: " + valor);
						mostrarplaca.setTextColor(Color.parseColor("#00FF7F"));
						imgbandeira.setImageResource(uf.imagem(valor));
					}else{ 
						mostrarplaca.setText("Placa Invalida");
						imgbandeira.setImageResource(R.drawable.br);
						mostrarplaca.setTextColor(Color.parseColor("#FF0000"));
						
						
						}
					}
				}
			
		});
	}
	
	private void enviarsms(){
		btenviar.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	            sendSMSMessage();
	         }
	      });
	}
	
	 protected void sendSMSMessage() {
	      String numero = edtel.getText().toString();
	      String messagem = mostrarplaca.getText().toString();
	      
	      try {
	         SmsManager smsManager = SmsManager.getDefault();
	         smsManager.sendTextMessage(numero, null, messagem, null, null);
	         Toast.makeText(getApplicationContext(), "SMS enviada.", Toast.LENGTH_LONG).show();
	      } 
	      
	      catch (Exception e) {
	         Toast.makeText(getApplicationContext(), "SMS falhou. por favor tente novamente", Toast.LENGTH_LONG).show();
	         e.printStackTrace();
	      }
	   }
	
	
	private void limparCampos() {
		btlimpar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				edplaca.setText("");
				edtel.setText("");
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
