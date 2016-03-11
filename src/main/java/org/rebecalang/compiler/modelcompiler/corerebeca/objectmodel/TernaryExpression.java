//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.09 at 09:20:00 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TernaryExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TernaryExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *         &lt;element name="left" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *         &lt;element name="right" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TernaryExpression", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", propOrder = {
    "condition",
    "left",
    "right"
})
public class TernaryExpression
    extends Expression
{

    @XmlElement(namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", required = true)
    protected Expression condition;
    @XmlElement(namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", required = true)
    protected Expression left;
    @XmlElement(namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", required = true)
    protected Expression right;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setCondition(Expression value) {
        this.condition = value;
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setLeft(Expression value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setRight(Expression value) {
        this.right = value;
    }

}
