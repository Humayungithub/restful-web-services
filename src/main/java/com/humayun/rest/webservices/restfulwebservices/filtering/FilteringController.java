package com.humayun.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

    @GetMapping("/filtering") // Filter department2
    public MappingJacksonValue filtering() {
        Department department = new Department("CSE","EEE","BBA");

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(department);

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("department1","department3");

        FilterProvider filters =
                new SimpleFilterProvider().addFilter("DepartmentFilter", filter );

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

    @GetMapping("/filtering-list") //Filter department2, department3
    public MappingJacksonValue filteringList() {
        List<Department> list = Arrays.asList(new Department("CSE","EEE","BBA"), new Department("ARC","BIO","PHA"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("department2","department3");

        FilterProvider filters =
                new SimpleFilterProvider().addFilter("DepartmentFilter", filter );

        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }
}
