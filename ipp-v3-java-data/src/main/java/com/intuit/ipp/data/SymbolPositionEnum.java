//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 02:36:16 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SymbolPositionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SymbolPositionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Leading"/>
 *     &lt;enumeration value="Trailing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SymbolPositionEnum")
@XmlEnum
public enum SymbolPositionEnum {

    @XmlEnumValue("Leading")
    LEADING("Leading"),
    @XmlEnumValue("Trailing")
    TRAILING("Trailing");
    private final String value;

    SymbolPositionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SymbolPositionEnum fromValue(String v) {
        for (SymbolPositionEnum c: SymbolPositionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
