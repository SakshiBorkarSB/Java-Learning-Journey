// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.


// Class to represent a Complex number
class Complex {
    int real;  // Stores the real part of the complex number
    int img;   // Stores the imaginary part of the complex number

    // Constructor to initialize the complex number with given real and imaginary values
    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    // Method to add two complex numbers
    public static Complex add(Complex a, Complex b) {
        // Adds real parts together and imaginary parts together
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    // Method to subtract two complex numbers
    public static Complex difference(Complex a, Complex b) {
        // Subtracts real parts and imaginary parts separately
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    // Method to multiply two complex numbers
    public static Complex product(Complex a, Complex b) {
        // Uses the formula: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) + (a.img * b.real)));
    }

    // Method to print the complex number in a readable format
    public void printComplex() {
        // If the real part is 0 but the imaginary part is not
        if (real == 0 && img != 0) {
            System.out.println("0 + " + img + "i");
        }
        // If the imaginary part is 0 but the real part is not
        else if (real != 0 && img == 0) {
            System.out.println(real + " + 0i");
        }
        // If both real and imaginary parts exist
        else {
            System.out.println(real + " + " + img + "i");
        }
    }
}
