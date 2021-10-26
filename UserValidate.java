package com.bridgeday23LAMDDA;


@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}