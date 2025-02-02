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
 * <p>Java class for IfcRecurrenceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IfcRecurrenceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="daily"/>
 *     &lt;enumeration value="weekly"/>
 *     &lt;enumeration value="monthly_by_day_of_month"/>
 *     &lt;enumeration value="monthly_by_position"/>
 *     &lt;enumeration value="by_day_count"/>
 *     &lt;enumeration value="by_weekday_count"/>
 *     &lt;enumeration value="yearly_by_day_of_month"/>
 *     &lt;enumeration value="yearly_by_position"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IfcRecurrenceTypeEnum")
@XmlEnum
public enum IfcRecurrenceTypeEnum {

    @XmlEnumValue("daily")
    DAILY("daily"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("monthly_by_day_of_month")
    MONTHLY_BY_DAY_OF_MONTH("monthly_by_day_of_month"),
    @XmlEnumValue("monthly_by_position")
    MONTHLY_BY_POSITION("monthly_by_position"),
    @XmlEnumValue("by_day_count")
    BY_DAY_COUNT("by_day_count"),
    @XmlEnumValue("by_weekday_count")
    BY_WEEKDAY_COUNT("by_weekday_count"),
    @XmlEnumValue("yearly_by_day_of_month")
    YEARLY_BY_DAY_OF_MONTH("yearly_by_day_of_month"),
    @XmlEnumValue("yearly_by_position")
    YEARLY_BY_POSITION("yearly_by_position");
    private final String value;

    IfcRecurrenceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IfcRecurrenceTypeEnum fromValue(String v) {
        for (IfcRecurrenceTypeEnum c: IfcRecurrenceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
