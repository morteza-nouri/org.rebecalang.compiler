//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.rebecalang.compiler.modelcompiler.timedrebeca.objectmodel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;


/**
 * <p>Java class for DelayExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DelayExpression">
 *   <complexContent>
 *     <extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression">
 *       <sequence>
 *         <element name="amount" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *       </sequence>
 *       <attribute name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelayExpression", namespace = "http://rebecalang.org/compiler/modelcompiler/timedrebecaexpression", propOrder = {
    "amount"
})
public class DelayExpression
    extends Expression
{

    @XmlElement(required = true)
    protected Expression amount;
    @XmlAttribute(name = "senderName")
    protected String senderName;
    @XmlAttribute(name = "receiverName")
    protected String receiverName;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setAmount(Expression value) {
        this.amount = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

}