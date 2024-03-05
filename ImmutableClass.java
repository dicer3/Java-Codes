import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {
    private final String name;
    private final int regNo;
    final Map<String, String> metadata; 

    ImmutableClass(String name, int reqNo, Map<String, String> metadata){
        this.name = name;
        this.regNo = reqNo;
        
        Map<String, String> tempMap = new HashMap<>();
        for(Map.Entry<String,String> entry: metadata.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = metadata;
    }


    public String getName() { return name; }

    public int getRegNo() { return regNo; }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap = new HashMap<>();
        for(Map.Entry<String,String> entry: metadata.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
