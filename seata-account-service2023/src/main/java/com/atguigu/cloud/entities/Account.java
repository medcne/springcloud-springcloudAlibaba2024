package com.atguigu.cloud.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 表名：t_account
*/
@Setter
@Getter
@Table(name = "t_account")
public class Account {
    /**
     * id
     * -- GETTER --
     *  获取id
     *
     *
     * -- SETTER --
     *  设置id
     *
     @return id - id
      * @param id id

     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 用户id
     * -- GETTER --
     *  获取用户id
     *
     *
     * -- SETTER --
     *  设置用户id
     *
     @return userId - 用户id
      * @param userId 用户id

     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 总额度
     * -- GETTER --
     *  获取总额度
     *
     *
     * -- SETTER --
     *  设置总额度
     *
     @return total - 总额度
      * @param total 总额度

     */
    private Long total;

    /**
     * 已用账户余额
     * -- GETTER --
     *  获取已用账户余额
     *
     *
     * -- SETTER --
     *  设置已用账户余额
     *
     @return used - 已用账户余额
      * @param used 已用账户余额

     */
    private Long used;

    /**
     * 剩余可用额度
     * -- GETTER --
     *  获取剩余可用额度
     *
     *
     * -- SETTER --
     *  设置剩余可用额度
     *
     @return residue - 剩余可用额度
      * @param residue 剩余可用额度

     */
    private Long residue;

}