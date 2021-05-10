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
 * <p>Java class for TaxRateDisplayTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxRateDisplayTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ReadOnly"/&gt;
 *     &lt;enumeration value="HideInTransactionForms"/&gt;
 *     &lt;enumeration value="HideInPrintedForms"/&gt;
 *     &lt;enumeration value="HideInAll"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxRateDisplayTypeEnum")
@XmlEnum
public enum TaxRateDisplayTypeEnum {

    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly"),
    @XmlEnumValue("HideInTransactionForms")
    HIDE_IN_TRANSACTION_FORMS("HideInTransactionForms"),
    @XmlEnumValue("HideInPrintedForms")
    HIDE_IN_PRINTED_FORMS("HideInPrintedForms"),
    @XmlEnumValue("HideInAll")
    HIDE_IN_ALL("HideInAll");
    private final String value;

    TaxRateDisplayTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRateDisplayTypeEnum fromValue(String v) {
        for (TaxRateDisplayTypeEnum c: TaxRateDisplayTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
