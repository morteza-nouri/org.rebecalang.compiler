//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.03 at 03:38:36 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RebecInstantiationPrimary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RebecInstantiationPrimary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}PrimaryExpression">
 *       &lt;sequence>
 *         &lt;element name="bindings" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="arguments" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RebecInstantiationPrimary", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", propOrder = {
    "bindings",
    "arguments"
})
public class RebecInstantiationPrimary
    extends PrimaryExpression
{

    protected List<Expression> bindings;
    protected List<Expression> arguments;

    /**
     * Gets the value of the bindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getBindings() {
        if (bindings == null) {
            bindings = new ArrayList<Expression>();
        }
        return this.bindings;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arguments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArguments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getArguments() {
        if (arguments == null) {
            arguments = new ArrayList<Expression>();
        }
        return this.arguments;
    }

}
