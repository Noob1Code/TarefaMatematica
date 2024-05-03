/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package test.projetinhom;

import java.util.Scanner;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 02/05/2024
 * @brief Class matematica
 */
public class matematica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas dos três pontos (x1, y1), (x2, y2) e (x3, y3):");
        System.out.print("Digite x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Digite y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Digite x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Digite y2: ");
        double y2 = sc.nextDouble();
        System.out.print("Digite x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Digite y3: ");
        double y3 = sc.nextDouble();

        double det = dt(x1, y1, x2, y2, x3, y3);
        if (det == 0) {

            System.out.println("Os pontos estão alinhados.");

            double distancia = cd(x1, y1, x2, y2);
            System.out.printf("Distância entre o primeiro e o segundo ponto: %.2f", distancia);
        } else {

            System.out.println("Os pontos não estão alinhados.");
            System.out.printf("Porque o determinante deu: %.2f", det);
        }

        sc.close();
    }

    public static double dt(double x1, double y1, double x2, double y2, double x3, double y3) {
        return x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
    }

    public static double cd(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
