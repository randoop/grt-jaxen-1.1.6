package org.jaxen.javabean;

import org.checkerframework.dataflow.qual.SideEffectFree;
import org.checkerframework.dataflow.qual.Impure;
import org.checkerframework.dataflow.qual.Pure;
import java.util.Iterator;

public class ElementIterator
    implements Iterator
{
    private Element parent;
    private String name;
    private Iterator iterator;

    @SideEffectFree
    public ElementIterator(Element parent,
                           String name,
                           Iterator iterator)
    {
        this.parent    = parent;
        this.name     = name;
        this.iterator = iterator;
    }

    @Pure
    public boolean hasNext()
    {
        return this.iterator.hasNext();
    }

    @Impure
    public Object next()
    {
        return new Element( parent,
                            this.name,
                            this.iterator.next() );
    }

    @SideEffectFree
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
