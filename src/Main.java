public class Main {
    public static void main(String[] args) {

        // Deklaration und Initialisierung von Arrays
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // statische Initialisierung

        // Die Zählung des Index beginnt bei 0
        System.out.println( x[0] ); // <- erster Wert im Array
        System.out.println( x[9] ); // <- das 10. Element

        x[4] = 99; // Wert zuweisen (an der 5. Stelle)
        System.out.println( x[4] );

        // Manchmal ist das Array sehr groß
        double[] tagessätze = new double[ 366 ]; // dynamische Initialisierung
        // "new" erzeugt einen Speicherbereich, der groß genug für das Array ist

        // Was steht in diesem Array drin?
//        System.out.println( tagessätze[127] );
        for (int i=0; i < tagessätze.length; i++)
            System.out.println( i + ". = " + tagessätze[i] );

        // Das Array ist von fester und unveränderlicher Größe
        //tagessätze.length = 2000; -- das geht nicht
        // Es ist ein statisches Array !

        long[] longArray; // Achtung, nur Name des Arrays wurde deklariert
                          // nicht das Array selbst

        int anzahlDerElemente = 17;

        longArray = new long[ anzahlDerElemente ];
        longArray[2] = 33;
        System.out.println( longArray.length );

        // Achtung, das ist ein neues(!!) Array
        longArray = new long[ 215 ];
        System.out.println( longArray[2] );

        // Aufgabe 1:
        // Erstellen Sie ein int-Array mit 10 Elementen mit den
        // Werten 101 bis 110.
        int[] intArray = new int[10];
        for (int i=0; i < intArray.length; i++)
            intArray[i] = 101+i;

        // Aufgabe 2:
        // Lassen Sie das int-Array mit seinen einzelnen Elementen
        // ausgeben, in eine hübschen Form, z.B. "[101, 102, 103, ..., 110]"
        // -> das lagern wir mal in eine Methode aus!!
        ausgabe( intArray );
        ausgabe( x );

        int[] datensätze = { 45, 23, 9, 33, 27, 3, 109, 44, 47, 12 };
        ausgabe( datensätze );

        System.out.println("Das kleines Element ist " +
                findeKleinstesElementImArray(datensätze));


    }

    // Aufgabe 3:
    // Durchsuchen Sie ein Array und finden das kleinste Elemente darin,
    // geben es als Rückgabewert zurück
    public static int findeKleinstesElementImArray( int[] array ) {
        int dasKleinsteElement = Integer.MAX_VALUE;
        for (int i=0; i < array.length; i++) {
            if (array[i] < dasKleinsteElement)
                dasKleinsteElement = array[i];
        }
        return dasKleinsteElement;
    }

    // Aufgabe 4:
    // Durchsuchen Sie ein Array und finden das größte Elemente darin,
    // geben es als Rückgabewert zurück


    private static void ausgabe( int[] array ) {
        System.out.print("[");
        for (int i=0; i < array.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
