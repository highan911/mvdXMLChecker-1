//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcSurfaceReinforcementArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcSurfaceReinforcementArea">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcStructuralLoadOrResult">
 *       &lt;attribute name="SurfaceReinforcement1">
 *         &lt;simpleType>
 *           &lt;restriction>
 *             &lt;simpleType>
 *               &lt;list itemType="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *             &lt;/simpleType>
 *             &lt;minLength value="2"/>
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SurfaceReinforcement2">
 *         &lt;simpleType>
 *           &lt;restriction>
 *             &lt;simpleType>
 *               &lt;list itemType="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcLengthMeasure" />
 *             &lt;/simpleType>
 *             &lt;minLength value="2"/>
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ShearReinforcement" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcRatioMeasure" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcSurfaceReinforcementArea")
public class IfcSurfaceReinforcementArea
    extends IfcStructuralLoadOrResult
{

    @XmlAttribute(name = "SurfaceReinforcement1")
    protected List<Double> surfaceReinforcement1;
    @XmlAttribute(name = "SurfaceReinforcement2")
    protected List<Double> surfaceReinforcement2;
    @XmlAttribute(name = "ShearReinforcement")
    protected Double shearReinforcement;

    /**
     * Gets the value of the surfaceReinforcement1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceReinforcement1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceReinforcement1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getSurfaceReinforcement1() {
        if (surfaceReinforcement1 == null) {
            surfaceReinforcement1 = new ArrayList<Double>();
        }
        return this.surfaceReinforcement1;
    }

    /**
     * Gets the value of the surfaceReinforcement2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surfaceReinforcement2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurfaceReinforcement2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getSurfaceReinforcement2() {
        if (surfaceReinforcement2 == null) {
            surfaceReinforcement2 = new ArrayList<Double>();
        }
        return this.surfaceReinforcement2;
    }

    /**
     * Gets the value of the shearReinforcement property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShearReinforcement() {
        return shearReinforcement;
    }

    /**
     * Sets the value of the shearReinforcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShearReinforcement(Double value) {
        this.shearReinforcement = value;
    }

}
