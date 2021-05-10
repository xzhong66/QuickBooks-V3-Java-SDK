//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.05 at 03:40:06 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for DiscountOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PercentBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountOverride", propOrder = {
    "discountRef",
    "percentBased",
    "discountPercent",
    "discountAccountRef"
})
@XmlSeeAlso({
    DiscountLineDetail.class
})
public class DiscountOverride implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DiscountRef")
    protected ReferenceType discountRef;
    @XmlElement(name = "PercentBased")
    protected Boolean percentBased;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "DiscountAccountRef")
    protected ReferenceType discountAccountRef;

    /**
     * Gets the value of the discountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDiscountRef() {
        return discountRef;
    }

    /**
     * Sets the value of the discountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDiscountRef(ReferenceType value) {
        this.discountRef = value;
    }

    /**
     * Gets the value of the percentBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPercentBased() {
        return percentBased;
    }

    /**
     * Sets the value of the percentBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentBased(Boolean value) {
        this.percentBased = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the discountAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDiscountAccountRef() {
        return discountAccountRef;
    }

    /**
     * Sets the value of the discountAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDiscountAccountRef(ReferenceType value) {
        this.discountAccountRef = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DiscountOverride that = ((DiscountOverride) object);
        {
            ReferenceType lhsDiscountRef;
            lhsDiscountRef = this.getDiscountRef();
            ReferenceType rhsDiscountRef;
            rhsDiscountRef = that.getDiscountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountRef", lhsDiscountRef), LocatorUtils.property(thatLocator, "discountRef", rhsDiscountRef), lhsDiscountRef, rhsDiscountRef, (this.discountRef!= null), (that.discountRef!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPercentBased;
            lhsPercentBased = this.isPercentBased();
            Boolean rhsPercentBased;
            rhsPercentBased = that.isPercentBased();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percentBased", lhsPercentBased), LocatorUtils.property(thatLocator, "percentBased", rhsPercentBased), lhsPercentBased, rhsPercentBased, (this.percentBased!= null), (that.percentBased!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountPercent;
            lhsDiscountPercent = this.getDiscountPercent();
            BigDecimal rhsDiscountPercent;
            rhsDiscountPercent = that.getDiscountPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountPercent", lhsDiscountPercent), LocatorUtils.property(thatLocator, "discountPercent", rhsDiscountPercent), lhsDiscountPercent, rhsDiscountPercent, (this.discountPercent!= null), (that.discountPercent!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDiscountAccountRef;
            lhsDiscountAccountRef = this.getDiscountAccountRef();
            ReferenceType rhsDiscountAccountRef;
            rhsDiscountAccountRef = that.getDiscountAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountRef", lhsDiscountAccountRef), LocatorUtils.property(thatLocator, "discountAccountRef", rhsDiscountAccountRef), lhsDiscountAccountRef, rhsDiscountAccountRef, (this.discountAccountRef!= null), (that.discountAccountRef!= null))) {
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
            ReferenceType theDiscountRef;
            theDiscountRef = this.getDiscountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountRef", theDiscountRef), currentHashCode, theDiscountRef, (this.discountRef!= null));
        }
        {
            Boolean thePercentBased;
            thePercentBased = this.isPercentBased();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentBased", thePercentBased), currentHashCode, thePercentBased, (this.percentBased!= null));
        }
        {
            BigDecimal theDiscountPercent;
            theDiscountPercent = this.getDiscountPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountPercent", theDiscountPercent), currentHashCode, theDiscountPercent, (this.discountPercent!= null));
        }
        {
            ReferenceType theDiscountAccountRef;
            theDiscountAccountRef = this.getDiscountAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountRef", theDiscountAccountRef), currentHashCode, theDiscountAccountRef, (this.discountAccountRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
