package com.rookie.bigdata.designpatterns.filter.runoob;

/**
 * @Class CriteriaFemale
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:27
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
