//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.05 at 03:40:06 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * 
 *                  Product: QBW
 *                  Description: Provides upload/writeback activity for a given period of time. Query activity using 
 *                               StartSyncTMS OR EndSyncTMS
 *             
 * 
 * <p>Java class for SyncActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LatestUploadDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LatestWriteBackDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SyncType" type="{http://schema.intuit.com/finance/v3}SyncType" minOccurs="0"/&gt;
 *         &lt;element name="StartSyncTMS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndSyncTMS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncActivity", propOrder = {
    "latestUploadDateTime",
    "latestWriteBackDateTime",
    "syncType",
    "startSyncTMS",
    "endSyncTMS",
    "entityName",
    "entityRowCount"
})
public class SyncActivity
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LatestUploadDateTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date latestUploadDateTime;
    @XmlElement(name = "LatestWriteBackDateTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date latestWriteBackDateTime;
    @XmlElement(name = "SyncType")
    @XmlSchemaType(name = "string")
    protected SyncType syncType;
    @XmlElement(name = "StartSyncTMS", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date startSyncTMS;
    @XmlElement(name = "EndSyncTMS", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date endSyncTMS;
    @XmlElement(name = "EntityName")
    protected String entityName;
    @XmlElement(name = "EntityRowCount")
    protected Integer entityRowCount;

    /**
     * Gets the value of the latestUploadDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLatestUploadDateTime() {
        return latestUploadDateTime;
    }

    /**
     * Sets the value of the latestUploadDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestUploadDateTime(Date value) {
        this.latestUploadDateTime = value;
    }

    /**
     * Gets the value of the latestWriteBackDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLatestWriteBackDateTime() {
        return latestWriteBackDateTime;
    }

    /**
     * Sets the value of the latestWriteBackDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestWriteBackDateTime(Date value) {
        this.latestWriteBackDateTime = value;
    }

    /**
     * Gets the value of the syncType property.
     * 
     * @return
     *     possible object is
     *     {@link SyncType }
     *     
     */
    public SyncType getSyncType() {
        return syncType;
    }

    /**
     * Sets the value of the syncType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncType }
     *     
     */
    public void setSyncType(SyncType value) {
        this.syncType = value;
    }

    /**
     * Gets the value of the startSyncTMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartSyncTMS() {
        return startSyncTMS;
    }

    /**
     * Sets the value of the startSyncTMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSyncTMS(Date value) {
        this.startSyncTMS = value;
    }

    /**
     * Gets the value of the endSyncTMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndSyncTMS() {
        return endSyncTMS;
    }

    /**
     * Sets the value of the endSyncTMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSyncTMS(Date value) {
        this.endSyncTMS = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntityRowCount() {
        return entityRowCount;
    }

    /**
     * Sets the value of the entityRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntityRowCount(Integer value) {
        this.entityRowCount = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SyncActivity that = ((SyncActivity) object);
        {
            Date lhsLatestUploadDateTime;
            lhsLatestUploadDateTime = this.getLatestUploadDateTime();
            Date rhsLatestUploadDateTime;
            rhsLatestUploadDateTime = that.getLatestUploadDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestUploadDateTime", lhsLatestUploadDateTime), LocatorUtils.property(thatLocator, "latestUploadDateTime", rhsLatestUploadDateTime), lhsLatestUploadDateTime, rhsLatestUploadDateTime, (this.latestUploadDateTime!= null), (that.latestUploadDateTime!= null))) {
                return false;
            }
        }
        {
            Date lhsLatestWriteBackDateTime;
            lhsLatestWriteBackDateTime = this.getLatestWriteBackDateTime();
            Date rhsLatestWriteBackDateTime;
            rhsLatestWriteBackDateTime = that.getLatestWriteBackDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestWriteBackDateTime", lhsLatestWriteBackDateTime), LocatorUtils.property(thatLocator, "latestWriteBackDateTime", rhsLatestWriteBackDateTime), lhsLatestWriteBackDateTime, rhsLatestWriteBackDateTime, (this.latestWriteBackDateTime!= null), (that.latestWriteBackDateTime!= null))) {
                return false;
            }
        }
        {
            SyncType lhsSyncType;
            lhsSyncType = this.getSyncType();
            SyncType rhsSyncType;
            rhsSyncType = that.getSyncType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncType", lhsSyncType), LocatorUtils.property(thatLocator, "syncType", rhsSyncType), lhsSyncType, rhsSyncType, (this.syncType!= null), (that.syncType!= null))) {
                return false;
            }
        }
        {
            Date lhsStartSyncTMS;
            lhsStartSyncTMS = this.getStartSyncTMS();
            Date rhsStartSyncTMS;
            rhsStartSyncTMS = that.getStartSyncTMS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startSyncTMS", lhsStartSyncTMS), LocatorUtils.property(thatLocator, "startSyncTMS", rhsStartSyncTMS), lhsStartSyncTMS, rhsStartSyncTMS, (this.startSyncTMS!= null), (that.startSyncTMS!= null))) {
                return false;
            }
        }
        {
            Date lhsEndSyncTMS;
            lhsEndSyncTMS = this.getEndSyncTMS();
            Date rhsEndSyncTMS;
            rhsEndSyncTMS = that.getEndSyncTMS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endSyncTMS", lhsEndSyncTMS), LocatorUtils.property(thatLocator, "endSyncTMS", rhsEndSyncTMS), lhsEndSyncTMS, rhsEndSyncTMS, (this.endSyncTMS!= null), (that.endSyncTMS!= null))) {
                return false;
            }
        }
        {
            String lhsEntityName;
            lhsEntityName = this.getEntityName();
            String rhsEntityName;
            rhsEntityName = that.getEntityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityName", lhsEntityName), LocatorUtils.property(thatLocator, "entityName", rhsEntityName), lhsEntityName, rhsEntityName, (this.entityName!= null), (that.entityName!= null))) {
                return false;
            }
        }
        {
            Integer lhsEntityRowCount;
            lhsEntityRowCount = this.getEntityRowCount();
            Integer rhsEntityRowCount;
            rhsEntityRowCount = that.getEntityRowCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entityRowCount", lhsEntityRowCount), LocatorUtils.property(thatLocator, "entityRowCount", rhsEntityRowCount), lhsEntityRowCount, rhsEntityRowCount, (this.entityRowCount!= null), (that.entityRowCount!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Date theLatestUploadDateTime;
            theLatestUploadDateTime = this.getLatestUploadDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestUploadDateTime", theLatestUploadDateTime), currentHashCode, theLatestUploadDateTime, (this.latestUploadDateTime!= null));
        }
        {
            Date theLatestWriteBackDateTime;
            theLatestWriteBackDateTime = this.getLatestWriteBackDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestWriteBackDateTime", theLatestWriteBackDateTime), currentHashCode, theLatestWriteBackDateTime, (this.latestWriteBackDateTime!= null));
        }
        {
            SyncType theSyncType;
            theSyncType = this.getSyncType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncType", theSyncType), currentHashCode, theSyncType, (this.syncType!= null));
        }
        {
            Date theStartSyncTMS;
            theStartSyncTMS = this.getStartSyncTMS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startSyncTMS", theStartSyncTMS), currentHashCode, theStartSyncTMS, (this.startSyncTMS!= null));
        }
        {
            Date theEndSyncTMS;
            theEndSyncTMS = this.getEndSyncTMS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endSyncTMS", theEndSyncTMS), currentHashCode, theEndSyncTMS, (this.endSyncTMS!= null));
        }
        {
            String theEntityName;
            theEntityName = this.getEntityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityName", theEntityName), currentHashCode, theEntityName, (this.entityName!= null));
        }
        {
            Integer theEntityRowCount;
            theEntityRowCount = this.getEntityRowCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entityRowCount", theEntityRowCount), currentHashCode, theEntityRowCount, (this.entityRowCount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
