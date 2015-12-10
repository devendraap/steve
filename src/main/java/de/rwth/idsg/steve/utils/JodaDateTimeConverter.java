package de.rwth.idsg.steve.utils;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import static com.google.common.base.Strings.isNullOrEmpty;

/**
 * Joda-Time and XSD represent data and time information according to ISO 8601.
 *
 * @author Sevket Goekay <goekay@dbis.rwth-aachen.de>
 * @since 20.10.2014
 */
public class JodaDateTimeConverter extends XmlAdapter<String, DateTime> {

    @Override
    public DateTime unmarshal(String v) throws Exception {
        if (isNullOrEmpty(v)) {
            return null;
        } else {
            return new DateTime(v);
        }
    }

    @Override
    public String marshal(DateTime v) throws Exception {
        if (v == null) {
            return null;
        } else {
            return v.toString();
        }
    }
}
