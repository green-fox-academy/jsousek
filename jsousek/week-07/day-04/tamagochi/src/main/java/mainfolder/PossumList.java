package mainfolder;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PossumList extends Possum{
    List<Possum> allPossums = new ArrayList<>();

    public void addPossum (Possum possum){
        allPossums.add(possum);
    }




}
