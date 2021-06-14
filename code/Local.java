public class Local{
    protected String ref;
    protected String localisation;
    protected int prix;
    protected float tauxLoc;
	//protected int nombre 
	
    private int nombreLocal;
    private final int FORMAT = 4;

    public Local(String localisation, int prix, float tauxLoc){
        //nombreLocal++;
        ref = gerenateRef();
		setLocalisation(localisation);
        setPrix(prix);
        setTauxLoc(tauxLoc);
    }

	private String gerenateRef(){
		String nombreC = "";
		String strNombreLocaux = String.valueOf(++nombreLocal);
		for (int i; i<= (FORMAT - strNombreLocaux.length()); i++)
		{
			nombreC += "C";
		}
		return ref + nombreC + strNombreLocaux;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getLocalisation() {
		return this.localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public float getTauxLoc() {
		return this.tauxLoc;
	}

	public void setTauxLoc(float tauxLoc) {
		this.tauxLoc = tauxLoc;
	}

	public void showLocal(){
		return "Localisation : " + localisation
		+"\n Prix : " + prix 
		+"\n Taux de location : " + String.valueOf(tauxLoc);
	}


}