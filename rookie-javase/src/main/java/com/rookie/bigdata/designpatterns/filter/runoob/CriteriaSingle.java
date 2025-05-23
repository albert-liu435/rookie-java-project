package com.rookie.bigdata.designpatterns.filter.runoob;

/**
 * @Class CriteriaSingle
 * @Description
 * @Author rookie
 * @Date 2025/5/15 16:27
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
