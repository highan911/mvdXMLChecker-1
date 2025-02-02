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
 * <p>Java class for IfcDistributionSystemEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcDistributionSystemEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airconditioning"/>
 *     &lt;enumeration value="audiovisual"/>
 *     &lt;enumeration value="chemical"/>
 *     &lt;enumeration value="chilledwater"/>
 *     &lt;enumeration value="communication"/>
 *     &lt;enumeration value="compressedair"/>
 *     &lt;enumeration value="condenserwater"/>
 *     &lt;enumeration value="control"/>
 *     &lt;enumeration value="conveying"/>
 *     &lt;enumeration value="data"/>
 *     &lt;enumeration value="disposal"/>
 *     &lt;enumeration value="domesticcoldwater"/>
 *     &lt;enumeration value="domestichotwater"/>
 *     &lt;enumeration value="drainage"/>
 *     &lt;enumeration value="earthing"/>
 *     &lt;enumeration value="electrical"/>
 *     &lt;enumeration value="electroacoustic"/>
 *     &lt;enumeration value="exhaust"/>
 *     &lt;enumeration value="fireprotection"/>
 *     &lt;enumeration value="fuel"/>
 *     &lt;enumeration value="gas"/>
 *     &lt;enumeration value="hazardous"/>
 *     &lt;enumeration value="heating"/>
 *     &lt;enumeration value="lighting"/>
 *     &lt;enumeration value="lightningprotection"/>
 *     &lt;enumeration value="municipalsolidwaste"/>
 *     &lt;enumeration value="oil"/>
 *     &lt;enumeration value="operational"/>
 *     &lt;enumeration value="powergeneration"/>
 *     &lt;enumeration value="rainwater"/>
 *     &lt;enumeration value="refrigeration"/>
 *     &lt;enumeration value="security"/>
 *     &lt;enumeration value="sewage"/>
 *     &lt;enumeration value="signal"/>
 *     &lt;enumeration value="stormwater"/>
 *     &lt;enumeration value="telephone"/>
 *     &lt;enumeration value="tv"/>
 *     &lt;enumeration value="vacuum"/>
 *     &lt;enumeration value="vent"/>
 *     &lt;enumeration value="ventilation"/>
 *     &lt;enumeration value="wastewater"/>
 *     &lt;enumeration value="watersupply"/>
 *     &lt;enumeration value="userdefined"/>
 *     &lt;enumeration value="notdefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcDistributionSystemEnum")
@XmlEnum
public enum IfcDistributionSystemEnum {

    @XmlEnumValue("airconditioning")
    AIRCONDITIONING("airconditioning"),
    @XmlEnumValue("audiovisual")
    AUDIOVISUAL("audiovisual"),
    @XmlEnumValue("chemical")
    CHEMICAL("chemical"),
    @XmlEnumValue("chilledwater")
    CHILLEDWATER("chilledwater"),
    @XmlEnumValue("communication")
    COMMUNICATION("communication"),
    @XmlEnumValue("compressedair")
    COMPRESSEDAIR("compressedair"),
    @XmlEnumValue("condenserwater")
    CONDENSERWATER("condenserwater"),
    @XmlEnumValue("control")
    CONTROL("control"),
    @XmlEnumValue("conveying")
    CONVEYING("conveying"),
    @XmlEnumValue("data")
    DATA("data"),
    @XmlEnumValue("disposal")
    DISPOSAL("disposal"),
    @XmlEnumValue("domesticcoldwater")
    DOMESTICCOLDWATER("domesticcoldwater"),
    @XmlEnumValue("domestichotwater")
    DOMESTICHOTWATER("domestichotwater"),
    @XmlEnumValue("drainage")
    DRAINAGE("drainage"),
    @XmlEnumValue("earthing")
    EARTHING("earthing"),
    @XmlEnumValue("electrical")
    ELECTRICAL("electrical"),
    @XmlEnumValue("electroacoustic")
    ELECTROACOUSTIC("electroacoustic"),
    @XmlEnumValue("exhaust")
    EXHAUST("exhaust"),
    @XmlEnumValue("fireprotection")
    FIREPROTECTION("fireprotection"),
    @XmlEnumValue("fuel")
    FUEL("fuel"),
    @XmlEnumValue("gas")
    GAS("gas"),
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),
    @XmlEnumValue("heating")
    HEATING("heating"),
    @XmlEnumValue("lighting")
    LIGHTING("lighting"),
    @XmlEnumValue("lightningprotection")
    LIGHTNINGPROTECTION("lightningprotection"),
    @XmlEnumValue("municipalsolidwaste")
    MUNICIPALSOLIDWASTE("municipalsolidwaste"),
    @XmlEnumValue("oil")
    OIL("oil"),
    @XmlEnumValue("operational")
    OPERATIONAL("operational"),
    @XmlEnumValue("powergeneration")
    POWERGENERATION("powergeneration"),
    @XmlEnumValue("rainwater")
    RAINWATER("rainwater"),
    @XmlEnumValue("refrigeration")
    REFRIGERATION("refrigeration"),
    @XmlEnumValue("security")
    SECURITY("security"),
    @XmlEnumValue("sewage")
    SEWAGE("sewage"),
    @XmlEnumValue("signal")
    SIGNAL("signal"),
    @XmlEnumValue("stormwater")
    STORMWATER("stormwater"),
    @XmlEnumValue("telephone")
    TELEPHONE("telephone"),
    @XmlEnumValue("tv")
    TV("tv"),
    @XmlEnumValue("vacuum")
    VACUUM("vacuum"),
    @XmlEnumValue("vent")
    VENT("vent"),
    @XmlEnumValue("ventilation")
    VENTILATION("ventilation"),
    @XmlEnumValue("wastewater")
    WASTEWATER("wastewater"),
    @XmlEnumValue("watersupply")
    WATERSUPPLY("watersupply"),
    @XmlEnumValue("userdefined")
    USERDEFINED("userdefined"),
    @XmlEnumValue("notdefined")
    NOTDEFINED("notdefined");
    private final String value;

    IfcDistributionSystemEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcDistributionSystemEnum fromValue(String v) {
        for (IfcDistributionSystemEnum c: IfcDistributionSystemEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
