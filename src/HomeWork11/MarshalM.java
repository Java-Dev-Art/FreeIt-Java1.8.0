package HomeWork11;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshalM {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Devices.class);
            Marshaller m = context.createMarshaller();
            Devices devices = new Devices() {
                {
                    Device.Configuration conf = new Device.Configuration(true,true,true,false);
                    Device dev = new Device("Toll","POL",756,"7789450",conf);
                    this.add(dev);
                    conf = new Device.Configuration(true,false,true,false);
                    dev = new Device("Dell","WGR",1456,"7756tr",conf);
                    this.add(dev);
                }
            };
            m.marshal(devices,new FileOutputStream("devMarshal.xml"));
            m.marshal(devices,System.out);
            System.out.println("XML - file was create");
        }catch (FileNotFoundException e){
            System.err.println("XML - file not found " + e);
        }catch (JAXBException ex){
            System.err.println("JAXB Exception " + ex);
        }
    }
}
