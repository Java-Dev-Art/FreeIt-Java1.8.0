package Serializable;

import java.io.*;

public class Serializator {
    public boolean serialization(Carable s, String file){
        boolean flag = false;
        File f =new File(file);
        ObjectOutputStream ostr = null;
        try{
            FileOutputStream fos = new FileOutputStream(f);
            if (fos != null){
                ostr = new ObjectOutputStream(fos);
                ostr.writeObject(s);
                flag = true;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (NotSerializableException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (ostr != null) {
                    ostr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return flag;
    }
    public Carable deserialization(String file) throws InvalidObjectException {
        File fr = new File(file);
        ObjectInputStream istream = null;
        try {
            FileInputStream fis = new FileInputStream(fr);
            istream = new ObjectInputStream(fis);
            Carable carable = (Carable) istream.readObject();
            return carable;
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (InvalidClassException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (istream != null){
                    istream.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Обьект не востановлен");
    }
}
