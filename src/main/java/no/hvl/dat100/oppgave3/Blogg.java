package no.hvl.dat100.oppgave3;
 
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
 
public class Blogg {
 
	
	private Innlegg inleggtabell[];
	private int nesteledig ;  

<<<<<<< HEAD
	
	private Innlegg inleggtabell[];
	
	private int nesteledig ;  
	

	public Blogg() {
		
		this.inleggtabell= new Innlegg[20];
		this.nesteledig= 0;
			
=======
 
	public Blogg() {
		this.inleggtabell= new Innlegg[20];
		this.nesteledig= 0;
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d
	}
 
	public Blogg(int lengde) {
<<<<<<< HEAD
		
		this.inleggtabell= new Innlegg[lengde];
		this.nesteledig = 0; 
		
		
	}
=======
		this.inleggtabell= new Innlegg[lengde];
		this.nesteledig = 0; 
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d

	}
 
	public int getAntall() {
<<<<<<< HEAD
		
		
=======

>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d
		return nesteledig; 
	}
	public Innlegg[] getSamling() {
<<<<<<< HEAD
	
=======
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d
return inleggtabell; 
	}
	public int finnInnlegg(Innlegg innlegg) {
 
		for( int i = 0; i<inleggtabell.length; i++) {
			if(inleggtabell[i]!= null && inleggtabell[i].erLik(innlegg)){
				return i;
			}
			}
		return -1; 
			}

<<<<<<< HEAD
		for( int i = 0; i<inleggtabell.length; i++) {
			if(inleggtabell[i]!= null && inleggtabell[i].erLik(innlegg)){
				return i;
			}
				
			}
		return -1; 
				
			}
			
		
		
=======
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d

 
	public boolean finnes(Innlegg innlegg) {
<<<<<<< HEAD
		
		
=======

>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d
		for(int i= 0; i< inleggtabell.length; i++) {
			if(inleggtabell[i]!= null && inleggtabell[i].erLik(innlegg)) {
				return true; 
			}
		}
		return false; 
	}
	

 
	public boolean ledigPlass() {
<<<<<<< HEAD
		
=======
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d
		for(int i= 0; i<inleggtabell.length; i++) {
			if(inleggtabell[i] == null) {
				return true; 
			}
		}
<<<<<<< HEAD
		
		return false; 	

=======
		return false; 	
 
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d
	}
	public boolean leggTil(Innlegg innlegg) {
 
		  
		  for (int i = 0; i < inleggtabell.length; i++) {
		        if (inleggtabell[i] != null && inleggtabell[i].erLik(innlegg)) {
		            return false;
		        }
		    }
 
		    if (nesteledig < inleggtabell.length) {
		        inleggtabell[nesteledig] = innlegg;
		        nesteledig++;
		        return true;
		    }
 
		    return false;
		}  // 

<<<<<<< HEAD
		  
		  for (int i = 0; i < inleggtabell.length; i++) {
		        if (inleggtabell[i] != null && inleggtabell[i].erLik(innlegg)) {
		            return false;
		        }
		    }

		    if (nesteledig < inleggtabell.length) {
		        inleggtabell[nesteledig] = innlegg;
		        nesteledig++;
		        return true;
		    }

		    return false;
		}  // 
		
		
	
	public String toString() {
		
		StringBuilder result = new StringBuilder();

	    // Legg til antall innlegg på første linje
	    result.append(getAntall()).append("\n");

	    // Gå gjennom innleggtabell
	    for (int i = 0; i < inleggtabell.length; i++) {
	        // Sjekk at innlegget ikke er null
	        if (inleggtabell[i] != null) {
	            // Kall toString() på innlegget og legg det til i result med linjeskift
	            result.append(inleggtabell[i].toString()).append("\n");
	        }
	    }

	    // Returner hele resultatet som en streng
	    return result.toString();
		
	}
=======
	public String toString() {
>>>>>>> 38b1df5ae4cefd1092c6d6ae4f93909ccf300f5d


	        StringBuilder sb = new StringBuilder();
	        sb.append(nesteledig).append("\n");
	        for (int i = 0; i < nesteledig; i++) {
	            sb.append(inleggtabell[i].toString()).append("\n");
	        }
	        return sb.toString().trim();
	    }

 
	// valgfrie oppgaver nedenfor
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	public boolean leggTilUtvid(Innlegg innlegg) {
 
		throw new UnsupportedOperationException(TODO.method());
	}
	public boolean slett(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}
	public int[] search(String keyword) {
		throw new UnsupportedOperationException(TODO.method());
 
	}
}
