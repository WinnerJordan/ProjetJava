public class Appartement implements Local{
    private int nombrePiece;

	public int getNombrePiece() {
		return this.nombrePiece;
	}

	public void setNombrePiece(int nombrePiece) {
		this.nombrePiece = nombrePiece;
	}

	public void showLocal(){
		return super.showLocal()
		+ "Nombre de pieces : " + nombrePiece;
	}

    

}