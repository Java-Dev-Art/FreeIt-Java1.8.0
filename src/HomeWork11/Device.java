package HomeWork11;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
        "name",
        "origin",
        "price",
        "configuration"
})
public class Device {
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlElement(required = true)
    private String name;
    @XmlAttribute(required = false)
    private String origin;
    @XmlAttribute(required =false)
    private int price;
    @XmlID
    private String id;
    @XmlElement(required = true)
    private Configuration configuration;
    public Device(){}
    public Device(String name, String origin, int price, String id, Configuration configuration) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.id = id;
        this.configuration = configuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
    public String toString(){
        return "\nID :" + getId() + "\n\tName :" + getName() + "\n\tPrice : " + getPrice() +
                "\n\tOrigin :" + getOrigin();
    }
    @XmlRootElement
    @XmlType(name = "configuration", propOrder = {
            "usb",
            "com",
            "lpt",
            "critical"
    })

    public static class Configuration{
        private boolean usb;
        private boolean com;
        private boolean lpt;
        private boolean critical;
        public Configuration(){}

        public Configuration(boolean usb, boolean com, boolean lpt, boolean critical) {
            this.usb = usb;
            this.com = com;
            this.lpt = lpt;
            this.critical = critical;
        }

        public boolean isUsb() {
            return usb;
        }

        public void setUsb(boolean usb) {
            this.usb = usb;
        }

        public boolean isCom() {
            return com;
        }

        public void setCom(boolean com) {
            this.com = com;
        }

        public boolean isLpt() {
            return lpt;
        }

        public void setLpt(boolean lpt) {
            this.lpt = lpt;
        }

        public boolean isCritical() {
            return critical;
        }

        public void setCritical(boolean critical) {
            this.critical = critical;
        }
        public String toString(){
            return "\nConfiguration :" +"\n\tUSB :" + isUsb() + "\n\tLPT :" + isLpt() + "\n\tCOM :" + isLpt() +
                    "\n\tCritical :" + isCritical();
        }
    }
}
