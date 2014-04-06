package examples;

/**
 * Created by Codenator on 06-Apr-14.
 * This program with sorting algorithm where I use minimum memory
 * and no additional function or array created
 * This program for numbers only but easy can be converted to double or long
 */
public class SortEngine {
    public static void main(String args[]){
        int[] цифорки = { 10, 2 , 4 , 7 , 3, 1 , 6 , 9 , 8 , 5};
     /*   for(int i = 0 ; i < цифорки.length ; ++i) {  // i с 0 где i номер ячейки
            // ячейки как и в пхп считаются с нуля
            цифорки[i] = (int) (Math.random() * 150); // тут всё понятно )) если нет гугл в помощ
            //System.out.println("Номер ячейки " + i + " значение " + цифорки[i]);
        }*/
        boolean cechkSorting = true;
        while(cechkSorting) {
        main:
            for (int i = цифорки.length - 1; i >= 0; --i) {
                for (int j = 0; j < цифорки.length ; ++j) {
                    if (j == i) {
                        continue main;
                    }
                    if (цифорки[i] < цифорки[j]) {
                        int changeValue = цифорки[j];
                        цифорки[j] = цифорки[i];
                        цифорки[i] = changeValue;
                        continue main;
                    }
                }
            }
            for (int i = 0; i < цифорки.length; ++i) {
                int checkingSort = i+1;
                if (i == цифорки.length-1){
                    cechkSorting = false;
                    break;
                }
                if (цифорки[i] > цифорки[checkingSort]){
                    break;
                }
            }

        }

        for(int value : цифорки) {
            System.out.println(value);
        }

    }
}
