package com.android.verifveiculo;

public class VerificarUF {

	String iniciais[] = new String[] { "NBB0001", "OHL0001", "MZN0001",
			"NXR0001", "JWF0001", "NOI0001", "OAA0001", "NAH0001", "NUH0001",
			"JTA0001", "NSE0001", "OBT0001", "OFI0001", "OSW0001", "NEI0001",
			"MVL0001", "OLH0001", "HOL0001", "NHA0001", "NMP0001", "NWS0001",
			"OIR0001", "LVF0001", "NHU0001", "ODU0001", "OUA0001", "HTX0001",
			"NQL0001", "NUM0001", "OCB0001", "OHX0001", "ORN0001", "MXH0001",
			"NNJ0001", "OJR0001", "MMN0001", "NPR0001", "OET0001", "OFX0001",
			"KFD0001", "NXU0001", "PEE0001", "PFR0001", "PGL0001", "MUA0001",
			"NLV0001", "OHB0001", "ORD0001", "HZB0001", "NVG0001", "OEJ0001",
			"JKS0001", "NTD0001", "NYH0001", "OKI0001", "OUF0001", "GKJ0001",
			"NXX0001", "OLO0001", "OOV0001", "MOX0001", "OCV0001", "OVE0001",
			"KMF0001", "BFA0001", "SAV0001", "AAA0001", "LWR0001", "OWD0001",
			"IAQ0001", "HQF0001", "NRF0001", "OOG0001", "JXZ0001", "NIY0001",
			"NPC0001", "NTX0001", "OAP0001", "KAV0001", "NFC0001", "NJX0001",
			"NVO0001", "OGH0001", "OMI0001", "JDP0001" };

	String ufs[] = new String[] { "Rondônia", "Rondônia", "Acre", "Acre",
			"Amazonas", "Amazonas", "Amazonas", "Roraima", "Roraima", "Pará",
			"Pará", "Pará", "Pará", "Pará", "Amapá", "Tocantins", "Tocantins",
			"Maranhão", "Maranhão", "Maranhão", "Maranhão", "Maranhão",
			"Piauí", "Piauí", "Piauí", "Piauí", "Ceará", "Ceará", "Ceará",
			"Ceará", "Ceará", "Ceará", "Rio Grande do Norte",
			"Rio Grande do Norte", "Rio Grande do Norte", "Paraíba", "Paraíba",
			"Paraíba", "Paraíba", "Pernambuco", "Pernambuco", "Pernambuco",
			"Pernambuco", "Pernambuco", "Alagoas", "Alagoas", "Alagoas",
			"Alagoas", "Sergipe", "Sergipe", "Sergipe", "Bahia", "Bahia",
			"Bahia", "Bahia", "Bahia", "Minas Gerais", "Minas Gerais",
			"Minas Gerais", "Minas Gerais", "Espírito Santo", "Espírito Santo",
			"Espírito Santo", "Rio de Janeiro", "São Paulo", "São Paulo",
			"Paraná", "Santa Catarina", "Santa Catarina", "Rio Grande do Sul",
			"Mato Grosso do Sul", "Mato Grosso do Sul", "Mato Grosso do Sul",
			"Mato Grosso", "Mato Grosso", "Mato Grosso", "Mato Grosso",
			"Mato Grosso", "Goiás", "Goiás", "Goiás", "Goiás", "Goiás",
			"Goiás", "Distrito Federal" };

	String finais[] = new String[] { "NEH9999", "OHW9999", "NAG9999",
			"NXT9999", "JXY9999", "NPB9999", "OAO9999", "NBA9999", "NUL9999",
			"JWE9999", "NTC9999", "OCA9999", "OFW9999", "OTZ9999", "NFB9999",
			"MXG9999", "OLN9999", "HQE9999", "NHT9999", "NNI9999", "NXQ9999",
			"OJK9999", "LWQ9999", "NIX9999", "OEI9999", "OUE9999", "HZA9999",
			"NRE9999", "NVF9999", "OCU9999", "OIQ9999", "OSV9999", "MZM9999",
			"NOH9999", "OKC9999", "MOW9999", "NQK9999", "OFH9999", "OGG9999",
			"KME9999", "NXW9999", "PFQ9999", "PGK9999", "PHE9999", "MVK9999",
			"NMO9999", "OHK9999", "ORM9999", "IAP9999", "NVN9999", "OES9999",
			"JSZ9999", "NTW9999", "NZZ9999", "OLG9999", "OVD9999", "HOK9999",
			"NYG9999", "OMH9999", "ORC9999", "MTZ9999", "ODT9999", "OWC9999",
			"LVE9999", "GKI9999", "SAV9999", "BEZ9999", "MMM9999", "OYG9999",
			"JDO9999", "HTW9999", "NSD9999", "OOU9999", "KAU9999", "NJW9999",
			"NPQ9999", "NUG9999", "OBS9999", "KFC9999", "NGZ9999", "NLU9999",
			"NWR9999", "OHA9999", "OOF9999", "JKR9999" };

	String estados[] = new String[] { "Rondônia", "Acre", "Amazonas",
			"Roraima", "Pará", "Amapá", "Tocantins", "Maranhão", "Piauí",
			"Ceará", "Rio Grande do Norte", "Paraíba", "Pernambuco", "Alagoas",
			"Sergipe", "Bahia", "Minas Gerais", "Espírito Santo",
			"Rio de Janeiro", "São Paulo", "Paraná", "Santa Catarina",
			"Rio Grande do Sul", "Mato Grosso do Sul", "Mato Grosso", "Goiás",
			"Distrito Federal" };

	int imagens[] = new int[] { R.drawable.ro, R.drawable.ac, R.drawable.am,
			R.drawable.rr, R.drawable.pa, R.drawable.ap, R.drawable.to,
			R.drawable.ma, R.drawable.pi, R.drawable.ce, R.drawable.rn,
			R.drawable.pb, R.drawable.pe, R.drawable.al, R.drawable.se,
			R.drawable.ba, R.drawable.mg, R.drawable.es, R.drawable.rj,
			R.drawable.sp, R.drawable.pr, R.drawable.sc, R.drawable.rs,
			R.drawable.ms, R.drawable.mt, R.drawable.go, R.drawable.df };

	public String getUF(String placa) {
		 
			for (int i = 0; i < iniciais.length; i++) {
				if ((placa.compareToIgnoreCase(iniciais[i]) >= 0)
						&& (placa.compareToIgnoreCase(finais[i]) <= 0)) {
					return ufs[i];
				}
			}
		
		return "Placa Invalida";
	}

	public int imagem(String valor) {
		int i = 0;
		while ((i < estados.length) && (!estados[i].equals(valor))) {
			i++;
		}
		return imagens[i];

	}
}
