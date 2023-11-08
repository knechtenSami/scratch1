package at.ac.htl.bhitm3;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public Object getSum() {
        return IntStream.rangeClosed(1, 10).map(n -> n * n).sum();
    }
}
