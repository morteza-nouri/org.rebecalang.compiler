//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.09 at 09:20:00 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Literal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Literal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression">
 *       &lt;attribute name="literalValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Literal", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression")
public class Literal
    extends Expression
{

    @XmlAttribute
    protected String literalValue;

    /**
     * Gets the value of the literalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiteralValue() {
        return literalValue;
    }

    /**
     * Sets the value of the literalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiteralValue(String value) {
        this.literalValue = value;
    }

}
