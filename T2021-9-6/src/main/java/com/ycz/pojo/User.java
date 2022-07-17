package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-06-15:48  
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {

    private String name;
    private Integer age;
    private String sex;
    private String phone;
    private String qq;
    private String email;
    private String wx;
    private String LearningExperience;
    private String MajorCourses;
    private String ProjectExperience;
}
