package by.it.group673602.eliseev.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {
        //здесь нужно реализовать вариант с временем O(n) и памятью O(n)
        BigInteger mas[] = new BigInteger[2];
        mas[0] = BigInteger.valueOf(0);
        mas[1] = BigInteger.valueOf(1);
        BigInteger tmp;
        for (int i = 0; i < n-1; i++){
            tmp = mas[0].add(mas[1]);
            mas[0] = mas[1];
            mas[1] = tmp;
        }
        return mas[1];
    }

}

