//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.07 at 02:17:11 PM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterSignatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CounterSignatureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDataExistence" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint"/>
 *         &lt;element name="ReferenceDataIntact" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint"/>
 *         &lt;element name="SignatureIntact" type="{http://dss.esig.europa.eu/validation/diagnostic}LevelConstraint"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Level" type="{http://dss.esig.europa.eu/validation/diagnostic}level" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterSignatureType", propOrder = {
    "referenceDataExistence",
    "referenceDataIntact",
    "signatureIntact"
})
public class CounterSignatureType {

    @XmlElement(name = "ReferenceDataExistence", required = true)
    protected LevelConstraint referenceDataExistence;
    @XmlElement(name = "ReferenceDataIntact", required = true)
    protected LevelConstraint referenceDataIntact;
    @XmlElement(name = "SignatureIntact", required = true)
    protected LevelConstraint signatureIntact;
    @XmlAttribute(name = "Level")
    protected Level level;

    /**
     * Gets the value of the referenceDataExistence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataExistence() {
        return referenceDataExistence;
    }

    /**
     * Sets the value of the referenceDataExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataExistence(LevelConstraint value) {
        this.referenceDataExistence = value;
    }

    /**
     * Gets the value of the referenceDataIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataIntact() {
        return referenceDataIntact;
    }

    /**
     * Sets the value of the referenceDataIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataIntact(LevelConstraint value) {
        this.referenceDataIntact = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureIntact(LevelConstraint value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

}
