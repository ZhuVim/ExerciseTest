package test1;

import javax.crypto.interfaces.PBEKey;

public abstract class Shape {
public String getName() {
	return this.getClass().getSimpleName();
}
public abstract double getArea();
}
