package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer loop1, loop2;
        Boolean exit = false;
        Boolean exit2 = false;
        Scanner input = new Scanner(System.in);

        while (!exit) {
            System.out.println("Menu\n" +
                    "1. Hitung Luas Bidang\n" +
                    "2. Hitung Volume\n" +
                    "0. Exit");
            loop1 = input.nextInt();
            exit = loop1.equals(0);

            if (!exit) {
                System.out.println("Pilih bidang yang di hitung–\n" +
                        "1. Persegi\n" +
                        "2. Lingkaran\n" +
                        "3. Segitiga\n" +
                        "4. Persegi panjang\n" +
                        "0. Kembali ke menu sebelumnya");
                loop2 = input.nextInt();
                exit2 = loop2.equals(0);

                if (!exit2) {
                    long long1, long2, long3, output;
                    output = 0L;
                    switch (loop2){
                        case 1: //persegi
                            System.out.println("Input sisi:");
                            long1 = input.nextLong();
                            switch (loop1){
                                case 1:
                                    output = long1 * long1;
                                    break;
                                case 2:
                                    output = long1 * long1 * long1;
                                    break;
                            }
                            break;
                        case 2: //lingkaran
                            System.out.println("Input jari-jari:");
                            long1 = input.nextLong();
                            switch (loop1){
                                case 1:
                                    output = 314L / 100L * long1;
                                    break;
                                case 2:
                                    System.out.println("Input tinggi:");
                                    long2 = input.nextLong();
                                    output = 314L / 100L * long1 * long2;;
                                    break;
                            }
                            break;
                        case 3: //segitiga/prisma
                            System.out.println("Input Alas:");
                            long1 = input.nextLong();
                            System.out.println("Input Tinggi Segitiga:");
                            long2 = input.nextLong();
                            switch (loop1){
                                case 1:
                                    output = long1 * long2 / 2L;
                                    break;
                                case 2:
                                    System.out.println("Input Tinggi Prisma:");
                                    long3 = input.nextLong();
                                    output = long1 * long2 * long3 / 2L;
                                    break;
                            }
                            break;
                        case 4: //ppanjang
                            System.out.println("Input Alas:");
                            long1 = input.nextLong();
                            System.out.println("Input Lebar:");
                            long2 = input.nextLong();
                            switch (loop1){
                                case 1:
                                    output = long1 * long2;
                                    break;
                                case 2:
                                    System.out.println("Input Tinggi:");
                                    long3 = input.nextLong();
                                    output = long1 * long2 * long3;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                    System.out.println("Output: " + output);
                    System.out.println("Tekan apa saja untuk ke menu utama");
                    input.next();
                }
            }
        }
        input.close();
    }
}
