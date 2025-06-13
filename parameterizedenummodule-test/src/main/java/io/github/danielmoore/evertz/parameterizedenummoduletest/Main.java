package io.github.danielmoore.evertz.parameterizedenummoduletest;

import io.github.danielmoore.evertz.parameterizedenummodule.model.ParameterEnum;
import io.github.danielmoore.evertz.parameterizedenummodule.model.ExampleEnum;

public class Main {

    /*
        Import of ParameterEnum fails. Error shown on IDE is 'Cannot resolve symbol 'ParameterEnum'
        Module is shown in external libraries as expected and basic non-parameterized enum ExampleEnum imports successfully
        ParameterEnum has header of 'Decompiled .class file, bytecode version: 61.0 (Java 17))', ExampleEnum does not.
    */

    ParameterEnum parameterEnum = ParameterEnum.ACTIVE;
    ExampleEnum exampleEnum = ExampleEnum.ACTIVE;
}

