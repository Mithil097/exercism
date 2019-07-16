class TwelveDays {
    private String[] days = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    
    private String[] sentences = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };
    
    private String PartOne = "On the ";
    private String PartTwo = " day of Christmas my true love gave to me: ";
    
    String verse(int verseNumber) {
        String m = "";
        m+=PartOne;
        m+=days[verseNumber - 1];
        m+=PartTwo;
        
        for (int i = verseNumber; i > 0; i--) {
            m+=sentences[i - 1];
            if (i != 1) {
                m+=", ";
            }
            if (i == 2) {
                m+="and ";
            }
        }
        m+=".\n";
        return m;
    }

    String verses(int startVerse, int endVerse) {
        String m = "";
        for (int i = startVerse; i <= endVerse; i++) {
            m+=verse(i);
            if (i != endVerse){
            	m+="\n";	
            } 
        }
        return m;
    }
    
    String sing() {
        return verses(1, 12);
    }
}
