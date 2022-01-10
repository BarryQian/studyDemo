package com.mydemo.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author qiangang8
 * @date 2021/11/29 20:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonInfo implements Cloneable, Serializable {
    private String name;
    @Override
    public PersonInfo clone() throws CloneNotSupportedException {
        return (PersonInfo)super.clone();
    }
}
