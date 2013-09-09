public class FizzBuzzRunner
{
    public void run(max) {
        for (def current = 1; current <= max; current++) {
            if (current % 15 == 0) {
                println 'Fizz Buzz';
            } else if (current % 3 == 0) {
                println 'Fizz';
            } else if (current % 5 == 0) {
                println 'Buzz';
            } else {
                println current;
            }
        }    
    }
}

def fbr = new FizzBuzzRunner();
fbr.run(args[0].toInteger());