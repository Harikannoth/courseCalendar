/**
 * ResponseAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.akuacom.pss2.itron.webservices;

public class ResponseAction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResponseAction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Accept = "Accept";
    public static final java.lang.String _Acknowledge = "Acknowledge";
    public static final java.lang.String _BuyThrough = "BuyThrough";
    public static final java.lang.String _Curtail = "Curtail";
    public static final java.lang.String _Decline = "Decline";
    public static final java.lang.String _SubmitBid = "SubmitBid";
    public static final java.lang.String _Undefined = "Undefined";
    public static final ResponseAction Accept = new ResponseAction(_Accept);
    public static final ResponseAction Acknowledge = new ResponseAction(_Acknowledge);
    public static final ResponseAction BuyThrough = new ResponseAction(_BuyThrough);
    public static final ResponseAction Curtail = new ResponseAction(_Curtail);
    public static final ResponseAction Decline = new ResponseAction(_Decline);
    public static final ResponseAction SubmitBid = new ResponseAction(_SubmitBid);
    public static final ResponseAction Undefined = new ResponseAction(_Undefined);
    public java.lang.String getValue() { return _value_;}
    public static ResponseAction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ResponseAction enumeration = (ResponseAction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResponseAction fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseAction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://itron.com/webservices/", "ResponseAction"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
