//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcAxis1Placement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IfcAxis1Placement">
 *   &lt;complexContent>
 *     &lt;extension base="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcPlacement">
 *       &lt;sequence>
 *         &lt;element name="Axis" type="{https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1}IfcDirection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IfcAxis1Placement", propOrder = {
    "axis"
})
public class IfcAxis1Placement
    extends IfcPlacement
{

    @XmlElementRef(name = "Axis", namespace = "https://standards.buildingsmart.org/IFC/RELEASE/IFC4/Add2TC1", type = JAXBElement.class, required = false)
    protected JAXBElement<IfcDirection> axis;

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IfcDirection }{@code >}
     *     
     */
    public JAXBElement<IfcDirection> getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IfcDirection }{@code >}
     *     
     */
    public void setAxis(JAXBElement<IfcDirection> value) {
        this.axis = value;
    }

}
