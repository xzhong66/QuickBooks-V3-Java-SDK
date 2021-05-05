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
 * <p>Java class for CCTxnModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCTxnModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CardNotPresent"/&gt;
 *     &lt;enumeration value="CardPresent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CCTxnModeEnum")
@XmlEnum
public enum CCTxnModeEnum {

    @XmlEnumValue("CardNotPresent")
    CARD_NOT_PRESENT("CardNotPresent"),
    @XmlEnumValue("CardPresent")
    CARD_PRESENT("CardPresent");
    private final String value;

    CCTxnModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCTxnModeEnum fromValue(String v) {
        for (CCTxnModeEnum c: CCTxnModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
