package com.lzb.refactoring;

/**
 * <br/>
 * Created on : 2022-12-14 22:19
 * @author mac
 */
public class ReplaceConditionalWithPolymorphism {

	/*class Bird {
		// ...
		double getSpeed() {
			switch (type) {
			case EUROPEAN:
				return getBaseSpeed();
			case AFRICAN:
				return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
			case NORWEGIAN_BLUE:
				return (isNailed) ? 0 : getBaseSpeed(voltage);
			}
			throw new RuntimeException("Should be unreachable");
		}
	}*/

	///////////////////////////////////////////////////////////////////////////
	//
	///////////////////////////////////////////////////////////////////////////

	abstract class Bird {
		// ...
		abstract double getSpeed();
	}

	class European extends Bird {
		double getSpeed() {
			//return getBaseSpeed();
			return 0;
		}
	}

	class African extends Bird {
		double getSpeed() {
			//return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
			return 0;
		}
	}

	class NorwegianBlue extends Bird {
		double getSpeed() {
			// return (isNailed) ? 0 : getBaseSpeed(voltage);
			return 0;
		}
	}

// Somewhere in client code
	// speed =bird.getSpeed();

}
