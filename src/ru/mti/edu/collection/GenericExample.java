package ru.mti.edu.collection;

public class GenericExample<T, F> {

	T order;
	F name;

	public T getOrder() {
		return order;
	}

	public void setOrder(T order) {
		this.order = order;
	}

	public F getName() {
		return name;
	}

	public void setName(F name) {
		this.name = name;
	}
}
