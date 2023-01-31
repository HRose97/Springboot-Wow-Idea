package com.fujitsu.wow.pojo.wincare2;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hzh
 * @since 2022-07-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class W2_Bumon implements Serializable {

    public static final long serialVersionUID=1L;

    public Integer id;

    public String yid;

    public String down;

    public Date day;

    public String ip;


}
