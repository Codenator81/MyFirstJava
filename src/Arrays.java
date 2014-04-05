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
        System.out.println(аррай[2]);// пример выборки массива из 2 ячейки

        long[] myNumbers = {1,2,10,45,23};  // создаёт и записсывает массив одновремменно
                                            // инитиализироваьб не надо
        System.out.println(myNumbers[4]); // пример выборки массива из 4 ячейки


    }
}
