import jdk.incubator.vector.*;

public class VectorAPIExample {
    public static void main(String[] args) {
        VectorSpecies<Float> species = FloatVector.SPECIES_256;
        FloatVector a = FloatVector.fromArray(species, new float[]{1, 2, 3, 4});
        FloatVector b = FloatVector.fromArray(species, new float[]{5, 6, 7, 8});
        FloatVector result = a.add(b);
        float[] array = new float[species.length()];
        result.intoArray(array, 0);

        for (float value : array) {
            System.out.println(value);
        }
    }
}
