package com.rookie.bigdata.designpatterns.filter.runoob;

/**
 * @Class Criteria
 * @Description 为标准（Criteria）创建一个接口。
 * @Author rookie
 * @Date 2025/5/15 16:26
 * @Version 1.0
 */
import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
