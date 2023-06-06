package gr.aueb.cf.ch11;

/**
 * Immutable Point
 * 1.final πεδία(private)
 * 2.no setters
 * 3.final class (strict immutability) δεν κληρονομείται
 * 4.instances mutable, προσοχή στα references
 */
public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
