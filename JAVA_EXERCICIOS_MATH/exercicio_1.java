/* Implemente uma classe em Java que leia as coordenadas de dois pontos e calcule a distância entre eles.
Equação de cálculo: */

public class exercicio_1 {
    public static void main(String[] args) {
        double x2 = 3, x1 = 2, y2 = 7, y1 = 3;
        double pt1 = Math.pow(x2 - x1, 2);
        double pt2 = Math.pow(y2 - y1, 2);
        System.out.println(pt1);
        System.out.println(pt2);
        double resul = Math.sqrt(pt1 + pt2);
        System.out.println("O resultado é de " + resul);
    }
}