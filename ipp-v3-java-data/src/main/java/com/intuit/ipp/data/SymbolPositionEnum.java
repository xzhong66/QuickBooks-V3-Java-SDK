//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.05 at 03:40:06 PM PDT 
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
 * &lt;simpleType name="SymbolPositionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Leading"/&gt;
 *     &lt;enumeration value="Trailing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
