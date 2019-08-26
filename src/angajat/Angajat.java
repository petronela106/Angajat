package angajat;

import java.time.LocalDate;

public class Angajat {
	String nume;
	String prenume;
	String cnp;
	int departament;
	double salariu;
	
	Angajat(String cnp, double salariu, int departament){
		if(cnp.length() >= 7) {
		System.out.println("Angajatul a fost adaugat cu urmatoarele date: " + cnp + " " + salariu + " "+ departament);
		}else {
			System.out.println("Cnp invalid");
		}
	}
	
	Angajat(String nume, String prenume, int departament, String cnp, double salariu){
		System.out.println("Angajatul a fost adaugat cu urmatoarele date: " +nume + " " + prenume + " " + departament+ " " +  cnp + " " + salariu);
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public int getDepartament() {
		return departament;
	}

	public void setDepartament(int departament) {
		this.departament = departament;
	}

	public double getSalariu() {
		return salariu;
	}

	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}
	public long getAge() {
		int i = Integer.parseInt(cnp.substring(0,1));
		String dataNasteri = cnp.substring(1,3) + "-" + cnp.substring(3,5) + "-" +cnp.substring(5,7);
		if(i == 1 || i == 2) {
			dataNasteri = "19" + dataNasteri;
		}else if(i == 3 || i == 4) {
			dataNasteri = "18" + dataNasteri;
		}else if(i == 5 || i == 6) {
			dataNasteri = "20" + dataNasteri;
		}else if(i == 7 || i == 8) {
			dataNasteri = "19" + dataNasteri;
		}
		LocalDate dataN = LocalDate.parse(dataNasteri);
		LocalDate now = LocalDate.now();
		long age = java.time.temporal.ChronoUnit.YEARS.between( dataN , now );
		return age;
	}


}
