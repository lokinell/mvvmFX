package de.saxsys.mvvmfx.utils.mapping;

import javafx.beans.property.Property;

import java.util.function.Function;

public interface ObjectPropertyAccessor<M, T> extends Function<M, Property<T>> {
}
