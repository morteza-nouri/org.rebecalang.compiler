//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.03 at 03:38:36 PM IRST 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.Comparator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;


/**
 * <p>Java class for Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeSystem" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}TypeSystem"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="character" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type", namespace = "http://rebecalang.org/compiler/modelcompiler/corerebecaexpression", propOrder = {
    "typeSystem"
})
@XmlSeeAlso({
    GenericTypeInstance.class,
    GenericType.class,
    OrdinaryPrimitiveType.class,
    ArrayType.class
})
public class Type {

    @XmlElement(required = true)
    protected AbstractTypeSystem typeSystem;
    @XmlAttribute(name = "lineNumber")
    protected Integer lineNumber;
    @XmlAttribute(name = "character")
    protected Integer character;

    /**
     * Gets the value of the typeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractTypeSystem }
     *     
     */
    public AbstractTypeSystem getTypeSystem() {
        return typeSystem;
    }

    /**
     * Sets the value of the typeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractTypeSystem }
     *     
     */
    public void setTypeSystem(AbstractTypeSystem value) {
        this.typeSystem = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the character property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharacter() {
        return character;
    }

    /**
     * Sets the value of the character property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharacter(Integer value) {
        this.character = value;
    }
    
    public String getTypeName() {
		return "General-Type";
	}
	
	public boolean canTypeCastTo(Type target) {
		return this.canTypeUpCastTo(target) || canTypeDownCastTo(target);
	}

	public boolean canTypeDownCastTo(Type target) {
		return target.canTypeUpCastTo(this);
	}

	public boolean canTypeUpCastTo(Type target) {
		return false;
	}
	
	public static Comparator<Type> getCastableComparator() {
		return new Comparator<Type>() {
			public int compare(Type base, Type target) {
				if (!base.canTypeUpCastTo(target))
					return 1;
				return 0;
			}
		};
	}

	public static Comparator<Type> getExactComparator() {
		return new Comparator<Type>() {
			public int compare(Type base, Type target) {
				if (base instanceof OrdinaryPrimitiveType) {
					if (base != target)
						return 1;
				} else if (base instanceof ArrayType) {
					if (!base.canTypeUpCastTo(target))
						return 1;
					ArrayType baseArrayType = (ArrayType) base;
					ArrayType targetArrayType = (ArrayType) target;
					if (baseArrayType.getOrdinaryPrimitiveType() != targetArrayType
							.getOrdinaryPrimitiveType()) {
						return 1;
					}
				}
				return 0;
			}
		};
	}

}
