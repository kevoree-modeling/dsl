package org.kevoree.modeling.ast;

public interface KClass extends KClassifier {

    KProperty[] properties();

    void addProperty(KProperty property);

    KClass[] parents();

    void addParent(KClass parent);

}
