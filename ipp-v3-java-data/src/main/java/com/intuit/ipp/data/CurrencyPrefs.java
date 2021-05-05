//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.05 at 03:40:06 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for CurrencyPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyPrefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiCurrencyEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HomeCurrency" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyPrefs", propOrder = {
    "multiCurrencyEnabled",
    "homeCurrency"
})
public class CurrencyPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MultiCurrencyEnabled")
    protected Boolean multiCurrencyEnabled;
    @XmlElement(name = "HomeCurrency")
    protected ReferenceType homeCurrency;

    /**
     * Gets the value of the multiCurrencyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiCurrencyEnabled() {
        return multiCurrencyEnabled;
    }

    /**
     * Sets the value of the multiCurrencyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiCurrencyEnabled(Boolean value) {
        this.multiCurrencyEnabled = value;
    }

    /**
     * Gets the value of the homeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getHomeCurrency() {
        return homeCurrency;
    }

    /**
     * Sets the value of the homeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setHomeCurrency(ReferenceType value) {
        this.homeCurrency = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CurrencyPrefs that = ((CurrencyPrefs) object);
        {
            Boolean lhsMultiCurrencyEnabled;
            lhsMultiCurrencyEnabled = this.isMultiCurrencyEnabled();
            Boolean rhsMultiCurrencyEnabled;
            rhsMultiCurrencyEnabled = that.isMultiCurrencyEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiCurrencyEnabled", lhsMultiCurrencyEnabled), LocatorUtils.property(thatLocator, "multiCurrencyEnabled", rhsMultiCurrencyEnabled), lhsMultiCurrencyEnabled, rhsMultiCurrencyEnabled, (this.multiCurrencyEnabled!= null), (that.multiCurrencyEnabled!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsHomeCurrency;
            lhsHomeCurrency = this.getHomeCurrency();
            ReferenceType rhsHomeCurrency;
            rhsHomeCurrency = that.getHomeCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "homeCurrency", lhsHomeCurrency), LocatorUtils.property(thatLocator, "homeCurrency", rhsHomeCurrency), lhsHomeCurrency, rhsHomeCurrency, (this.homeCurrency!= null), (that.homeCurrency!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Boolean theMultiCurrencyEnabled;
            theMultiCurrencyEnabled = this.isMultiCurrencyEnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiCurrencyEnabled", theMultiCurrencyEnabled), currentHashCode, theMultiCurrencyEnabled, (this.multiCurrencyEnabled!= null));
        }
        {
            ReferenceType theHomeCurrency;
            theHomeCurrency = this.getHomeCurrency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "homeCurrency", theHomeCurrency), currentHashCode, theHomeCurrency, (this.homeCurrency!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
