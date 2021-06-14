import java.time.LocalDate;
public class Reservation {
    private LocalDate date;
    private int duree;
    private String etat;
    private int id;

    public Reservation(){
        
    }


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getDuree() {
		return this.duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}


}