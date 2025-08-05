package org.jaxen.javabean;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;

public class Element
{
    private Element parent;
    private String name;
    private Object object;

    @SideEffectFree
    public Element(Element parent,
                   String name,
                   Object object)
    {
        this.parent = parent;
        this.name   = name;
        this.object = object;
    }

    @Pure
    public Element getParent()
    {
        return this.parent;
    }

    @Pure
    public String getName()
    {
        return this.name;
    }

    @Pure
    public Object getObject()
    {
        return this.object;
    }
}
