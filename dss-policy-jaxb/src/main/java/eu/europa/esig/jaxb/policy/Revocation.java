//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.07 at 02:17:11 PM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RevocationFreshness" type="{http://dss.esig.europa.eu/validation/diagnostic}TimeConstraint"/>
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateType"/>
 *         &lt;element name="CACertificate" type="{http://dss.esig.europa.eu/validation/diagnostic}CertificateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "revocationFreshness",
    "signingCertificate",
    "caCertificate"
})
public class Revocation {

    @XmlElement(name = "RevocationFreshness", required = true)
    protected TimeConstraint revocationFreshness;
    @XmlElement(name = "SigningCertificate", required = true)
    protected CertificateType signingCertificate;
    @XmlElement(name = "CACertificate", required = true)
    protected CertificateType caCertificate;

    /**
     * Gets the value of the revocationFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getRevocationFreshness() {
        return revocationFreshness;
    }

    /**
     * Sets the value of the revocationFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setRevocationFreshness(TimeConstraint value) {
        this.revocationFreshness = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setSigningCertificate(CertificateType value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the caCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getCACertificate() {
        return caCertificate;
    }

    /**
     * Sets the value of the caCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setCACertificate(CertificateType value) {
        this.caCertificate = value;
    }

}
