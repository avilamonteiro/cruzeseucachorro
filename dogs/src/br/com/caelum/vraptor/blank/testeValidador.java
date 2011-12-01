package br.com.caelum.vraptor.blank;

import java.math.BigDecimal;

public class testeValidador {
	
	
	private int piLoop;
	private String psPalavra = "";
	private String psResposta = "";
	private int  piTamanho = 0;
	private String pParte_i = "";
	private String pParte_f = "";
	private int intDecimais = 2;
	
	
	public String formataValor(String fsValor){
		
		for(piLoop = 0; piLoop <= fsValor.length() -1; piLoop++){
			
			if ((fsValor.charAt(piLoop) == '-' && piLoop == '0') && fsValor.charAt(piLoop) != ',' || (fsValor.charAt(piLoop) >= '0' && fsValor.charAt(piLoop) <= '9'))
				
				psPalavra = psPalavra + fsValor.charAt(piLoop);
				System.out.println(" psPalavra = " + psPalavra);
		}
			
		for(piLoop=0; piLoop <= psPalavra.length() -1; piLoop++) {
	   		if (psPalavra.length() < 14){
				psResposta = psResposta + psPalavra.charAt(piLoop); 
				piTamanho = 14; 
			}else{
				psResposta = psPalavra;
			}
	   	}
		
		for(piLoop=intDecimais; piLoop < psResposta.length(); piLoop++){
			pParte_i = psResposta.substring(0, psResposta.length() - piLoop );
			pParte_f = psResposta.substring(psResposta.length()-piLoop, psResposta.length());
			
			if (piLoop == intDecimais) {
				psResposta = pParte_i + ',' + pParte_f ;
				System.out.println("psResposta == intDecimais, " + psResposta);
			} else {
				psResposta = pParte_i + '.' + pParte_f ;				
			}
			piLoop = piLoop + 3;
		
		}
	return psResposta;
	
	}
	
	public static BigDecimal convertePontoVigula(String s){
        
		s=s.replace('.',' ');

        String r = "";

        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != ' ') r += s.charAt(i);
        }
        s=r.replace(',','.');
        //s=r;
        BigDecimal numero = new BigDecimal(s);

        return numero;
			
	}
	
	
	public static BigDecimal convertePontoVigulaMoeda(String s) {
		BigDecimal numero;
		if (s.length()==1) {
			numero = new BigDecimal(s);
		}else{
			s=s.replace('.',' ');

			String r = "";

			for (int i = 0; i < s.length(); i ++) {
				if (s.charAt(i) != ' ') r += s.charAt(i);
			}
			s=r.replace(',','.');
			numero = new BigDecimal(s);
		}
		 return numero;
  }
	
	
	public static void main(String[] args) {
		
		testeValidador teste = new testeValidador();
		System.out.println(teste.formataValor("1.000,00"));
		System.out.println(teste.convertePontoVigula("1.000,00"));
		System.out.println(teste.convertePontoVigulaMoeda("1.000,00"));
		
	}

}
