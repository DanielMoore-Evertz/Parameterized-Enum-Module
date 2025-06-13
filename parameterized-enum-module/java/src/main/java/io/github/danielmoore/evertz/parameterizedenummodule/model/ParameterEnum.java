package io.github.danielmoore.evertz.parameterizedenummodule.model;

// A basic parameterized enum
public enum ParameterEnum {
    ACTIVE("ACTIVE"),
    DISABLED("Disabled");

    private final String name;

    ParameterEnum(String name) {
        this.name = name;
    }
}