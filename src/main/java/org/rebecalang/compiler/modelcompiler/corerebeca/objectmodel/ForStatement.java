//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.09 at 09:20:00 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Statement">
 *       &lt;sequence>
 *         &lt;element ref="{http://rebecalang.org/compiler/modelcompiler/corerebeca}ForInitializer"/>
 *         &lt;element name="condition" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *         &lt;element name="forIncrement" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statement" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Statement"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForStatement", propOrder = {
    "forInitializer",
    "condition",
    "forIncrement",
    "statement"
})
public class ForStatement
    extends Statement
{

    @XmlElement(name = "ForInitializer", required = true)
    protected ForInitializer forInitializer;
    @XmlElement(required = true)
    protected Expression condition;
    protected List<Expression> forIncrement;
    @XmlElement(required = true)
    protected Statement statement;

    /**
     * Gets the value of the forInitializer property.
     * 
     * @return
     *     possible object is
     *     {@link ForInitializer }
     *     
     */
    public ForInitializer getForInitializer() {
        return forInitializer;
    }

    /**
     * Sets the value of the forInitializer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForInitializer }
     *     
     */
    public void setForInitializer(ForInitializer value) {
        this.forInitializer = value;
    }

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
     * Gets the value of the forIncrement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forIncrement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForIncrement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getForIncrement() {
        if (forIncrement == null) {
            forIncrement = new ArrayList<Expression>();
        }
        return this.forIncrement;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
