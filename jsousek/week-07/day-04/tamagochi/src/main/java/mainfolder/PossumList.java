package mainfolder;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PossumList {
    List<Possum> allPossums = new ArrayList<>();

    public void addPossum (Possum possum) {
        allPossums.add(possum);
    }

    public Possum getCertainPossum (String nameInput){
         Possum toReturn = allPossums.stream().filter(possum -> nameInput.equals(possum.getName()))
                .findAny().
                        orElse(allPossums.get(0));
         return toReturn;
    }





}
