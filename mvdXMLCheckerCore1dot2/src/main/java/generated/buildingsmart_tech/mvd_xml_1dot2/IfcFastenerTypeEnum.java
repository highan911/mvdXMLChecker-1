//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.27 at 01:59:57 PM CEST 
//


package generated.buildingsmart_tech.mvd_xml_1dot2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IfcFastenerTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcFastenerTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="glue"/>
 *     &lt;enumeration value="mortar"/>
 *     &lt;enumeration value="weld"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcFastenerTypeEnum")
@XmlEnum
public enum IfcFastenerTypeEnum {

    @XmlEnumValue("glue")
    GLUE("glue"),
    @XmlEnumValue("mortar")
    MORTAR("mortar"),
    @XmlEnumValue("weld")
    WELD("weld"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcFastenerTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcFastenerTypeEnum fromValue(String v) {
        for (IfcFastenerTypeEnum c: IfcFastenerTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
