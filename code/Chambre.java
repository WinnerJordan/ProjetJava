public class Chambre implements Local{
    private String dimensions;

	public String getDimensions() {
		return this.dimensions;
	}
	
	public Chambre(String dimensions){
		super(String localisation, int prix, float tauxLoc);
		setDimensions(dimensions);
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

    public void Cout(){   
    }

	

	public void showLocal(){
		return super.showLocal()
		+ "Dimensions : " + nombrePiece;
	}


}