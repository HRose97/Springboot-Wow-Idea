package com.fujitsu.wow.pojo.officeBrain2;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
//可以生成无参构造方法
@NoArgsConstructor
//添加一个构造函数，该构造函数含有所有已声明字段属性参数
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("Cｶﾃｺﾞﾘ")
public class Office2_CCategory implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ｶﾃｺﾞﾘCD")
    public String categoryCD;

    @TableField("ｶﾃｺﾞﾘ名")
    public String categoryName;

    @TableField("ｶﾃｺﾞﾘ詳細")
    public String categoryDetails;

    @TableField("表示順")
    public String displayOrder;

    @TableField("担当会社")
    public String companyInCharge;

    @TableField("mailto")
    public String mailto;

    @TableField("mailcc")
    public String mailcc;

}
