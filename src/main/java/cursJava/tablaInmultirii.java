public class tablaInmultirii {
    public static void main(String[] args) {
        int i = 1, k = 1, l = 1, m = 1, n = 1, o = 1, p = 1, q = 1;

        for (i = 1; i <= 10 && i >= 1; i++)
            for (k = 1; k <= 10; k++)
                for (l = 1; l <= 10; l++)
                    for (m = 1; m <= 10; m++)
                        for (n = 1; n <= 10; n++)
                            for (o = 1; o <= 10; o++)
                                for (p = 1; p <= 10; p++)
                                    for (q = 1; q <= 10; q++) {
                                        do {
                                            System.out.println(i + " " + "x 2" + " " + "=" + " " + (i++ * 2) +
                                                    "      " + k + " " + "x 3" + " " + "=" + " " + (k++ * 3) +
                                                    "      " + l + " " + "x 4" + " " + "=" + " " + (l++ * 4) +
                                                    "      " + m + " " + "x 5" + " " + "=" + " " + (m++ * 5) +
                                                    "      " + n + " " + "x 6" + " " + "=" + " " + (n++ * 6) +
                                                    "      " + o + " " + "x 7" + " " + "=" + " " + (o++ * 7) +
                                                    "      " + p + " " + "x 8" + " " + "=" + " " + (p++ * 8) +
                                                    "      " + q + " " + "x 9" + " " + "=" + " " + (q++ * 9));
                                        } while (i <= 10);
    }
        System.out.println("10 x 10 = " + 10*10);
}
}

