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
        System.out.println("Das größte Element ist " +
                findeGrößtesElementImArray(datensätze));

        System.out.println("Ist das Element 17 im Array? " +
                findeElementImArray(datensätze, 17));
        System.out.println("Ist das Element 33 im Array? " +
                findeElementImArray(datensätze, 33));

        int[] modifizierteDatensätz = entferneElementAusArray(datensätze, 33);
    }

    // Aufgabe 3:
    // Durchsuchen Sie ein Array und finden das kleinste Elemente darin,
    // geben es als Rückgabewert zurück
    public static int findeKleinstesElementImArray( int[] array ) {
        int dasKleinsteElement = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < dasKleinsteElement)
                dasKleinsteElement = element;
        }
        return dasKleinsteElement;
    }

    // Aufgabe 4:
    // Durchsuchen Sie ein Array und finden das größte Elemente darin,
    // geben es als Rückgabewert zurück
    public static int findeGrößtesElementImArray( int [] array ) {
        int dasGrößteElement = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > dasGrößteElement)
                dasGrößteElement = element;
        }
        return dasGrößteElement;
    }

    // Aufgabe 5:
    // Eine Methode, das ein bestimmtes Element im Array findet
    // und ein Boolean zurückgibt, ob es gefunden wurde oder nicht
    public static boolean findeElementImArray(int[] array, int gesuchterWert) {
        for (int element : array) {
            if (element == gesuchterWert) return true;
        }
        return false;
    }

    // Aufgabe 6:
    // Eine Methode, das ein neues Array erstellt aus einem übergebenen
    // Array ohne der Zahl, die noch zusätzlich übergeben wird
    public static int[] entferneElementAusArray(int[] array, int zuEntfernendeWert) {
        int längeDesNeuenArrays = array.length;
        if ( findeElementImArray(array, zuEntfernendeWert) )
            längeDesNeuenArrays--;
//      Alternative mit dem tenären Operator:
//        int längeDesNeuenArrays = findeElementImArray(array, zuEntfernendeWert)
//                ? array.length - 1
//                : array.length;
        int[] neuesArray = new int[ längeDesNeuenArrays ];
        int neuerIndex = 0;
        for (int element : array) {
            if (element != zuEntfernendeWert) {
                neuesArray[neuerIndex] = element;
                neuerIndex++;
            }
        }
        return neuesArray;
    }

    // Aufgabe 7
    // Eine Methode, die feststellt, ob ein Array in aufsteigender
    // Sortierung vorliegt
    public static boolean istArraySortiert(int[] array) {
        // TODO
        return false;
    }

    // Aufgabe 8
    // Eine Methode, die ein übergebenens Array aufsteigend sortiert!
    public static int[] sortiereArray(int[] array) {
        // TODO
        return array;
    }

    private static void ausgabe( int[] array ) {
        System.out.print("[");
        for (int i=0; i < array.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
