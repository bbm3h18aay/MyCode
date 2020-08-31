package Model;

public class Telefonbuch {
	
		private String name;
		private String adresse;
		private String telefon;
		private String plz;
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAdresse() {
			return adresse;
		}


		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}


		public String getTelefon() {
			return telefon;
		}


		public void setTelefon(String telefon) {
			this.telefon = telefon;
		}


		public String getPlz() {
			return plz;
		}


		public void setPlz(String plz) {
			this.plz = plz;
		}





		public Telefonbuch(String name, String adresse, String telefon, String plz) {
			this.name = name;
			this.adresse = adresse;
			this.telefon = telefon;
			this.plz = plz;

		}


		@Override
		public String toString() {
			return "Telefonbuch [name=" + name + ", adresse=" + adresse + ", telefon=" + telefon + ", plz=" + plz
					 + "]";
		}

		
		

}
