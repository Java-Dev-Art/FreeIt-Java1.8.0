package HomeWork11;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Devices {
    @XmlElement(name = "device")
    private ArrayList<Device> list = new ArrayList<>();
    public Devices(){
        super();
    }

    public void setList(ArrayList<Device> list) {
        this.list = list;
    }
    public boolean add(Device device){
        return list.add(device);
    }
    @Override
    public String toString(){
        return "Devices [list =" + list + "]";
    }
}

