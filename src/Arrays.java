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
            System.out.println(value);
            average += value;
        }
        average /= цифорки.length;
        System.out.println(average);

    }
}
