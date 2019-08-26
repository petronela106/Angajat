package angajat;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
	    System.out.println("Intoduceti numarul total de angajat:");
	    int nrAngajati = Integer.parseInt(scanner.nextLine());
	    Angajat[] angajati = new Angajat[nrAngajati];
	    double salariu3131 = 0;
	    int varstaMax30 = 0;
	    double sumSalariu30 = 0;
	    int varstaMax40 = 0; 
	    double sumSalariu40 = 0;
	    int varstaMax65 = 0;
	    double sumSalariu65 = 0;
	    
	    
	    for(int i = 0; i < nrAngajati; i++) {
	    	System.out.println("Intoduceti urmatorul angajat cu datele: nume ");
	    	String nume = scanner.nextLine();
	    	System.out.println("prenume ");
	    	String prenume = scanner.nextLine();
	    	System.out.println("departament ");
	    	int departament = Integer.parseInt(scanner.nextLine());
	    	System.out.println("cnp ");
	    	String cnp = scanner.nextLine();
	    	System.out.println("salariu ");
	    	double salariu = Double.parseDouble(scanner.nextLine());
	    	angajati[i] = new Angajat(nume, prenume, departament,  cnp, salariu);
         	angajati[i].setNume(nume);
	    	angajati[i].setPrenume(prenume);
	    	angajati[i].setDepartament(departament);
	    	angajati[i].setCnp(cnp);
	    	angajati[i].setSalariu(salariu);
	    }
	    for(int j = 0 ; j < nrAngajati ; j++ ) {
	    	if(angajati[j].getSalariu() >= 3131) {
	    		salariu3131 ++;	
	    	}
	    	if(angajati[j].getAge() < 31 && angajati[j].getAge() > 18 ) {
	    		varstaMax30 ++;
	    		sumSalariu30 += angajati[j].getSalariu();
	    	}else if(angajati[j].getAge() < 41) {
	    		varstaMax40 ++;
	    		sumSalariu40 += angajati[j].getSalariu();
	    	}else if(angajati[j].getAge() < 65) {
	    		varstaMax65 ++;
	    		sumSalariu65 += angajati[j].getSalariu();
	    	}
	    	
	    }
	    salariu3131 = ( salariu3131 / nrAngajati ) * 100 ; 
	    System.out.printf("Procentul angajatilor cu salariu peste 3131 este: %.2f ", salariu3131);
	    System.out.println();
	    System.out.println("Salariul mediu  pentru angajati cu varsta intre 18-30 este: " + (sumSalariu30 / varstaMax30));
	    System.out.println("Salariul mediu  pentru angajati cu varsta intre 31-40 este: " + (sumSalariu40 / varstaMax40));
	    System.out.println("Salariul mediu  pentru angajati cu varsta intre 41-65 este: " + (sumSalariu65 / varstaMax65));
  	
	    PostLiber[] postLiber= new PostLiber[3];
	    for(int k = 0 ; k < 3 ; k++) {
	    	System.out.println("Introduceti datele pentru postul liber: varsta minima ");
	    	postLiber[k] = new PostLiber();
	    	int varstaMinima = scanner.nextInt();
	    	postLiber[k].setVarstaMinima(varstaMinima);
	    	System.out.println("salariu minim ");
	    	double salariuMinim = scanner.nextDouble();
	    	postLiber[k].setSalariuMinim(salariuMinim);
	    	System.out.println("salariu maxium ");
	    	double salariuMaxim = scanner.nextDouble();
	    	postLiber[k].setSalariuMaxim(salariuMaxim);
	    	int nr = 0;
	    	for(int l = 0 ; l < nrAngajati; l++ ) {
	    		if(postLiber[k].getVarstaMinima() <= angajati[l].getAge() && postLiber[k].getSalariuMinim() <= angajati[l].getSalariu() 
	    				&& angajati[l].getSalariu() <= postLiber[k].getSalariuMaxim() ) {
	    			System.out.println("Angajatul cu datele: nume - " + angajati[l].getNume() + " " + angajati[l].getPrenume() + ", cnp  - " + angajati[l].getCnp()+
	    					" este compatibil pentru postul liber cu numarul: " + (k+1));
	    			nr++;
	    		}
	    	}
	    	if (nr == 0 ) {
	    		System.out.println("Niciunul dintre angajatii nu indeplineste conditiile de mai sus.");
	    	}
	    }

	}
}
