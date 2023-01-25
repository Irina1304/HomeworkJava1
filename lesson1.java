/*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
int i = new Random().nextInt(k); //это кидалка случайных чисел!) */


import java.util.Arrays;
import java.util.Random;

public class lesson1 {
    
    public static void main(String[] args) {

        int i = new Random().nextInt(2000);
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        int n = ((Integer.toBinaryString(i).length())-1);
        System.out.println(n);
    

        int a = (Short.MAX_VALUE-i)/n;
        int [] m1 = new int[a];
        int g = 0;
        while (i <= Short.MAX_VALUE){
            if ( i%n == 0){
                m1[g] = i;
                i += n;
                g += 1;
            } else {
                i += 1;
            }
        }
        System.out.println(Arrays.toString(m1));


        int b = (32768 + i) - (32768/n + (i-1)/n);
        int [] m2 = new int[b];
        int c = 0;
        while (i >= Short.MIN_VALUE){
            if (i%n !=0){
                m2[c] = i;
                i =i - 1;
                c += 1;
            } else{
                i = i - 1;
            }
        }
        System.out.println(Arrays.toString(m2));
}
}

