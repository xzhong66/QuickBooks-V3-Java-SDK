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
 * <p>Java class for DeliveryErrorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryErrorTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Missing Info"/&gt;
 *     &lt;enumeration value="Undeliverable"/&gt;
 *     &lt;enumeration value="Delivery Server Down"/&gt;
 *     &lt;enumeration value="Bounced Email"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryErrorTypeEnum")
@XmlEnum
public enum DeliveryErrorTypeEnum {

    @XmlEnumValue("Missing Info")
    MISSING_INFO("Missing Info"),
    @XmlEnumValue("Undeliverable")
    UNDELIVERABLE("Undeliverable"),
    @XmlEnumValue("Delivery Server Down")
    DELIVERY_SERVER_DOWN("Delivery Server Down"),
    @XmlEnumValue("Bounced Email")
    BOUNCED_EMAIL("Bounced Email");
    private final String value;

    DeliveryErrorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryErrorTypeEnum fromValue(String v) {
        for (DeliveryErrorTypeEnum c: DeliveryErrorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
