@SuppressWarnings({ "requires-automatic", "requires-transitive-automatic" })
module io.github.danielmoore.evertz.parameterizedenummodule {
    requires transitive org.apache.commons.lang3;

    opens io.github.danielmoore.evertz.parameterizedenummodule.model;

    exports io.github.danielmoore.evertz.parameterizedenummodule.model;
}