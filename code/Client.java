
public class Client{
    private String nci;
    private String nomComplet;
    private int tel;
    private String adresse;
    private String email;

	public Client(){
	}

    public Client(String nci, String nomComplet, int tel, String adresse, String email){
		setNci(nci);
		setNomComplet(nomComplet);
		setTel(tel);
		setAdresse(adresse);
		setEmail(email);
    }

	

	public String getNci() {
		return this.nci;
	}

	public void setNci(String nci) {
		this.nci = nci;
	}

	public String getNomComplet() {
		return this.nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public int getTel() {
		return this.tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String afficher(){
        return "Numero de la carte d'identite : " + nci
        + "\n Nom Complet : " + nomComplet 
        + "\n Numero de telephone : " + tel
		+ "\n Adresse : " + adresse
		+ "\n Mail : " + email ;
    }
}