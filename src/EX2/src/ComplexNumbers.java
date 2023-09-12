public class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumbers(int real) {
        this.real = real;
        this.imaginary = 0;
    }

    public ComplexNumbers() {
        real = 0;
        imaginary = 0;
    }

    public static ComplexNumbers add(ComplexNumbers c1, ComplexNumbers c2) {
        ComplexNumbers new_ComplexNumbers = new ComplexNumbers();
        new_ComplexNumbers.real = c1.real + c2.real;
        new_ComplexNumbers.imaginary = c1.imaginary + c2.imaginary;
        return new_ComplexNumbers;
    }

    public static ComplexNumbers multiply(ComplexNumbers c1, ComplexNumbers c2) {
        ComplexNumbers new_ComplexNumbers = new ComplexNumbers();
        new_ComplexNumbers.real = c1.real * c2.real;
        new_ComplexNumbers.imaginary = c1.imaginary * c2.imaginary;
        return new_ComplexNumbers;
    }

    public static void print(ComplexNumbers c) {
        if (c.imaginary >= 0) {
            System.out.println(c.real + "+" + c.imaginary + "i");
        }
        if (c.imaginary < 0) {
            System.out.println(c.real + "" + c.imaginary + "i");
        }
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(3, 2);
        ComplexNumbers c2 = new ComplexNumbers(4, -2);
        ComplexNumbers sum = add(c1, c2);
        ComplexNumbers product = multiply(c1, c2);
        System.out.print("Sum of The Complex Numbers : ");
        print(sum);
        System.out.print("Product of The Complex Numbers : ");
        print(product);
    }

}
