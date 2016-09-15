
package com.akuacom.pss2.program.dlc.signal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.akuacom.pss2.dlc.stub.signal package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Signals_QNAME = new QName("", "signals");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.akuacom.pss2.dlc.stub.signal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignalsType }
     * 
     */
    public SignalsType createSignalsType() {
        return new SignalsType();
    }

    /**
     * Create an instance of {@link SignalType }
     * 
     */
    public SignalType createSignalType() {
        return new SignalType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "signals")
    public JAXBElement<SignalsType> createSignals(SignalsType value) {
        return new JAXBElement<SignalsType>(_Signals_QNAME, SignalsType.class, null, value);
    }

}
