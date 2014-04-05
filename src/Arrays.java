/**
 * Created by Codenator on 04-Apr-14.
 * Урок массивы и их применение
 */
public class Arrays {
    public static void main(String[] args)
    {
        int аррай[];// инитиализируем массив
        аррай = new int[10];//создаём массив
        аррай[2] = 45;// присваиваем значение
     //   System.out.println(аррай[2]);// пример выборки массива из 2 ячейки

        long[] myNumbers = {1,2,10,45,23};  // создаёт и записсывает массив одновремменно
                                            // инитиализироваьб не надо
      //  System.out.println(myNumbers[4]); // пример выборки массива из 4 ячейки

        // Заполняем массив с помощью for
        int[] цифорки = new int[20]; // Создаём массив с 20-ю ячейками типа int
        for(int i = 0 ; i < цифорки.length ; ++i) {  // i с 0 где i номер ячейки
            // ячейки как и в пхп считаются с нуля
            цифорки[i] = (int) (Math.random() * 100); // тут всё понятно )) если нет гугл в помощ
            //   System.out.println("Номер ячейки " + i + " умноженое на два значение " + цифорки[i]);
        }
        int average = 0;
        for(double value : цифорки) {
         //   System.out.println(value);
            average += value;
        }
        average /= цифорки.length;
   //     System.out.println(average);

        // multidimensinoal array
        long[][][] beans = new long[3][][];
        beans[0] = new long[4][]; // produce beans[0][] 4 ячейки во втором скторе
        beans[1] = new long[2][]; // produce beans[0][] 2 ячейки во втором скторе
        beans[2] = new long[5][]; // produce beans[0][] 5 ячейки во втором скторе

        // initialize randon arrays
        for(int i = 0; i < beans.length; ++i) // Vary over 1st dimension
            for(int j = 0; j < beans[i].length; ++j) // Vary over 2nd dimension
                beans[i][j] = new long[(int)(1.0 + 6.0*Math.random())];

        char[] sign = {'Е', 'х', 'а', 'л', ' ', 'Г', 'р', 'е', 'к', 'а', ' ','ч', 'е', 'р', 'е', 'з' , ' ','р', 'е', 'к', 'у',  '\n',
                'в', 'и', 'д', 'и', 'т', ' ', 'Г', 'р', 'е', 'к', 'а', ' ','в', ' ', 'р', 'е', 'к', 'е', ' ', 'р', 'а', 'к', '\n'
        };
        for(char value: sign){
            System.out.print(value);
        }
    }
}
