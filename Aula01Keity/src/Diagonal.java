
public interface Diagonal {

	
	
	public default double CalcularD() {
		return ((getLado()*(getLado() - 3))/2);
	}

	public int getLado();

	
}
