//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.05 at 03:40:06 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.ipp.core.IEntity;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Describes OLBTransactions list that are downloaded
 * 			
 * 
 * <p>Java class for OLBTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OLBTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLBDownloadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OLBTxn" type="{http://schema.intuit.com/finance/v3}OLBTxn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OLBTransaction", propOrder = {
    "olbDownloadTime",
    "olbTxn"
})
public class OLBTransaction implements Serializable, IEntity, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OLBDownloadTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date olbDownloadTime;
    @XmlElement(name = "OLBTxn")
    protected List<OLBTxn> olbTxn;

    /**
     * Gets the value of the olbDownloadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOLBDownloadTime() {
        return olbDownloadTime;
    }

    /**
     * Sets the value of the olbDownloadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLBDownloadTime(Date value) {
        this.olbDownloadTime = value;
    }

    /**
     * Gets the value of the olbTxn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the olbTxn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOLBTxn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OLBTxn }
     * 
     * 
     */
    public List<OLBTxn> getOLBTxn() {
        if (olbTxn == null) {
            olbTxn = new ArrayList<OLBTxn>();
        }
        return this.olbTxn;
    }

    /**
     * Sets the value of the olbTxn property.
     * 
     * @param olbTxn
     *     allowed object is
     *     {@link OLBTxn }
     *     
     */
    public void setOLBTxn(List<OLBTxn> olbTxn) {
        this.olbTxn = olbTxn;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OLBTransaction that = ((OLBTransaction) object);
        {
            Date lhsOLBDownloadTime;
            lhsOLBDownloadTime = this.getOLBDownloadTime();
            Date rhsOLBDownloadTime;
            rhsOLBDownloadTime = that.getOLBDownloadTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "olbDownloadTime", lhsOLBDownloadTime), LocatorUtils.property(thatLocator, "olbDownloadTime", rhsOLBDownloadTime), lhsOLBDownloadTime, rhsOLBDownloadTime, (this.olbDownloadTime!= null), (that.olbDownloadTime!= null))) {
                return false;
            }
        }
        {
            List<OLBTxn> lhsOLBTxn;
            lhsOLBTxn = (((this.olbTxn!= null)&&(!this.olbTxn.isEmpty()))?this.getOLBTxn():null);
            List<OLBTxn> rhsOLBTxn;
            rhsOLBTxn = (((that.olbTxn!= null)&&(!that.olbTxn.isEmpty()))?that.getOLBTxn():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "olbTxn", lhsOLBTxn), LocatorUtils.property(thatLocator, "olbTxn", rhsOLBTxn), lhsOLBTxn, rhsOLBTxn, ((this.olbTxn!= null)&&(!this.olbTxn.isEmpty())), ((that.olbTxn!= null)&&(!that.olbTxn.isEmpty())))) {
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
            Date theOLBDownloadTime;
            theOLBDownloadTime = this.getOLBDownloadTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "olbDownloadTime", theOLBDownloadTime), currentHashCode, theOLBDownloadTime, (this.olbDownloadTime!= null));
        }
        {
            List<OLBTxn> theOLBTxn;
            theOLBTxn = (((this.olbTxn!= null)&&(!this.olbTxn.isEmpty()))?this.getOLBTxn():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "olbTxn", theOLBTxn), currentHashCode, theOLBTxn, ((this.olbTxn!= null)&&(!this.olbTxn.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
