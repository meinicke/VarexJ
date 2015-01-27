package org.prevayler.demos.demo1;

import org.prevayler.Prevayler;


/**
 * This is client code to the prevalent system. It does not need to be persisted.
 */
public class PrimeCalculator {

	private final Prevayler _prevayler;
	private final NumberKeeper _numberKeeper;


	public PrimeCalculator(Prevayler prevayler) {
		_prevayler = prevayler;
		_numberKeeper = (NumberKeeper)prevayler.prevalentSystem();
	}


	public void start() throws Exception {
		int largestPrime = 0;
		int primesFound = 0;
		final int lastNumber = _numberKeeper.lastNumber();
		int primeCandidate = lastNumber == 0 ? 2 : lastNumber + 1;

		int newPrimes = 0;
		while (primeCandidate <= Integer.MAX_VALUE) {
			if (isPrime(primeCandidate)) {

				_prevayler.execute(new NumberStorageTransaction(primeCandidate));

				largestPrime = primeCandidate;
				primesFound = _numberKeeper.numbers().size();
				System.out.println("Primes found: " + primesFound + ". Largest: " + largestPrime);
			}

			primeCandidate++;
			newPrimes++;
			if (newPrimes > 1000){
				break;
			}
		}
	}


    private boolean isPrime(int candidate) {
	    /*int factor = 2;
        candidate = candidate / 2;
        while (factor < candidate) {
        	if (candidate % factor == 0) return false;
        	factor++;
        }
        return true;*/
	    
	    if (candidate < 2) { return false; }
        if (candidate == 2) { return true; }
        if (candidate % 2 == 0) { return false; }

        int factor = 3;
        double square = Math.ceil(Math.sqrt(candidate));
        while (factor <= square) {
            if (candidate % factor == 0) return false;
            factor+=2;
        }
        return true;
    }

}