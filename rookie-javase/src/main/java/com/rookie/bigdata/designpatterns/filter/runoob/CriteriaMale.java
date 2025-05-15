package com.rookie.bigdata.designpatterns.filter.runoob;

/**
 * @Class CriteriaMale
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:26
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
