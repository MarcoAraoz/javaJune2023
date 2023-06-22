public class Main {
    public static void main(String[] args) {
        double peso = 80;
        double altura = 1.68;
        double indiceMasaCorporal = peso / (altura * altura);

                if (indiceMasaCorporal >= 30) {
                    System.out.println("estás en estado de obesidad");
                }
                if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
                    System.out.println("estás en estado de sobrepeso");
                }
                if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
                    System.out.println("estás en estado de obesidad");
                }
    }
}