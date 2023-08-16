package ex4;

import java.util.stream.Stream;

public class RandomAlgStream {

    public Stream<Integer> randomStreamGenerator(){
        RandomAlg randomAlg = new RandomAlg();
         Stream<Integer> stream = Stream.iterate(5837946, (seed) -> randomAlg.withSeed(seed).getRandomNumber());
         return stream;
    }
}
