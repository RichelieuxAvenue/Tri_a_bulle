public class TriABulle {
    public static void echangeValeur(int[]array, int i, int j) {
        if (array[i] == array[j]) {
            return;
        }
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int [] listeNombre = {32, -7, 20, 3, -98, 38};

        for(int indexPasTrier = listeNombre.length-1; indexPasTrier >0;indexPasTrier--){

            for (int indextrier = 0; indextrier<indexPasTrier; indextrier++) {

                if (listeNombre[indextrier] > listeNombre[indextrier+1]) {
                    echangeValeur(listeNombre,indextrier,indextrier+1);
                }
            }
        }
        for (int i = 0; i < listeNombre.length; i++) {
            System.out.print(listeNombre[i] + " ");
        }
    }
}
