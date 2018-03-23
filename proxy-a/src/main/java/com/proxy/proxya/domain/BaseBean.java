/**
 * @copyright remark holdings
 */
package com.proxy.proxya.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author kobe_t
 * @date 2018/3/23 9:00
 */
@Data
public class BaseBean {

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
