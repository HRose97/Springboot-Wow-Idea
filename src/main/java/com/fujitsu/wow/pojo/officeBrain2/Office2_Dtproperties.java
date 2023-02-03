package com.fujitsu.wow.pojo.officeBrain2;

import lombok.*;

@Data
@Builder
//可以生成无参构造方法
@NoArgsConstructor
//添加一个构造函数，该构造函数含有所有已声明字段属性参数
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Office2_Dtproperties {



    public int id;

    public int objectid;

    public String property;

    public String value;

    public String uvalue;

    public String lvalue;

    public int version;



}
