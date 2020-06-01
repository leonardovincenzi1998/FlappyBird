package util;

public interface TubeMap {

    void addToMap(Pair tubePair);

    Pair getLastValue();

    void scrollTubePair();

    void checkWindowEnd();
}
