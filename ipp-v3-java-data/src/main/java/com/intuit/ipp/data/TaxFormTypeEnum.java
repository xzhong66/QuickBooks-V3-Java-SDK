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
 * <p>Java class for TaxFormTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxFormTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Form C"/>
 *     &lt;enumeration value="Form F"/>
 *     &lt;enumeration value="Form I"/>
 *     &lt;enumeration value="Form H"/>
 *     &lt;enumeration value="Form E1"/>
 *     &lt;enumeration value="Form E2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxFormTypeEnum")
@XmlEnum
public enum TaxFormTypeEnum {

    @XmlEnumValue("Form C")
    FORM_C("Form C"),
    @XmlEnumValue("Form F")
    FORM_F("Form F"),
    @XmlEnumValue("Form I")
    FORM_I("Form I"),
    @XmlEnumValue("Form H")
    FORM_H("Form H"),
    @XmlEnumValue("Form E1")
    FORM_E_1("Form E1"),
    @XmlEnumValue("Form E2")
    FORM_E_2("Form E2");
    private final String value;

    TaxFormTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxFormTypeEnum fromValue(String v) {
        for (TaxFormTypeEnum c: TaxFormTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
