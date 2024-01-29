import java.util.Arrays;

class HyperLogLog {
    private byte[] registers;
    private int precision;

    public HyperLogLog(int precision) {
        this.precision = precision;
        registers = new byte[1 << precision];
    }

    public void add(String element) {
        int hash = hashFunction(element);
        int index = hash >>> (32 - precision);
        int leadingZeros = Integer.numberOfLeadingZeros(hash << precision);
        registers[index] = (byte) Math.max(registers[index], leadingZeros + 1);
    }

    public long count() {
        double alpha = getAlpha();
        double estimate = alpha * (1.0 / Arrays.stream(registers).mapToDouble(r -> 1.0 / (1 << r)).sum());

        return Math.round(estimate);
    }

    private double getAlpha() {
        if (precision == 4) {
            return 0.673;
        } else if (precision == 5) {
            return 0.697;
        } else if (precision == 6) {
            return 0.709;
        } else {
            return 0.7213 / (1 + 1.079 / (1 << precision));
        }
    }

    private int hashFunction(String element) {
        return element.hashCode();
    }

    public static void main(String[] args) {
        HyperLogLog hll = new HyperLogLog(10);
        hll.add("apple");
        hll.add("banana");
        hll.add("apple");

        System.out.println("Distinct count: " + hll.count());
    }
}
