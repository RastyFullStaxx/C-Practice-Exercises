class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        GenericClass<Integer> integerObj = new GenericClass<>(42);
        GenericClass<String> stringObj = new GenericClass<>("Hello, Generics!");

        System.out.println(integerObj.getValue()); // Prints 42
        System.out.println(stringObj.getValue()); // Prints "Hello, Generics!"
    }
}
