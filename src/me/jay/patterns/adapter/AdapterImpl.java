package me.jay.patterns.adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Float twiceOf(Float f) {
//		return (float) Math.twoTimes(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("halfOf mehtod log");
		return (float) Math.half(f.doubleValue());
	}
}
