package com.example.demo;

public @interface RequestParam {

	String name();

	boolean required();

	String defaultValue();

}
