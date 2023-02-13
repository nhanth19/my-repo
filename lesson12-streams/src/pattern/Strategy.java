package pattern;

@FunctionalInterface
public interface Strategy<T> {
	boolean behavior(T t);
}
