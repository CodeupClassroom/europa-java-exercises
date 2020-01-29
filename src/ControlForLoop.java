

public class ControlForLoop {
    public static void main(String[] args) {

        // lets see some primes
        for (int i = 0; i < 1001; i++) {

            // Why don't we have to import ControlWhileLoop?
            if (ControlWhileLoop.isPrime(i)) System.out.println(i + " is a prime number.");
        }

        // BTW - Why ++i instead of i++?

        /**
         * FROM a nerdy blog
         * https://www.quora.com/Do-you-use-i++-or-++i-in-a-for-loop-And-why
         *
         * I always used to use i++ in for-loops until looking through the asm output of a 68k C compiler,
         * I noticed that it included an extra move instruction, to save the current state of i before incrementing it!
         *
         * A quick check of gcc on the x86 showed that the compiler optimised the move away as it was able to
         * recognise the original state of i was never used, but the 68k compiler did not optimise this… so I got
         * into the good practice of putting the increment/decrement operator in the correct place.
         *
         */
    }
}
