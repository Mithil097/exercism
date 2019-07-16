class RnaTranscription {

    String transcribe(String dnaStrand) {
      	String RNA = "";
      	for (int i=0; i < dnaStrand.length(); i++) {  
	      	char dna=dnaStrand.charAt(i);
	      	switch(dna) {
	        	case 'G':
	            	RNA+='C';
	            	break;
	         	case 'C':
	            	RNA+='G';
	            	break;
	         	case 'T':
	            	RNA+='A';
	            	break;
	         	case 'A':
	            	RNA+='U';
	            	break;
	      }

	   }

	   return RNA;
	}

}
