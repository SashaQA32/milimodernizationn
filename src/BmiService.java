public class BmiService {
    public float calculate(float mass, float height) {
        float oneResult = mass;
        float twoResult = height * height;
        float results = oneResult / twoResult * 100;
        return results;
    }
}
