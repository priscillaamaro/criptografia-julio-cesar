import com.fasterxml.jackson.annotation.JsonProperty;

public class DadosArquivoJS {
	
	@JsonProperty("numero_casas")
	private int numeroCasas;
	private String token;
	private String cifrado;
	private String decifrado;
	
	@JsonProperty("resumo_criptografico")
	private String resumoCriptografico;
	
	
	
	
	public int getNumeroCasas() {
		return numeroCasas;
	}
	public void setNumeroCasas(int numeroCasas) {
		this.numeroCasas = numeroCasas;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getCifrado() {
		return cifrado;
	}
	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}
	public String getDecifrado() {
		return decifrado;
	}
	public void setDecifrado(String decifrado) {
		this.decifrado = decifrado;
	}
	public String getResumoCriptografico() {
		return resumoCriptografico;
	}
	public void setResumoCriptografico(String resumoCriptografico) {
		this.resumoCriptografico = resumoCriptografico;
	}
	
	
	
	
	
	
}
