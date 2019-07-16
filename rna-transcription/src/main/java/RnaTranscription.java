class RnaTranscription {

    String transcribe(String dnaStrand) {
       String RNA = "";
        if (dnaStrand.isEmpty())
            return "";
        RNA = dnaStrand.replace("G","C");
		RNA = dnaStrand.replace("C","G");
		RNA = dnaStrand.replace("T","A");
		RNA = dnaStrand.replace("A","U");
		return RNA;
    }

}
