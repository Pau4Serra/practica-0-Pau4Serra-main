package prac0;

public class OperationsImplementation implements Operations{
    @Override
    public int Add(int a, int b) {
        return a + b;
    }

    @Override
    public int Sub(int a, int b) {
        return a - b;
    }

    @Override
    public int Mul(int a, int b) {
        return a * b;
    }

    @Override
    public int Div(int a, int b) {
        return a / b;
    }
}
