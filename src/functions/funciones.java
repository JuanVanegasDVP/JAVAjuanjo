package functions;

public class funciones {
    float num1, num2;
    float result;

    public funciones(float num1, float num2, float result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    public void Sum() {
        result = num1 + num2;
        System.out.println("El resultado de " + num1 + " + " + num2 + " es " + result);
    }

    public void Res() {
        result = num1 - num2;
        System.out.println("El resultado de " + num1 + " - " + num2 + " es " + result);
    }

    public void Mul() {
        result = num1 * num2;
        System.out.println("El resultado de " + num1 + " * " + num2 + " es " + result);
    }

    public void Div() {
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("El resultado de " + num1 + " / " + num2 + " es " + result);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}



