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
 * <p>Java class for EntityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="Employee"/&gt;
 *     &lt;enumeration value="Job"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityTypeEnum")
@XmlEnum
public enum EntityTypeEnum {

    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Job")
    JOB("Job"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor");
    private final String value;

    EntityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityTypeEnum fromValue(String v) {
        for (EntityTypeEnum c: EntityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
