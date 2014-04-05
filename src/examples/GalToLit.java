/**
 * Created by Codenator on 05-Apr-14.
 * This programm convert gallons to liters.
 *
 */
public class GalToLit {
    public static void main(String args[]){
        double галлоны; //содержит плавающее число  галлона
        double литры; //содержит плавающее число  литра

        галлоны = 10; // начнём с 10 галлонов
        литры = галлоны * 3.7854; // конвертируем в литры
        System.out.println("В " + галлоны + " галлонах " + литры + " литров" );
    }
}
