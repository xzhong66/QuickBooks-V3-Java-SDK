//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.05 at 03:40:06 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyPaymentMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgencyPaymentMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACH_CREDIT"/&gt;
 *     &lt;enumeration value="ACH_DEBIT"/&gt;
 *     &lt;enumeration value="CHECK"/&gt;
 *     &lt;enumeration value="WIRE"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgencyPaymentMethodEnum")
@XmlEnum
public enum AgencyPaymentMethodEnum {

    ACH_CREDIT,
    ACH_DEBIT,
    CHECK,
    WIRE,
    OTHER;

    public String value() {
        return name();
    }

    public static AgencyPaymentMethodEnum fromValue(String v) {
        return valueOf(v);
    }

}
