class RnaTranscription {

    String transcribe(String dnaStrand) {
       String RNA = "";
        if (dnaStrand.isEmpty())
            return "";
        for(int i = 0; i < dnaStrand.length(); i++){
            if(dnaStrand.charAt(i) == 'C')
                 RNA += "G";
            if(dnaStrand.charAt(i) == 'G')
                 RNA += "C";
            if(dnaStrand.charAt(i) == 'A')
                 RNA += "U";
            if(dnaStrand.charAt(i) == 'T')
                 RNA += "A";
        }
        return RNA;
    }

}
