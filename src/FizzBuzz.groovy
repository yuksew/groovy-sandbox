println 'hello'

def max = 100;

for (def current = 0; current < max; current++) {
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